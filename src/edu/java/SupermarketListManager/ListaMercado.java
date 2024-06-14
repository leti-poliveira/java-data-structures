package edu.java.SupermarketListManager;

public class ListaMercado {
    public static void main(String[] args) {
        // Criar uma lista de supermercado com tamanho 5
        Supermarket supermarketList = new SupermarketArray(5);

        // Adicionar itens à lista
        supermarketList.add("Maçãs");
        supermarketList.add("Bananas");
        supermarketList.add("Leite");
        supermarketList.add("Pão");
        supermarketList.add("Ovos");

        // Tentar adicionar mais um item à lista cheia
        supermarketList.add("Queijo");

        // Imprimir a lista de supermercado
        System.out.println("Lista de supermercado:");
        supermarketList.print();

        // Deletar um item da lista pelo índice
        supermarketList.deletar(2);

        // Imprimir a lista novamente após a exclusão
        System.out.println("Lista de supermercado após deletar o item no índice 2:");
        supermarketList.print();
    }
}
