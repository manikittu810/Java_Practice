package InterviewPrep.MultiThreading.examples;

public class ComputeSum {
    public static void main(String[] args) throws InterruptedException {
        SumExample.runTests();
    }
}

class SumExample{
    long startRange,endRange;
    long counter = 0;
   static  long max_val = Integer.MAX_VALUE;
    public SumExample(long startRange,long endRange){
        this.startRange =startRange;
        this.endRange = endRange;
    }

    public static  void runTests() throws InterruptedException {
        oneThread();
        twoThreads();
    }

    public static void oneThread(){
        long start = System.currentTimeMillis();
        SumExample s = new SumExample(1,max_val);
        s.add();
        long end = System.currentTimeMillis();
            System.out.println("Single Thread computation result : " + s.counter +" took " + (end-start) +"ms");
    }

    public static void twoThreads() throws InterruptedException{
        long start = System.currentTimeMillis();
        long half = max_val/2;
        SumExample s1 = new SumExample(1,half);
        SumExample s2 = new SumExample(half + 1, max_val);
        Thread t1 = new Thread(()-> { s1.add(); });
        Thread t2 = new Thread(()-> { s2.add(); });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        long finalCounter = s1.counter + s2.counter;
        long end = System.currentTimeMillis();
        System.out.println("Two Threads computation result : " + finalCounter +" took " + (end-start) +"ms");
    }

    public void add(){
        for(long i = startRange;i<=endRange;i++){
            counter += i;
        }
    }

}