package br.com.loja.model;
import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Venda> vendas = new ArrayList<Venda>();
	private List<Produto> produtos = new ArrayList<Produto>();

	public Loja() {
	
		Produto p1 = new Produto();
		p1.setCodigo("01");
		p1.setNome("Bola de Futebol");
		p1.setDescricao("Bola de Futebol de Campo");
		p1.setQuantidade(10);
		p1.setPreco(25.0);
		produtos.add(p1);
		
		Produto p2 = new Produto();
		p2.setCodigo("02");
		p2.setNome("Camisa");
		p2.setDescricao("Camisa de futebol");
		p2.setQuantidade(5);
		p2.setPreco(45.0);
		produtos.add(p2);
	}
	
	
	
	public Cliente verifiqueCPF(String cpf) {
		for (Cliente cliente : clientes) {
			if(cliente.getCpf().equals(cpf)) {
				return cliente;
			}
		}
		return null;
	}



	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}



	public Produto obterProduto(String codigo) {
		for (Produto produto : produtos) {
			if(produto.getCodigo().equals(codigo)) {
				return produto;
			}
		}
		return null;
	}



	public double finalizaVenda(Venda venda) {
		double valor = venda.getTotal();
		return valor;
	}

	
	
	
}
