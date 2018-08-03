package myserver;

import myclient.ChatManager;
import myclient.ChatSocket;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lucas on 2018/8/3.
 */
public class ServerListener extends Thread {
    @Override
    public void run() {
        try {//1-65535
            ServerSocket serverSocket = new ServerSocket(12345);
            while (true){
                Socket socket = serverSocket.accept();
                JOptionPane.showMessageDialog(null, "建立连接");
                ChatSocket chatSocket = new ChatSocket(socket);
                chatSocket.start();
                ChatManager.getChatManager().add(chatSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
