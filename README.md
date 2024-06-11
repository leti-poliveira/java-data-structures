# Lista Encadeada (LinkedList)

Este projeto implementa uma lista encadeada simples em Java. A lista encadeada é uma estrutura de dados onde cada elemento (nó) aponta para o próximo elemento na sequência.

## Estrutura do Projeto

O projeto consiste em uma classe principal `LinkedList` e uma classe interna `Node`.

### Classe LinkedList

A classe `LinkedList` contém os seguintes atributos e métodos:

#### Atributos

- `private Node head`: Referência para o primeiro nó da lista.
- `private Node tail`: Referência para o último nó da lista.
- `private int length`: Comprimento da lista.

#### Construtor

- `public LinkedList(String data)`: Inicializa uma nova lista com um único elemento.

#### Métodos

- `public void getHead()`: Exibe o valor do primeiro elemento da lista.
- `public void getTail()`: Exibe o valor do último elemento da lista.
- `public void getLength()`: Exibe o comprimento da lista.
- `public void makeEmpty()`: Esvazia a lista, removendo todos os elementos.
- `public void append(String data)`: Adiciona um novo elemento ao final da lista.
- `public Node removeLast()`: Remove e retorna o último elemento da lista.
- `public void prepend(String data)`: Adiciona um novo elemento ao início da lista.
- `public Node removeFirst()`: Remove e retorna o primeiro elemento da lista.
- `public Node get(int index)`: Retorna o elemento na posição especificada.
- `public boolean set(int index, String data)`: Atualiza o valor do elemento na posição especificada.
- `public boolean insert(int index, String data)`: Insere um novo elemento na posição especificada.
- `public Node remove(int index)`: Remove e retorna o elemento na posição especificada.
- `public void print()`: Exibe todos os elementos da lista.

### Classe Interna Node

A classe `Node` representa um único elemento da lista e contém os seguintes atributos:

- `String data`: Valor armazenado no nó.
- `Node next`: Referência para o próximo nó na lista.

### Método Main

O método `main` demonstra o uso da classe `LinkedList` através dos seguintes passos:

1. Cria uma nova lista encadeada com o elemento "elemento 1".
2. Adiciona "elemento 2" e "elemento 3" ao final da lista.
3. Adiciona "elemento 0" ao início da lista.
4. Remove o elemento na posição 2.
5. Exibe todos os elementos da lista.

### Exemplo de Uso

```java
public static void main(String[] args) {
    LinkedList list = new LinkedList("elemento 1");
    list.append("elemento 2");
    list.append("elemento 3");
    list.prepend("elemento 0");

    list.remove(2);
    list.print();
}



Este `README.md` fornece uma visão geral do projeto, explicando a estrutura da classe `LinkedList`, seus métodos e um exemplo de uso no método `main`.
