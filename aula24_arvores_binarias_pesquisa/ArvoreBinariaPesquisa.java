package aula24_arvores_binarias_pesquisa;

import java.util.ArrayList;

public class ArvoreBinariaPesquisa {
    class Nodo {
        public int item;
        public Nodo pai;
        public Nodo esquerda;
        public Nodo direita;
        public Nodo(int item) {
            this.item = item;
            this.pai = null;
            this.esquerda = null;
            this.direita = null;
        }
    }
    private Nodo raiz;
    private int tamanho;
    public ArvoreBinariaPesquisa() {
        tamanho = 0;
    }
    private void adicionarRecursivamente(Nodo novoNodo, Nodo pai) {
        if(novoNodo.item < pai.item) { //vai para a esquerda do nodo pai
            if(pai.esquerda==null) {
                pai.esquerda = novoNodo;
                novoNodo.pai = pai;
            }
            else adicionarRecursivamente(novoNodo, pai.esquerda);
        }
        else {
            if(pai.direita==null) {
                pai.direita = novoNodo;
                novoNodo.pai = pai;
            }
            else adicionarRecursivamente(novoNodo, pai.direita);
        }
    }
    public void adicionar(int item) {
        Nodo novoNodo = new Nodo(item);
        if(this.tamanho==0) this.raiz = novoNodo;
        else adicionarRecursivamente(novoNodo, raiz);
        this.tamanho++;
    }
    public boolean estaVazia() {
        if(raiz == null) return true;
        else return false;
    }
    public int obterTamanho() {
        
        return tamanho;
    }
    public void limpar(){
        tamanho = 0;
        raiz = null;

        
    }
    public int obterEsquerda(int item) {
        //retorna o filho a esquerda de item
        //implmentar
        return 0;
    }
    public int obterDireita(int item) {
        //retorna o filho a direita de item
        //implmentar
        return 0;
    }
    public int obterPai(int item) {
        //retorna o pai do elemento item
        //implementar
        return 0;
    }
    public void preOrdemRecursivo(Nodo pai, ArrayList<Integer> elementos){
        elementos.add(pai.item);
        if(pai.esquerda != null) preOrdemRecursivo(pai.esquerda, elementos);
        if(pai.direita != null) preOrdemRecursivo(pai.direita, elementos);
    }

    public ArrayList<Integer> elementosPreOrdem() {
        ArrayList<Integer> elementos = new ArrayList<>();
         preOrdemRecursivo(this.raiz, elementos);
         return elementos;
    }
    public ArrayList<Integer> elementosCentralOrdem() {
        //retorna um array list com os elementos (valores inteiros) em ordem central
        //implementar
        return null;
    }

    public void posOrdemRecursivo(Nodo pai, ArrayList<Integer> elementos){
        //elementos.add(pai.item);
        if(pai.esquerda != null) preOrdemRecursivo(pai.esquerda, elementos);
        
        if(pai.direita != null) preOrdemRecursivo(pai.direita, elementos);
        elementos.add(pai.item);
    }
    public ArrayList<Integer> elementosPosOrdem() {
        ArrayList<Integer> elementos = new ArrayList<>();
        posOrdemRecursivo(this.raiz, elementos);
        return elementos;
    }
    public ArrayList<Integer> elementosLargura() {
        //retorna um array list com os elementos (valores inteiros) em um caminhamento em largura
        //implementar
        return null;
    }
    public int obterNivel(int item) {
        //retorna o nivel do elemeto item, caso nao existe retorna -1
        //implementar
        return 0;
    }
    public boolean existe(int item) {
        Nodo aux = this.raiz;
        while(aux!=null){
            if(aux.item == item){return true;}
            if(item < aux.item){
                aux = aux.esquerda;
            } else aux = aux.direita;
        }
        return false;
    }
    public int altura() {
        //retorna altura da arvore
        return 0;
    }
    public boolean ehInterno(int item) {
        //retorna true se o elemento esta em um nodo interno
        //implementar
        return false;
    }
    public boolean ehExterno(int item) {
        //retorna true se o elemento esta em um nodo interno
        //implementar
        return false;
    }
    public void remover(int item) {
        //remove o elemento da arvore se ele existir
        //implementar
    }
    public void imprimirArvore() {
        imprimirArvoreRecusivamente(this.raiz, 0);
    }
    private void imprimirArvoreRecusivamente(Nodo raiz, int nivel) {
        if (raiz == null) return;
        nivel += 5;
        imprimirArvoreRecusivamente(raiz.direita, nivel);
        System.out.print("\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        System.out.print(raiz.item + "\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        imprimirArvoreRecusivamente(raiz.esquerda, nivel);
    }
}
