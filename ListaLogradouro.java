package T2;

import aula11_listasduplamenteencadeadas.ListaLinearDuplamenteEncadeada;

public class ListaLogradouro {
    private Logradouro inicio;
    private Logradouro fim;
    private int quantidade;

    public ListaLogradouro() {
        inicio=new Logradouro(null, null);
        fim= new Logradouro(null, null);
        quantidade=0;
    }

    public void adicionarLogradouro(Logradouro novoLogradouro) {
         if(quantidade==0) {
            inicio.proximo = novoLogradouro;
            fim.anterior = novoLogradouro;
            novoLogradouro.anterior = inicio;
            novoLogradouro.proximo = fim;
            quantidade++;
            return;
        }

        novoLogradouro.proximo = fim;
        novoLogradouro.anterior = fim.anterior;
        fim.anterior = novoLogradouro;
        novoLogradouro.anterior.proximo = novoLogradouro;
        quantidade++;
    }


}
