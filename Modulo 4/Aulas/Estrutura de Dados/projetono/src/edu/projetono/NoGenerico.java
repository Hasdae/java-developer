package edu.projetono;
//Criação de classe Nó genérica que aceitará qualquer tipo de entrada, não somente String
public class NoGenerico<T> {
    private T conteudo; //
    private NoGenerico<T> proximoNo;

    public NoGenerico(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoGenerico getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoGenerico<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
