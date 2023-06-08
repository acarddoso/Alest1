package T2;

public class ListaSinalizacao {
    private int quantidade;
    private Logradouro inicio;
    private Logradouro fim;


    public ListaSinalizacao(Logradouro inicio, Logradouro fim){
        inicio = new Logradouro(null,null);
        fim = new Logradouro(null,null);
        this.quantidade = 0;
    }


    public void adicionarSinalizacao(Logradouro novoLogradouro) {

        if (this.estaVazia()) {
            this.inicio = novoLogradouro;
            this.fim = novoLogradouro;

        }else {
            this.fim.proximo = novoLogradouro;
            this.fim = novoLogradouro;
        }
        quantidade++;
    }

    public boolean estaVazia() {
        return (this.quantidade==0);
    }

    public void esvaziar(){
        this.inicio=null;
        this.fim = null;
        this.quantidade=0;
    }
    public void removerSinalizacao(int posicao){
        if (posicao==0){
            this.inicio = inicio.proximo;
        }
        else {
            Logradouro aux = this.inicio;
            Logradouro anterior= aux;
            for (int i=0; i< posicao;i++){
                anterior=aux;
                aux = aux.proximo;
            }
            anterior.proximo = aux.proximo;
            if (aux.proximo!=null){
                this.fim = anterior;
            }
        }
    }
}
