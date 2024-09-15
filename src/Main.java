public class Main {
    public static void main(String[] args) {
        Produto veja = new Produto(8.90,"Veja Limpa Tudo", 10);

        veja.adicionarProdutos(5);
        veja.removerProdutos(2);
        System.out.println(veja.toString());
    }
}