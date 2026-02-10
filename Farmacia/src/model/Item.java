package model;

public class Item {

    private String nome;
    private int quantidade;
    private int codigo;
    private String tipo;

    public Item(String nome, int quantidade, int codigo, String tipo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
