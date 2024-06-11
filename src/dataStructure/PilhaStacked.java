package dataStructure;

public class PilhaStacked {
    private Node top;
    private int height;

    public static void main(String[] args) {
        PilhaStacked myStack = new PilhaStacked(2);
        myStack.push(1);

        PilhaStacked.Node node = myStack.pop();
        if (node != null) {
            System.out.println("Elemento removido: " + node.value);
        } else {
            System.out.println("Pilha Vazia");
        }

        node = myStack.pop();
        if (node != null) {
            System.out.println("Elemento removido: " + node.value);
        } else {
            System.out.println("Pilha Vazia");
        }
    }

    public PilhaStacked(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if (height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
