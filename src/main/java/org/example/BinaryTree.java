package org.example;

public class BinaryTree {
    private Node root;

    public BinaryTree () {
        this.root = null;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }

    public void insertNode(int val) {
        root = insertRec(root, val);
    }

    public Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        } else if (value < root.getValue()) {
            root.setLeft(insertRec(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insertRec(root.getRight(), value));
        }
        return root;
    }

    public void inorder() {
        inoderRec(root);
    }

    public void inoderRec(Node root) {
        if (root != null) {
            inoderRec(root.getLeft());
            System.out.println(root.getValue());
            inoderRec(root.getRight());
        }
    }
}
