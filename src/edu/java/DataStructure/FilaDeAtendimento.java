package edu.java.DataStructure;

import java.util.Random;

public class FilaDeAtendimento {
    
    public static void main(String[] args) {
        
        int n = 5;
        var random = new Random();
        int cliente = random.nextInt(101);
        QueueFila queue = new QueueFila(cliente);
        System.out.println("Chegou o cliente: " + cliente);
        
        // Simula a chegada dos clientes
        for (int i = 2; i <= n; i++) {
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente: " + cliente);
            queue.enqueue(cliente);
        }
        
        var node = queue.dequeue();
        while (node != null) {
            System.out.println("Atendido o cliente: " + node.getValue());
            node = queue.dequeue();
        }
    }
}

class QueueFila {
    private Node first;
    private Node last;
    
    public class Node {
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
        
        public int getValue() {
            return value;
        }
    }
    
    public QueueFila(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
    }
    
    public void enqueue(int value) {
        Node newNode = new Node(value);
        
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }
    
    public Node dequeue() {
        if (first == null) return null;
        
        Node temp = first;
        first = first.next;
        
        if (first == null) last = null;
        
        return temp;
    }
}





/*Este código simula um sistema de atendimento em que os clientes chegam em momentos aleatórios.
 Ele cria uma fila de atendimento (implementada como uma fila encadeada) e adiciona os clientes à
  medida que chegam. Então, atende cada cliente na ordem em que eles chegaram, removendo-os da fila
   de atendimento. A ideia é mostrar como as estruturas de dados podem ser usadas para modelar sistemas
    do mundo real, como filas de atendimento em estabelecimentos comerciais. */