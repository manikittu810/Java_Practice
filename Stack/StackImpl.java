package InterviewPrep.Stack;

import java.util.Scanner;

public class StackImpl{
    private int top;
    private final int MAX = 1000;
    private final int[] a;

    public StackImpl(){//once an object is created you get a top =-1 and a[MAX];
        this.top = -1;
        this.a = new int[MAX];
    }

    public boolean isFull(){
        return top>=MAX-1;
    }

    public boolean isEmpty(){
        return top < 0;
    }



    public int isPeek(){
        if(top>=0){
            return a[top];
        }
        else{
            return -1;
        }
    }


    public void push(int x){
        if(isFull()){
            System.out.println("“The Stack is full”");
        }
        else{
            a[++top] = x;//++top is because initially top =-1, so first increse it and store the ‘x’.
        }
    }

    public int pop(){
        int n;
        if(isEmpty()){return -1;}
        else{
            n = a[top];
            top--;
        }
        return n;
    }
}

class TestStack{
    public static void main(String[] args){
        StackImpl obj = new StackImpl();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            obj.push(1);
            obj.push(2);
            System.out.println(obj.isPeek());
            System.out.println(obj.pop());
            System.out.println(obj.isFull());
            System.out.println(obj.pop());

            System.out.println(obj.isEmpty());
        }
    }
}
//from line 63
//System.out.println("Enter number of operations:");
//        int t = sc.nextInt();
//
//        for (int i = 0; i < t; i++) {
//        System.out.println("Push value:");
//        int value = sc.nextInt();
//        stack.push(value);
//
//        System.out.println("Top element: " + stack.peek());
//        System.out.println("Is stack full? " + stack.isFull());
//        System.out.println("Is stack empty? " + stack.isEmpty());
//
//        // Optional: Pop the element and check the stack state
//        if (!stack.isEmpty()) {
//        System.out.println("Popped value: " + stack.pop());
//        } else {
//        System.out.println("Stack is empty, cannot pop.");
//        }
//        }
//
//        sc.close();