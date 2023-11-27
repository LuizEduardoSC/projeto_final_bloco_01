package Informatica.repository;

public interface InformaticaRepository {

	//CRUD
	
			public void cadastrarProduto( );
			public void listarTodosOsProdutos();
			public void consultarProdutoPorId(int id);
			public void atualizarProduto();
			public void deletarProduto(int id);
}
