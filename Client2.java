package ThreadDemo;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread"+ t);
        t.setName("My Thread");
        System.out.println("New Thread name: "+ t.getName());
        for (int i = 1; i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
