# Farmacia

Aplicação de console simples que demonstra operações básicas em um sistema de farmácia: cadastro, edição e pesquisa de itens.

Como executar (via terminal):

1. Compile os fontes:

   javac -d out src/*.java src/controller/*.java src/model/*.java

2. Rode a aplicação:

   java -cp out Main

Principais arquivos:

- `src/Main.java` (classe principal)
- `src/controller/BancoDeDados.java` (lógica de armazenamento/CRUD simples)
- `src/model/Item.java` (modelo de dados do item/medicamento)
- `medicamento.txt` (arquivo de dados de exemplo)

Observação: este projeto é apenas um teste/estudo — não é adequado para produção.

Autor: Seu Nome
Licença: MIT

