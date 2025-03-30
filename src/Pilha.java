public class Pilha {

    private int[] dados;
    private int topo;
    private int tamanho;


    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        this.topo = -1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public boolean cheia() {
        return topo == tamanho - 1;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void adiciona(int dado) {
        if (cheia()) {
            System.out.println("Pilha cheia!");
            return;
        }
        dados[++topo] = dado;
        System.out.println("Dado adicionado: " + dado);
    }

    public void remove() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println("Dado removido: " + dados[topo]);
        topo--;
    }

    public void dadoTopo() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println("Dado do Topo: " + dados[topo]);
    }
}


