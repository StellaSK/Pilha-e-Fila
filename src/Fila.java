public class Fila {

    private int[] dados;
    private int primeiroDaFila;
    private int ultimoDaFila;
    private int quantidade;
    private int tamanho;


    public Fila(int tamanho) {
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        this.primeiroDaFila = 0;
        this.ultimoDaFila = -1;
        this.quantidade = 0;
    }

    public boolean vazia() {
        return quantidade == 0;
    }

    public boolean cheia() {
        return quantidade == tamanho;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int capacidade() {
        return this.quantidade;
    }

    public void adicionaNoFinal(int dado) {
        if (cheia()) {
            System.out.println("Fila cheia!");
            return;
        }
        ultimoDaFila++;
        dados[ultimoDaFila] = dado;
        quantidade++;
        System.out.println("Adicionado: " + dados[ultimoDaFila]);
    }

    public void removeDaFrente() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        int dado = dados[primeiroDaFila];
        primeiroDaFila++;
        quantidade--;
        System.out.println("Removido: " + dado);
    }

    public void dadoDaFrente() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.println(dados[primeiroDaFila]);
    }
}
