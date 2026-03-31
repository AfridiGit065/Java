package ThreadDemo;


class Thread1  implements Runnable{
    Thread t;
    int threadNo;
    Thread1(int threadNo){
        t = new Thread(this);
        this.threadNo = threadNo;
        t.start();
    }
    @Override
    public void run() {
        for (int i = 1; i<=10;i++){
            System.out.println("thread:"+threadNo+" : "+i);
            try {
               Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("child thread "+threadNo+" exited..");
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        System.out.println("Main thread started..");
        Thread1 ob1 = new Thread1 (1);
        Thread1 ob2 = new Thread1(2);
        System.out.println(ob1.t.isAlive());
        System.out.println(ob2.t.isAlive());
//        new Thread1(3);
        try {
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main Thread is exited..");
    }
}
