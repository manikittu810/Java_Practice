package InterviewPrep.Trees.SymmetricTree;

import InterviewPrep.Trees.Node;

public class SymmetricTree {
    public boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
}
