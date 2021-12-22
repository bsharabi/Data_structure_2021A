package L07;

public class BTree {

    public static void main(String[] args) {
        BTree bt = new BTree(17);
        bt.root.setLeft(new BinNode(36));
        bt.root.getLeft().setLeft(new BinNode(12));
        bt.inOrder();

    }

    public BinNode root;

    public BTree() {
        this.root = null;
    }

    public BTree(int rootValue) {
        this.root = new BinNode(rootValue);
    }

    private void inOrder() {
        inOrder(root);
    }

    private void inOrder(BinNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.printf("%d ", root.getValue());
            inOrder(root.getRight());
        }
    }

}
