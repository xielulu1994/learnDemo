package myclient;

import java.io.IOException;
import java.util.Vector;

/**
 * Created by lucas on 2018/8/3.
 */
public class ChatManager {
    private ChatManager(){}
    private static final ChatManager chatManager = new ChatManager();
    public static ChatManager getChatManager(){
        return  chatManager;
    }

    Vector<ChatSocket> v = new Vector<ChatSocket>();
    public void add(ChatSocket c){
        v.add(c);
    }
    public void publish(ChatSocket c,String o) throws IOException {
        for (int i=0;i<v.size();i++){
            ChatSocket chatSocket = v.get(i);
            if (!c.equals(chatSocket)){
                chatSocket.out(o);
            }
        }
    }
}
