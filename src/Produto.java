public class Produto {
    private double valor;
    private String nome;
    private int quantidade;

    public Produto(double valor, String nome, int quantidade){
        this.valor = valor;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public double valorEmEstoque(){
        return this.valor * this.quantidade;
    }

    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Produto" +
                "valor= " + valor +
                ", nome= " + nome + '\'' +
                ", quantidade= " + quantidade +
                '.';
    }
}
