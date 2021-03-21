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
		
		// Para cada pedido no carrinho
		for (Pedido ped : this.pedidos) {
		    // Se o produto recebido for um dos produtos no carrinho
		    if (ped.getProduto().getNome() == produto.getNome()) {
		    	ped.getQuantidade(); // Incrementa quantidade desse produto no pedido dele
		    	noCarrinho = true;
		    }
		}
		
		// Se o produto nao estiver no carrinho
		if (noCarrinho == false) {
			// Constroi um pedido
			Pedido pedido = new Pedido(produto,1);
			
			// Insere o pedido no carrinho
			this.pedidos.add(pedido);
		}
	
		
		
	}
	
	
}