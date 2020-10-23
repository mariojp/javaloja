package br.com.loja.model;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

public class Venda {

	private Cliente cliente;
	private LocalDate data;
	private LocalTime hora;
	private List<Item> itens;
	
	public Venda(Cliente cliente, LocalDate data,LocalTime hora ) {
		this.cliente = cliente;
		itens = new ArrayList<Item>();
		this.data = data;
		this.hora = hora;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public double getTotal() {
		double valor = 0;
		for (Item item : itens) {
			valor = valor + item.getTotal();
			item.getProduto().baixa(item.getQuantidade());
		}
		return valor;
	}


	public void addItem(Item item) {
		this.itens.add(item);
	}
	

	
	

}
