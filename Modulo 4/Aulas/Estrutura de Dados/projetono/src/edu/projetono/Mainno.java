package edu.projetono;

public class Mainno {
    public static void main(String[] args) {
        No no1 = new No("Conteudo no1");
        No no2 = new No("Conteudo no2");
        no1.setProximoNo(no2);
        No no3 = new No("Conteudo no3");

        no2.setProximoNo(no3);

        No no4 = new No("Conteudo no4");
        no3.setProximoNo(no4);

        //Nó 1 aponta para nó 2, que aponta para nó 3, que aponta para nó 4. Após o ultimo nó referenciado, o valor retornará nulo

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);
        System.out.println("__________________________");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        System.out.println("__________________________");
        //NoGenerico foi criado como uma classe genérica que pode receber qualquer tipo de valor, mas para fazer encadeamento da mesma forma que foi feito acima é necessario que os valores sejam do mesmo tipo
        NoGenerico<String> noGenerico1 = new NoGenerico<>("No Generico 1");
        NoGenerico<String> noGenerico2 = new NoGenerico<>("No Generico 2");
        NoGenerico<String> noGenerico3 = new NoGenerico<>("No Generico 3");
        NoGenerico<String> noGenerico4 = new NoGenerico<>("No Generico 4");
        noGenerico1.setProximoNo(noGenerico2);
        noGenerico2.setProximoNo(noGenerico3);
        noGenerico3.setProximoNo(noGenerico4);
        System.out.println(noGenerico1);
        System.out.println(noGenerico1.getProximoNo());
        System.out.println(noGenerico1.getProximoNo().getProximoNo());
        System.out.println(noGenerico1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(noGenerico1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
