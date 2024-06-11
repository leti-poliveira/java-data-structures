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


/*Este código Java implementa uma pilha (stack) usando uma estrutura de dados
 baseada em nós (nodes). Uma pilha é uma estrutura de dados linear que segue a 
 abordagem LIFO (Last In, First Out), o que significa que o último elemento inserido é o primeiro a ser removido.

Aqui está uma explicação detalhada de cada parte do código:

PilhaStacked (Classe):

Esta é a classe principal que define a pilha.
Possui dois atributos: top (o nó do topo da pilha) e height (a altura atual da pilha).
Inclui um método construtor para inicializar a pilha com um valor.
main (Método):

Este é o ponto de entrada do programa.
Cria uma instância da classe PilhaStacked.
Empilha um valor na pilha.
Desempilha um valor da pilha e imprime o valor removido, ou imprime "Pilha Vazia" 
se a pilha estiver vazia.
Repete o processo anterior.
PilhaStacked(int value) (Método Construtor):

Este é o construtor da classe PilhaStacked.
Cria um novo nó com o valor fornecido e define-o como o topo da pilha.
Inicializa a altura da pilha como 1.
push(int value) (Método):

Este método adiciona um novo elemento à pilha.
Cria um novo nó com o valor fornecido.
Se a pilha estiver vazia, define o novo nó como o topo da pilha.
Caso contrário, o novo nó é ligado ao nó atual do topo e, em seguida, o topo é
 atualizado para o novo nó.
A altura da pilha é incrementada.
pop() (Método):

Este método remove o elemento do topo da pilha e o retorna.
Se a pilha estiver vazia, retorna null.
Caso contrário, o nó do topo é removido, o próximo nó se torna o topo e a altura 
da pilha é decrementada.
O nó removido é retornado.
Node (Classe Interna):

Esta classe define os nós individuais que compõem a pilha.
Cada nó possui um valor inteiro e uma referência ao próximo nó na pilha.
Em resumo, este código implementa uma pilha usando uma estrutura de dados baseada em nós,
 permitindo adicionar elementos no topo e removê-los do topo seguindo a lógica LIFO.
Ele fornece operações básicas de empilhamento (push) e desempilhamento (pop), além 
de imprimir elementos removidos ou informar se a pilha está vazia. */