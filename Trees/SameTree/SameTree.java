package InterviewPrep.Trees.SameTree;

import InterviewPrep.Trees.Node;

public class SameTree {
    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
