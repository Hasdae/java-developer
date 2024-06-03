package edu.pilhas;

public class MainPilha {
    public static void main(String[] args) {
        Pilha novaPilha = new Pilha();
        No no1 = new No(1); // Criando variavel de Nó/Objeto para isnserir na pilha
        novaPilha.push(no1); // inserindo nó criado na pilha
        novaPilha.push(new No(2)); // Criando e inserindo novo nó, sem instanciar em variavel
        novaPilha.push(new No(3));
        novaPilha.push(new No(4));
        novaPilha.pop(); // remoção de Nó/Objeto da pilha LIFO (Last in first out) -- Último objeto a entrar é o primeiro a sair

        System.out.println(novaPilha);
        /* Resultado da execução. O ultimo objeto inserido é o objeto a ser retirado.
        ------------
        Pilha
        ------------
        [No{dado=3}]
        [No{dado=2}]
        [No{dado=1}]
        ============
         */

    }
}
