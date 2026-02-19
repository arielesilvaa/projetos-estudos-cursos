public class Venda {
    Carrinho carrinho;

     public Venda() {
         this.carrinho = new Carrinho();
     }

     public void totalizarVenda() {
         double total = 0.0;
         for (Produto produto : carrinho.produtos) {
             total += produto.getPreco().doubleValue();
         }
         System.out.println("O total da venda é: R$ " + total);
     }

     public void finalizarVenda() {
         System.out.println("Venda finalizada com sucesso!");
     }
}
