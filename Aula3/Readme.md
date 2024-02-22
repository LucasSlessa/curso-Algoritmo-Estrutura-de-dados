# Implementação de Lista Ligada em Java

## Introdução

Nesta aula, vamos aprender a implementar uma estrutura de dados fundamental em programação: a lista ligada. Diferente de arrays ou listas contíguas, as listas ligadas oferecem flexibilidade na inserção e remoção de elementos, pois não requerem realocação de outros elementos. Ao final desta aula, você terá uma compreensão sólida sobre como listas ligadas funcionam e como implementá-las.

## Definição

Uma lista ligada é uma estrutura de dados em que cada elemento (nó) contém uma referência (ligação) para o próximo elemento na sequência. Uma variação, a lista duplamente ligada, permite navegação tanto para frente quanto para trás. Seria mais correto dizer que uma lista ligada permite inserções e remoções eficientes sem a necessidade de realocação ou reorganização de toda a estrutura, ao contrário de um array ou lista contígua.

### Vantagens das Listas Ligadas:

- **Flexibilidade**: Facilidade para adicionar ou remover elementos sem a necessidade de reorganizar toda a estrutura.
- **Eficiência em Operações Específicas**: Inserção e remoção são mais eficientes em comparação com arrays, especialmente em posições intermediárias da lista.

## Parte 1: Estrutura Básica

Vamos começar criando as classes fundamentais para nossa lista ligada: `Elemento`, `ListaLigada` e um `Programa` de teste.

### Classe `Elemento`

A classe `Elemento` representa cada nó (ou célula) da nossa lista ligada. Cada elemento armazena um valor e uma referência para o próximo elemento na lista.

```java
public class Elemento {
    public int valor;
    public Elemento proximo;

    public Elemento(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
```

Atributos:
valor: O dado armazenado no elemento.
proximo: A referência para o próximo Elemento na lista.


### Classe `ListaLigada`
classe ListaLigada será a estrutura que organiza os `Elementos`. Ela deve ser capaz de adicionar elementos, remover elementos e fornecer acesso a eles.

```java

ppackage Aula3;

public class ListaLigada {

    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    // construtor
    public ListaLigada() {
        this.tamanho = 0;
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

    public Elemento get(int posição) {
        Elemento atual = this.primeiro;

        for(int i=0; i < posição; i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }

        }
        return atual;

    }

    public void remover(String valorProcurado) {
        Elemento anterior = null;
        Elemento atual = this.primeiro;
        for(int i=0; i<this.getTamanho();i++)   {
           
            if(atual.getValor().equalsIgnoreCase(valorProcurado)){
                if(atual == primeiro){  
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);

                }else if(atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }

                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
            
        } 

    }

}



```