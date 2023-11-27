package Informatica.repository;

public interface InformaticaRepository {

	//CRUD
	
			public void criarProduto( );
			public void listarTodosOsProdutos();
			public void consultarProdutoPorId(int id);
			public void atualizarProduto();
			public void deletarProduto(int id);
}
