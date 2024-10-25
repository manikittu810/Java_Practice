package InterviewPrep.MultiThreading.threadLocal;

public class ThreadLocalImpl {
    public static void main(String[] args) {
        ThreadLocal<String > threadLocal = new ThreadLocal<>();

        threadLocal.set(Thread.currentThread().getName());

        Thread t1 = new Thread(()->{
            threadLocal.set(Thread.currentThread().getName());
            System.out.println("Task1");
        });
        t1.start();
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main Thread : " + threadLocal.get());
    }
}
