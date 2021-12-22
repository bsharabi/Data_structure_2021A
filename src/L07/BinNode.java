package L07;

public class BinNode{
    private int value;
    public BinNode left;
    public BinNode right;

    public BinNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinNode(BinNode left, int value, BinNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinNode getLeft() {
        return this.left;
    }

    public BinNode getRight() {
        return this.right;
    }

    public void setLeft(BinNode left) {
        this.left = left;
    }

    public void setRight(BinNode right) {
        this.right = right;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

    public boolean hasRight() {
        return this.right != null;
    }

    public String toString() {
        return " " + this.value;
    }
}



