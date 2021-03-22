package br.edu.insper.desagil.carrinho;

import java.util.ArrayList;
import java.util.List;

import br.edu.insper.desagil.pedido.Pedido;
import br.edu.insper.desagil.produto.Produto;


public class Carrinho {
	private List<Pedido> pedidos;

	public Carrinho() {
		this.pedidos = new ArrayList<Pedido>();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void getProduto(Produto produto) {
		boolean noCarrinho = false;
		
		for (Pedido ped : this.pedidos) {
		    if (ped.getProduto().getNome() == produto.getNome()) {
		    	ped.getQuantidade(); 
		    	noCarrinho = true;
		    }
		}
		
		if (noCarrinho == false) {
			Pedido pedido = new Pedido(produto,1);
			
			this.pedidos.add(pedido);
		}
	
		
		
	}
	
	
}