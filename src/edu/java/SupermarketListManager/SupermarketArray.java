package edu.java.SupermarketListManager;

public class SupermarketArray implements Supermarket {
    private String[] items;  // Declaração do array de itens
    private int lastIndex;   // Índice do último item adicionado

    public SupermarketArray(int size) {
        items = new String[size];  // Inicializa o array com o tamanho fornecido
        lastIndex = -1;           // Inicializa o índice como -1 (lista vazia)
    }

    @Override
    public void add(String item) {
        if (lastIndex == items.length - 1) {
            System.err.println("Lista de supermercado cheia");
        } else {
            lastIndex++;
            items[lastIndex] = item;
        }
    }

    @Override
    public void print() {
        System.out.println("############");
        if (lastIndex < 0) {
            System.out.println("Lista de supermercado vazia");
        } else {
            for (int i = 0; i <= lastIndex; i++) {
                System.out.println(items[i]);
            }
        }
    }

    @Override
    public void deletar(int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Índice inválido");
        }
    }

    private void shift(int index) {
        for (int i = index; i < lastIndex; i++) {
            items[i] = items[i + 1];
        }
        items[lastIndex] = null; // Opcional: Limpa o último item
    }
}
