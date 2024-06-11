package dataStructure;

//Lista encadeada: LinkedList

public class LinkedList {
    private Node head; // Referência para o primeiro nó da lista
    private Node tail; // Referência para o último nó da lista
    private int length; // Comprimento da lista

    // Construtor da classe LinkedList
    public LinkedList(String data) {
        length = 1;
        Node newNode = new Node(data);
        head = newNode; // O nó inicial também é o último neste caso
        tail = newNode;
    }

    // Método para obter o head da lista
    public void getHead() {
        if (this.head == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Head: " + head.data);
        }
    }

    // Método para obter o tail da lista
    public void getTail() {
        if (this.tail == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Tail: " + tail.data);
        }
    }

    // Método para obter o comprimento da lista
    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    // Método para esvaziar a lista
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    // Método para adicionar um novo elemento ao final da lista (Append)
    public void append(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; // Ligando o novo nó ao último nó
            tail = newNode; // Atualizando a referência para o último nó
        }
        length++; // Incrementando o comprimento da lista
    }

    // Método para remover o último elemento da lista
    public Node removeLast() {
        if (length == 0) return null;

        Node temp = tail;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node pre = head;
            while (pre.next != tail) {
                pre = pre.next;
            }
            tail = pre; // Atualizando a referência para o último nó
            tail.next = null;
        }

        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    // Método para adicionar um novo elemento ao início da lista (Prepend)
    public void prepend(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head; // Fazendo o novo nó apontar para o antigo primeiro nó
            head = newNode; // Atualizando a referência para o primeiro nó
        }
        length++; // Incrementando o comprimento da lista
    }

    // Método para remover o primeiro elemento da lista
    public Node removeFirst() {
        if (length == 0)  return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    // Método para obter o nó em uma posição específica na lista
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Método para definir o valor de um nó em uma posição específica na lista
    public boolean set(int index, String data) {
        Node temp = get(index);
        if (temp != null) {
            temp.data = data; // Atualizando o valor do nó
            return true;
        }
        return false;
    }

    // Método para inserir um novo elemento em uma posição específica na lista
    public boolean insert(int index, String data) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(data); // Adicionando no início
            return true;
        }
        if (index == length) {
            append(data); // Adicionando no final
            return true;
        }

        Node newNode = new Node(data);
        Node temp = get(index - 1); // Obtendo o nó anterior à posição de inserção
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    // Método para imprimir a lista
    public void print() {
        System.out.println("###########");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("###########");
    }

    // Classe interna Node
    private class Node {
        String data; // Valor armazenado no nó
        Node next; // Referência para o próximo nó

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Método para remover um nó em uma posição específica na lista
    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst(); // Remoção do primeiro nó
        if (index == length - 1) return removeLast(); // Remoção do último nó

        Node prev = get(index - 1); // Obtendo o nó anterior à posição de remoção
        Node temp = prev.next; // Nó a ser removido
        prev.next = temp.next; // Atualizando a referência do nó anterior
        temp.next = null; // Desconectando o nó removido
        length--;

        return temp;
    }

    // Método main para teste
    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.append("elemento 2");
        list.append("elemento 3");
        list.prepend("elemento 0");

        list.remove(2); // Removendo o elemento na posição 2 (índice 2)
        list.print(); // Imprimindo a lista atualizada
    }
}



/*Claro! Vamos entender este código usando uma analogia de uma lista de afazeres,
 onde cada item na lista é representado por um nó. Aqui está uma explicação simplificada:

LinkedList (Classe):

Esta é a classe principal que define uma lista encadeada.
Ela tem referências para o primeiro (head) e último (tail) elementos da lista, 
além de um contador de comprimento (length).
Oferece métodos para operar na lista, como adicionar, remover, obter elementos
 e imprimir a lista.
Node (Classe Interna):

Representa um item individual na lista.
Cada nó tem dois componentes: um campo de dados (que armazena o valor do item) e 
uma referência para o próximo nó na lista.
Construtor (LinkedList(String data)):

Ao criar uma nova lista, você pode adicionar o primeiro item, que se torna 
tanto a cabeça quanto o rabo da lista.
Métodos Principais:

append(String data): Adiciona um novo item ao final da lista.
prepend(String data): Adiciona um novo item no início da lista.
remove(int index): Remove o item na posição especificada na lista.
print(): Imprime todos os itens da lista.
Outros Métodos Úteis:

removeFirst(): Remove o primeiro item da lista.
removeLast(): Remove o último item da lista.
makeEmpty(): Esvazia toda a lista.
get(int index): Retorna o item na posição especificada na lista.
set(int index, String data): Atualiza o valor do item na posição especificada na lista.
Método main:

Neste método, criamos uma nova lista e adicionamos alguns itens.
Em seguida, removemos um item específico da lista.
Por fim, imprimimos a lista atualizada.
Em resumo, este código implementa uma lista encadeada, onde cada nó na 
lista armazena um valor e uma referência para o próximo nó. Você pode adicionar,
 remover, acessar e modificar itens na lista conforme necessário. */