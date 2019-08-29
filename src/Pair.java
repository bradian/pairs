public class Pair {
    private String left;
    private String right;

    public Pair(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left='" + left + '\'' +
                ", right='" + right + '\'' +
                '}';
    }
}
