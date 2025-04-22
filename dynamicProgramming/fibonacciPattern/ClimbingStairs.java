package InterviewPrep.dynamicProgramming.fibonacciPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClimbingStairs {
    private final Map<Integer,Integer> cache = new HashMap<>();
    public int numberOfWays(int n){
        if(n<=1){
            return 1;
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        int res = numberOfWays(n-1)+numberOfWays(n-2);
        cache.put(n,res);
        return res;

    }
}
class TestStairs{
    public static void main(String[] args) {
        ClimbingStairs obj = new ClimbingStairs();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(obj.numberOfWays(n));
        }
        sc.close();
    }
}