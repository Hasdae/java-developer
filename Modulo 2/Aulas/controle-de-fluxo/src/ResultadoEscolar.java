public class ResultadoEscolar {
    public static void main(String[] args) {
    double nota = 4;    
    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado"; // condição ternária
    System.out.println(resultado);
    
    }
    
}
