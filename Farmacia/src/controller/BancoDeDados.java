package controller;

import model.Item;

import java.io.*;

public class BancoDeDados {
    private Item item;

        public void bancoDeDados() {

        }

        public void cadastrar(Item item) {
            try {
                FileWriter fw = new FileWriter("medicamento.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Nome: " + item.getNome() + ", Quantidade: " + item.getQuantidade() + ", Código: " + item.getCodigo() + ", Tipo: " + item.getTipo());
                bw.newLine();
                bw.close();
                System.out.println("Item cadastrado com sucesso: " + item.getNome());
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao cadastrar o item: " + e.getMessage());
            }

        }

        public void editar(int codigo, String nome, int quantidade, String tipo) {
                try {
                    FileReader fr = new FileReader("medicamento.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String linha;
                    StringBuilder sb = new StringBuilder();
                    while ((linha = br.readLine()) != null) {
                        if (linha.contains("Código: " + codigo)) {
                            sb.append("Nome: ").append(nome).append(", Quantidade: ").append(quantidade).append(", Código: ").append(codigo).append(", Tipo: ").append(tipo).append("\n");
                        } else {
                            sb.append(linha).append("\n");
                        }
                    }
                    br.close();

                    FileWriter fw = new FileWriter("medicamento.txt");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(sb.toString());
                    bw.close();
                    System.out.println("Item editado com sucesso: Código: " + codigo);
                } catch (IOException e) {
                    System.out.println("Ocorreu um erro ao editar o item: " + e.getMessage());
                }

        }

        public void pesquisar(int codigo) {
            try {
                FileReader fr = new FileReader("medicamento.txt");
                BufferedReader br = new BufferedReader(fr);
                String linha;
                boolean encontrado = false;
                while ((linha = br.readLine()) != null) {
                    if (linha.contains("Código: " + codigo)) {
                        System.out.println("Item encontrado: " + linha);
                        encontrado = true;
                        break;
                    }
                }
                br.close();
                if (!encontrado) {
                    System.out.println("Item com código " + codigo + " não encontrado.");
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao pesquisar o item: " + e.getMessage());
            }
        }

        public void excluir(int codigo) {
            try {
                FileReader fr = new FileReader("medicamento.txt");
                BufferedReader br = new BufferedReader(fr);
                String linha;
                StringBuilder sb = new StringBuilder();
                boolean encontrado = false;
                while ((linha = br.readLine()) != null) {
                    if (linha.contains("Código: " + codigo)) {
                        encontrado = true;
                        continue; // Pula a linha do item a ser excluído
                    }
                    sb.append(linha).append("\n");
                }
                br.close();

                if (encontrado) {
                    FileWriter fw = new FileWriter("medicamento.txt");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(sb.toString());
                    bw.close();
                    System.out.println("Item excluído com sucesso: Código: " + codigo);
                } else {
                    System.out.println("Item com código " + codigo + " não encontrado para exclusão.");
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao excluir o item: " + e.getMessage());
            }

        }

        public void ler() {
            try {
                FileReader fr = new FileReader("medicamento.txt");
                BufferedReader br = new BufferedReader(fr);
                String linha;
                while ((linha = br.readLine()) != null) {
                    System.out.println(linha);
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
            }
        }
}
