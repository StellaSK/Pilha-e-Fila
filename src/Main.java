public class Main {
    public static void main(String[] args) {

        System.out.println("====================================== FILA ======================================");
        //Teste da Pilha
        Pilha pilha = new Pilha(3);
        System.out.println("Tamanho da Pilha: " + pilha.tamanho());
        pilha.adiciona(10);
        pilha.adiciona(20);
        pilha.remove(); // 20
        pilha.dadoTopo(); // 10

        System.out.println("====================================== FILA ======================================");
        // Teste da Fila
        Fila fila = new Fila(3);
        System.out.println("Tamanho da fila: " + fila.tamanho());
        fila.adicionaNoFinal(10); // Índice 0
        fila.adicionaNoFinal(20); // Índice 1
        fila.adicionaNoFinal(30); // Índice 2 (fila cheia)
        System.out.println("Quantidade dentro da fila: " + fila.capacidade());
        fila.removeDaFrente(); // Remove 10 (primeiroDaFila vira 1)
        fila.removeDaFrente(); // Remove 20 (primeiroDaFila vira 2)
        System.out.println("Quantidade dentro da fila: " + fila.capacidade());
    }
}