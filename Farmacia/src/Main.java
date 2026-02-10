import controller.BancoDeDados;
import model.Item;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de farmacia em Java");
        System.out.println("----------------------------");

        Item diprona = new Item("Diprona 500mg", 10, 123, "Analgésico");
        Item amoxicilina = new Item("Amoxicilina 250mg", 20, 456, "Antibiótico");
        Item ibuprofeno = new Item("Ibuprofeno 400mg", 15, 789, "Anti-inflamatório");

        BancoDeDados banco = new BancoDeDados();
        banco.cadastrar(diprona);
        banco.cadastrar(amoxicilina);
        banco.cadastrar(ibuprofeno);

        banco.editar(456, "Amoxicilina 500mg", 20, "Antibiótico");
        banco.pesquisar(123);

    }
}