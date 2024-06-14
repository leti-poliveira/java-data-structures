package edu.java.DataStructure;

public class BST {

    public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Node currentNode = root;
        while (true) {
            if (value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = new Node(value);
                    return;
                }
                currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                if (currentNode.right == null) {
                    currentNode.right = new Node(value);
                    return;
                }
                currentNode = currentNode.right;
            } else {
                return; // Valor já existe na árvore, não fazemos nada
            }
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(Node root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;

        if (value > root.value) {
            return contains(root.right, value);
        } else {
            return contains(root.left, value);
        }
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void deleteNode(int value) {
        root = deleteNode(root, value);
    }

    private Node deleteNode(Node root, int value) {
        if (root == null) return root;

        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            // Caso 1: Nó folha
            if (root.left == null && root.right == null) {
                return null;
            }
            // Caso 2: Nó com um filho
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Caso 3: Nó com dois filhos
            else {
                int minValue = minValue(root.right);
                root.value = minValue;
                root.right = deleteNode(root.right, minValue);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(2);
        tree.insert(66);
        tree.insert(3);

        tree.deleteNode(66);
        tree.inOrder();
    }
}
