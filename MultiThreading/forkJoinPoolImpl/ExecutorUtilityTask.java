package InterviewPrep.MultiThreading.forkJoinPoolImpl;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ExecutorUtilityTask {
    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> futureObj = pool.submit(new ComputeTask(0,100));
        try{
            System.out.println("result is :" + futureObj.get());
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
class ComputeTask extends RecursiveTask<Integer>{
    private final int start;
    private final int end;
    ComputeTask(int start, int end){
        this.start= start;
        this.end=end;
    }
    @Override
    protected Integer compute(){
        if(end - start <= 4){
            int totalSum =0;
            for(int i=start;i<=end;i++){
                totalSum+=i;
            }
            return totalSum;
        }
        else{
            int mid = (start+end)/2;

            ComputeTask leftSubTask = new ComputeTask(start,mid);
            ComputeTask rightSubTask = new ComputeTask(mid+1,end);

            leftSubTask.fork();
            rightSubTask.fork();

            int leftSum = leftSubTask.join();
            int rightSum = rightSubTask.join();

            return leftSum+rightSum;
        }
    }
}