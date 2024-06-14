package edu.java.DataStructure;

public class InverterPilhas {

    public static void main(String[] args) {
        int[] numeros = {5, 4, 3, 2, 1}; // Array de números
        inverter(numeros); // Chama a função para inverter a pilha
    }

    // Função para inverter a pilha
    private static void inverter(int[] numeros) {
        StackedPilha stack = new StackedPilha(numeros[0]); // Cria uma pilha com o primeiro elemento do array

        // Preenche a pilha com os elementos restantes do array
        for (int i = 1; i < numeros.length; i++) {
            stack.push(numeros[i]);
        }

        // Desempilha e imprime os elementos da pilha
        StackedPilha.Node node = stack.pop();
        while (node != null) {
            System.out.println(node.value);
            node = stack.pop();
        }
    }
}

// Classe para implementar a pilha
class StackedPilha {
    private Node top; // Referência para o topo da pilha
    private int height; // Altura da pilha

    // Classe interna para representar os nós da pilha
    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Construtor para inicializar a pilha com um valor
    public StackedPilha(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    // Método para adicionar um novo elemento no topo da pilha
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

    // Método para remover e retornar o elemento do topo da pilha
    public Node pop() {
        if (height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
}

/*Agora, vamos explicar como o código funciona:

Main Method (main):

Cria um array de inteiros chamado numeros.
Chama a função inverter passando esse array como argumento.
Função inverter (inverter):

Recebe um array de inteiros como entrada.
Cria uma instância da classe StackedPilha com o primeiro elemento do array.
Preenche a pilha com os elementos restantes do array.
Desempilha e imprime os elementos da pilha, invertendo a ordem em que foram adicionados.
Classe StackedPilha (StackedPilha):

Representa uma pilha de inteiros.
Possui uma classe interna Node para representar os nós da pilha.
Oferece métodos para adicionar (push) e remover (pop) elementos da pilha.
Basicamente, o programa cria uma pilha com os elementos do array na ordem inversa à
 sua posição no array e, em seguida, imprime esses elementos, invertendo a ordem novamente,
  efetivamente invertendo a ordem original dos elementos do array.


Pra que serve isso na prática?

Vamos usar uma analogia para entender como isso pode ser útil na prática.

Imagine que você tem uma pilha de pratos em sua cozinha. Os pratos são empilhados
 uns sobre os outros, e o último prato colocado é o primeiro a ser retirado, seguindo a 
 lógica de uma pilha.

Agora, digamos que alguém tenha organizado os pratos na pilha de forma inversa, de modo 
que o último prato colocado é o que você precisa pegar primeiro. Isso seria um pouco 
inconveniente, certo?

Bem, o código acima resolve exatamente esse problema. Ele é como uma mão mágica que pega
 cada prato da pilha, um por um, e coloca-os em uma nova pilha, mas na ordem correta, 
 de modo que o primeiro prato colocado é o primeiro a ser retirado.

Da mesma forma, o código pega os números que foram organizados de forma inversa em um
 array e os coloca em uma nova "pilha", mas na ordem correta, de modo que o primeiro
  número colocado no array é o primeiro a ser retirado.

Então, na prática, esse código pode ser útil quando você tem uma coleção de dados
 organizados de trás para frente e precisa revertê-los para acessá-los ou processá-los 
 na ordem correta. */