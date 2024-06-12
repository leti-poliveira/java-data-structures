package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public boolean isLeaf(Node node) {
        return (node.left != null) && (node.right == null);
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    queue.add(currentNode.left);
                }
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }
            }
        }
    }


    public void preOrder() {
        preOrder(root);
        
        }
        
        private void preOrder(final Node node) {
        if (node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);

        
        
        }




    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(37);
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);
        

        System.out.println("###############");
        tree.preOrder();
     System.out.println("###############");
    }
}


      /*   O código acima implementa uma estrutura de dados chamada "árvore binária" em Java.
       Uma árvore binária é uma estrutura de dados hierárquica em que cada nó tem no máximo dois 
       filhos, geralmente chamados de filho esquerdo e filho direito.

A principal função desse código é criar uma árvore binária e permitir a inserção de novos elementos 
nela. Além disso, ele possui um método para percorrer a árvore em pré-ordem e imprimir os valores dos nós 
visitados.

Essa estrutura de dados é útil em diversas situações, como para representar hierarquias de dados em 
computação, realizar buscas eficientes, construir algoritmos de ordenação e realizar operações de conjunto,
 entre outras aplicações.

*/
