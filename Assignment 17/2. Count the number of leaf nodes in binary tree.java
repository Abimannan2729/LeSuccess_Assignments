class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LeafNodeCounter {

    public int countLeafNodes(Node root) {
        return helper(root);
    }

    private int helper(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return helper(root.left) + helper(root.right);
    }

    public static void main(String[] args) {
   
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        LeafNodeCounter counter = new LeafNodeCounter();
        int leafCount = counter.countLeafNodes(root);

        System.out.println("Number of leaf nodes: " + leafCount);
    }
}
