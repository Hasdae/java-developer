package edu.filas;

public class MainFila {
    public static void main(String[] args) {
        Fila novaFila = new Fila();
        novaFila.enqueue(new No("primeiro")); //Adiciona um objeto à fila
        novaFila.enqueue(new No("segundo"));
        novaFila.enqueue(new No("terceiro"));
        novaFila.enqueue(new No("quarto"));
        novaFila.dequeue(); //remove o primeiro objeto da fila, seguindo o padrao FIFO (First in First out)

        System.out.println(novaFila);
        System.out.println(novaFila.first()); // Exibe o primeiro objeto na fila, que é o objeto "segundo" ja que o objeto "primeiro" foi excluido pelo método dequeue
    }
}
