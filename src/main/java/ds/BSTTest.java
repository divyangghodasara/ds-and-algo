package ds;

public class BSTTest {
    public static void main(String[] args) {
        Tree<Integer> bst= new BST<>();
        bst.insert(3);
        bst.insert(1);
        bst.insert(2);
        bst.insert(4);
        System.out.println(bst.search(2));
    }
}
