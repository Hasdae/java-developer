public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("123456789"); // como a função lança uma exceção é necessario ter o throws exception na main ou utilizar o try/catch ao redor da função
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep deve contar 8 dígitos");
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8){
            throw new CepInvalidoException();
        }
        //simulando cep formatado
        return "11.111-000";
    }    

}