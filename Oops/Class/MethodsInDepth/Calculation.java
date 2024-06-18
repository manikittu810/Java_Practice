package InterviewPrep.Oops.Class.MethodsInDepth;

public class Calculation {
//    private static int sum(int val1,int val2)throws ArithmeticException{
//        int tSum = val1+val2;
//        System.out.println("totalSum = " + tSum);
//        return tSum;
//    }
//    private static int ageSum(int val1,int val2){
//        int tSum = sum(val1,val2);
//        return tSum;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b=sc.nextInt();
//        ageSum(a,b);
//    }

    static int carPrice = 50;
    public static int sum(int a, int b){
        int total = a+b;
        return total;
    }

    public  int sum2(int a, int b){
        int total = a+b;
        carPrice=carPrice+total;
        return carPrice;//here it is changing the state of the object,
        //so it should not be decalred as static, as carPrice is changing to 53 if a 2, b=1
    }

}
