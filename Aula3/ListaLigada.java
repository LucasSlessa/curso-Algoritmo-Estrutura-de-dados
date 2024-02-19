package Aula3;

public class ListaLigada {

    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    // construtor
    public ListaLigada() {
        this.tamanho = 0;
    }

    // getters and setters
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    // metodos da lista

    public void adicionar(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
            this.tamanho++;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
            this.tamanho++;
        }

    }

    public void remover(String novoValor) {

    }

    public Elemento get(int posição) {
        return null;

    }

}
