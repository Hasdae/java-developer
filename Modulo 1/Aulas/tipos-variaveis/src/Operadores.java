public class Operadores {
    public static void main(String[] args) {
        int modulo = 18 % 4;
        System.out.println(modulo);
        int numero = 5;
        numero = -numero;
        System.out.println(numero++); // incrementa a variavel numero com +1 porém realiza essa operação após a impressão
        System.out.println(numero); // impressão do número atualizado
        System.out.println(++ numero); // incrementa a variavel com +1 antes da impressão, imprimindo o valor atualizado

        boolean isTrue = true;
        System.out.println(!isTrue); // usando o operador unário ! para inverter o valor da variável
        System.out.println(isTrue); // o operador não atribui novo valor para a variável

        /* Operador ternário representado por ?: onde "?" é o resultado apresentado mediante a condição ser verdadeira
         * e ":" é o resultado apresentado mediante a condição ser falsa
         */
         int a = 5;
         int b = 6;
         String resultado;
         if (a == b){ resultado = "verdadeiro";} else {resultado = "falso";}
         System.out.println(resultado);
        // A mesma expressão pode ser feita usando o operador ternário
        resultado = a==b ? "Verdadeiro" : "falso";
        System.out.println(resultado);

        // Condições E e OU são representadas por && e || respectivamente
        boolean verdadeiroUm = true;
        boolean verdadeiroDois = false;
        if (verdadeiroUm && verdadeiroDois){
            System.out.println("1 - As duas condições são verdadeiras");
        }
        if (verdadeiroUm || verdadeiroDois){
            System.out.println("2 - Uma das condições é verdadeira");
        }
        if (verdadeiroUm == true && verdadeiroDois == false){
            System.out.println("3 - A primeira condição é verdadeira e a segunda é falsa");
        }
        if (verdadeiroUm && (7 > 6)){
            System.out.println("4 - OK");
        }

        System.out.println("______________________________________");
        int numeroRepeticao = 0;
        int i = 0;
        for (i= 0; i < 5; i++){
            numeroRepeticao += 2;
            System.out.println(numeroRepeticao);
        }
    }
}
