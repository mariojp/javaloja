package br.com.loja;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import br.com.loja.gui.Terminal;
import br.com.loja.model.Cliente;
import br.com.loja.model.Item;
import br.com.loja.model.Loja;
import br.com.loja.model.Produto;
import br.com.loja.model.Venda;

public class Principal {

	
	
	public static void main(String[] args) {
		new Terminal();
		
		Loja loja = new Loja();
		
		Cliente cliente = loja.verifiqueCPF("888888888");
		
		if(cliente == null ) {
			cliente = new Cliente();
			cliente.setCpf("888888888");
			cliente.setCep("40000");
			cliente.setNome("Pedro");
			cliente.setTelefone("71988888888");
			loja.addCliente(cliente);
		}
		
		
		Venda venda = new Venda(cliente, LocalDate.now(),LocalTime.now());
	
		Produto produto = loja.obterProduto("01");
		
		Item item = new Item();
		item.setProduto(produto);
		item.setQuantidade(2);
		item.setValor(produto.getPreco());

		venda.addItem(item);
		
		double valor = loja.finalizaVenda(venda);
		
		System.out.println(valor);
		
	}
}
