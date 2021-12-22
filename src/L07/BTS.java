package L07;

public class BTS {

    private BinNode root;

    public BTS(int value) {
        this.root = new BinNode(value);
    }

    public BTS() {
        this.root = null;
    }

    public void add(int value) {
        this.root = add(root, value);
    }

    private BinNode add(BinNode root, int value) {
        if (root == null)
            return new BinNode(value);
        if (value < root.getValue())
            root.setLeft(add(root.getLeft(), value));
        else
            root.setRight(add(root.getRight(), value));

        return root;
    }

    public void inOrder() {
        inOrder(this.root);
    }

    private void inOrder(BinNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.printf("%d ", root.getValue());
            inOrder(root.getRight());
        }
    }
}
