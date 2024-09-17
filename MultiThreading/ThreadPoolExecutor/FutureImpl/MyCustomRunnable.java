package InterviewPrep.MultiThreading.ThreadPoolExecutor.FutureImpl;


import java.util.List;

public class MyCustomRunnable implements Runnable {
    List<Integer> list;
    MyCustomRunnable(List<Integer> list){
        this.list = list;
    }

    @Override
    public void run(){
        list.add(300);
    }

}
