public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        System.out.println("intA = "+intA+" e intB = "+intB);

        intA = 2;
        System.out.println("intA = "+intA+" e intB = "+intB); // O valor de intB permanece inalterado

        Obj objetoA = new Obj(1);
        Obj objetoB = objetoA;
        System.out.println("objetoA = "+objetoA+" e objetoB = "+objetoB);

        objetoA.setNum(2);
        System.out.println("objetoA = "+objetoA+" e objetoB = "+objetoB); // o valor de objetoB altera junto com o valor de objetoA, pois quando se trata de objetos, o valor atribuído à variável é uma referência da memória daquele objeto
    }
}
