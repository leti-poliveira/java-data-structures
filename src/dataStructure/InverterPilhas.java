package dataStructure;

public class InverterPilhas {

    public static void main(String[] args) {
        int[] numeros = {5, 4, 3, 2, 1};
        inverter(numeros);
    }

    private static void inverter(int[] numeros) {
        StackedPilha stack = new StackedPilha(numeros[0]);

        for (int i = 1; i < numeros.length; i++) {
            stack.push(numeros[i]);
        }

        StackedPilha.Node node = stack.pop();
        while (node != null) {
            System.out.println(node.value);
            node = stack.pop();
        }
    }
}

class StackedPilha {
    private Node top;
    private int height;

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public StackedPilha(int value) {
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
}
