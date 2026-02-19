import java.util.ArrayList;
import java.util.Arrays;

public class Carrinho {
    ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
       produtos.add(produto);
       System.out.println("O produto " + produto.getNome() + " foi adicionado ao carrinho");
    }

    public void removerProduto(String produto) {
        produtos.remove(produto);
        System.out.println("O produto " + Arrays.toString(produto.getBytes()) + " foi removido do carrinho");
    }

    public  ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
