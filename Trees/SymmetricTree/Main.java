package InterviewPrep.Trees.SymmetricTree;

import InterviewPrep.Trees.Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Number of nodes in the tree
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                if (sc.hasNextInt()) {
                    a[j] = sc.nextInt();
                } else {
                    a[j] = Integer.MIN_VALUE; // Use a special value to indicate a null node
                    sc.next(); // Consume the non-integer token (e.g., "null")
                }
            }

            Node tree = buildTree(a, 0);
            SymmetricTree obj = new SymmetricTree();
            boolean result = obj.isSymmetric(tree);
            System.out.println(result ? "Yes" : "No");
        }
        sc.close();
    }

    public static Node buildTree(int[] arr, int idx) {
        if (idx >= arr.length || arr[idx] == Integer.MIN_VALUE) {
            return null;
        }
        Node node = new Node(arr[idx]);
        node.left = buildTree(arr, 2 * idx + 1);
        node.right = buildTree(arr, 2 * idx + 2);
        return node;
    }
}
