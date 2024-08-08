package InterviewPrep.NAryTreeImpl;

import java.util.*;

public class Node {
    public int val;
    public List<Node> children;
    public Node(int val){
        this.val = val;
        children = new ArrayList<>();
    }
}

class PreOrderTraversal{
    public List<Integer> preOrder(Node root){
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        helper(root,ans);
        return ans;
    }
    public void helper(Node root, List<Integer> ans){
        if(root == null){
            return ;
        }
        ans.add(root.val);
        for(Node child : root.children){
            helper(child,ans);
        }
    }
}

class PostOrder{
    public List<Integer> postOrder(Node root){
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return null;
        }
        helper(root,ans);
        return ans;
    }
    public void helper(Node root, List<Integer> ans){
        if(root == null){
            return ;
        }
        for(Node child : root.children){
            helper(child,ans);
        }
        ans.add(root.val);
    }
}

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//no. of test cases
        for(int i=0;i<t;i++){
        int n = sc.nextInt();
            int [] values = new int[n];
            for(int j=0;j<n;j++){
                values[j] =sc.nextInt();//Inputting Node values
            }
            Map<Integer,Node> nodeMap = new HashMap<>();
            for(int value : values){
                nodeMap.put(value,new Node(value));
            }

            int rootValue  = sc.nextInt(); // declaring a root of Nary tree
            Node root = nodeMap.get(rootValue);//

            int edges = sc.nextInt();
            for(int k=0;k<edges;k++){
                int parent = sc.nextInt();
                int child = sc.nextInt();
                nodeMap.get(parent).children.add(nodeMap.get(child)); // understand this statementt
            }
            PreOrderTraversal obj1 = new PreOrderTraversal();
            List<Integer> preOrderResult = obj1.preOrder(root);
            System.out.println("Pre-Order : " +preOrderResult );

            PostOrder obj2 = new PostOrder();
            List<Integer> postOrderResult = obj2.postOrder(root);
            System.out.println("Post-Order : " + postOrderResult);

        }
    }
}