package Informatica.model;

public abstract class Informatica { // Superclasse das classes Medicamento e Cosmetico

	private int opcao, tipo, quantidade;
	private String nome, listaProdutos;
	private double preco;

	public Informatica(int opcao, int tipo, int quantidade, String nome, String listaProdutos, double preco) {
		this.opcao = opcao;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.nome = nome;
		this.listaProdutos = listaProdutos;
		this.preco = preco;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(String listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1 -> tipo = "CPU";
		case 2 -> tipo = "VGA";
		}

		System.out.println("\n\n********************************************");
		System.out.println("Informações Produtos");
		System.out.println("********************************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Tipo: " + tipo);
		System.out.println("Lista de Produtos: " + this.listaProdutos);
		System.out.println("Preço: " + this.preco);
	}
}
