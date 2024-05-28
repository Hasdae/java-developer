public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 0 ; i < 5 ; i++){
            if (i == 2){
                break; // encerra o for caso i seja igual a 2
            }   
            System.out.println(i);
        }
        System.out.println("____________________________");
        for (int i = 0 ; i < 5 ; i++){
            if (i == 2){
                continue; // continua para a próxima repetição caso i seja igual a 2
            }   
            System.out.println(i);
        }

    }
    
}
