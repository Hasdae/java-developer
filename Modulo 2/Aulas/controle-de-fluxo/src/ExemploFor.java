public class ExemploFor {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i < 20 ; i++){ // Inicialização da função de repetição. Define variavel i com valor 0 ; para cada execução enquanto i < 20 incrementa +1
            contador++;
            System.out.println(contador);
        }

        String alunos[] = {"FELIPE", "GABRIEL", "VINICIUS", "LEANDRO"};
        for (int i = 0 ; i < alunos.length ; i++){ // Inicialização da função de repetição. Define varíavel i com valor de 0 ; para cada execução enquanto i < tamanho do array alunos incrementa +1
            System.out.println("Aluno no índice "+i+"= "+alunos[i]); // Utiliza a variável i para retornar a posição do array, uma vez que ela é igual a repetição pois todo array começa em 0.
        }

        for (String aluno : alunos){ // define uma variavel aluno que receberá o valor do índice para cada repetição E repete até que tenha percorrido todo o Array
            System.out.println("Nome do aluno é: "+aluno);
        }
    }
}
