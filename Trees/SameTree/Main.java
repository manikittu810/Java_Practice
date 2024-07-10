package InterviewPrep.Trees.SameTree;

import InterviewPrep.Trees.Node;
import InterviewPrep.Trees.SameTree.SameTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Number of nodes in the first tree
            int m = sc.nextInt(); // Number of nodes in the second tree

            int[] a = new int[n];
            int[] b = new int[m];

            for (int j = 0; j < n; j++) {
                if (sc.hasNextInt()) {
                    a[j] = sc.nextInt();
                } else {
                    a[j] = Integer.MIN_VALUE; // Use a special value to indicate a null node
                    sc.next(); // Consume the non-integer token (e.g., "null")
                }
            }
            for (int k = 0; k < m; k++) {
                if (sc.hasNextInt()) {
                    b[k] = sc.nextInt();
                } else {
                    b[k] = Integer.MIN_VALUE; // Use a special value to indicate a null node
                    sc.next(); // Consume the non-integer token (e.g., "null")
                }
            }

            Node tree1 = buildTree(a,0);
            Node tree2 = buildTree(b,0);

            SameTree obj = new SameTree();
            boolean result = obj.isSameTree(tree1, tree2);
            System.out.println(result ? "Yes" : "No");
        }
        sc.close();
    }

    private static Node buildTree(int[] arr,int idx) {
        if (idx >= arr.length || arr[idx] == Integer.MIN_VALUE) {
            return null;
        }
        Node node = new Node(arr[idx]);
        node.left = buildTree(arr, 2 * idx + 1);
        node.right = buildTree(arr, 2 * idx + 2);
        return node;
    }
}
