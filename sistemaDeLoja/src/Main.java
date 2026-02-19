//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Loja Javeiro");
        System.out.println("---------------------------------");
        Produto p1 = new Produto("Camiseta", new java.math.BigDecimal("29.99"), "Camiseta de algodão");
        Produto p2 = new Produto("Calça Jeans", new java.math.BigDecimal("99.99"), "Calça jeans azul");
        Produto p3 = new Produto("Tênis", new java.math.BigDecimal("199.99"), "Tênis esportivo");

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);
        carrinho.removerProduto("Calça Jeans");

        System.out.println("---------------------------------");
        Venda venda = new Venda();
        venda.carrinho = carrinho;
        venda.totalizarVenda();
        venda.finalizarVenda();


    }
}