package myclient;

import java.io.*;
import java.net.Socket;

/**
 * Created by lucas on 2018/8/3.
 */
public class ChatSocket extends Thread {
    Socket socket;
    public ChatSocket(Socket socket) {
        this.socket = socket;
    }
    public void out(String out) throws IOException {
        this.socket.getOutputStream().write(out.getBytes("utf-8"));
    }
    @Override
    public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream(), "utf-8"));
                String line = null;
                while ((line = bufferedReader.readLine()) !=null){
                    ChatManager.getChatManager().publish(this,line);
                 }
                 bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
