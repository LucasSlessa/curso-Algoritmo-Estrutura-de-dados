package Aula3;

public class Elemento {

    private String valor;
    private String proximo;

    public Elemento(String novoValor) {
        this.valor = novoValor;

    }

    public String getProximo() {
        return proximo;
    }

    public void setProximo(Elemento novoElemento) {
        this.proximo = proximo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}