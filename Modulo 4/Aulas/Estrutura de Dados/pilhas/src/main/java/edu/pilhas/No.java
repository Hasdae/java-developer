package edu.pilhas;

public class No {
    private int dado;
    private No refNo; //referencia do nó

    public No(){} //construtor vazio padrão
    public No (int dado){
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
