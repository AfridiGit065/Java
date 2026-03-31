package ClientServer;

import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderThread implements Runnable{
    ObjectInputStream ois;
    Thread t;
    ReaderThread(ObjectInputStream ois){
        this.ois = ois;
        t = new Thread(this);
        t.start();
    }


    @Override
    public void run() {
        while(true) {
            try {
                Object fromServer = ois.readObject();
                System.out.println("From Server: " + (String) fromServer);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
