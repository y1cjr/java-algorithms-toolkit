import java.util.Scanner;

class Node {
    int value, count;
    Node left, right;

    Node(int value) {
        this.value = value;
        this.count = 1;
    }
}

public class BinarySearchTree {
    static Node root = null;

    public static Node insert(Node node, int value) {
        if (node == null) return new Node(value);

        if (value == node.value) {
            node.count++;
        } else if (value < node.value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value + "(" + node.count + ") ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            root = insert(root, num);
        }

        inorder(root);
    }
}
