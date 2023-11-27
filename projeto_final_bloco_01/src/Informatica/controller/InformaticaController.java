package Informatica.controller;

import java.util.ArrayList;
import java.util.Optional;

import Informatica.model.Informatica;
import Informatica.repository.InformaticaRepository;

public class InformaticaController implements InformaticaRepository {

	private ArrayList<Informatica> listaProdutos = new ArrayList<Informatica>();

	@Override
	public void cadastrarProduto() {

		Informatica informatica = null;
		listaProdutos.add(informatica);
		System.out.println("A conta número: " + informatica.getNumero() + " foi criado com Sucesso!");

	}

	@Override
	public void listarTodosOsProdutos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void consultarProdutoPorId(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarProduto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarProduto(int id) {
		// TODO Auto-generated method stub

	}

	public Optional<Informatica> buscarNaCollection(int numero) {

		for (var Informatica : listaProdutos) {
			if (Informatica.getNumero() == numero)
				return Optional.of(Informatica); /* Retorna um Optional com o objeto conta baseado no número que foi mandado */
		}
		
		return Optional.empty(); /* Retornar vazio */
	}
}
