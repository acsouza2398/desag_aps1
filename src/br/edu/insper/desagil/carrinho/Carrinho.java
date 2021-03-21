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
	
	public void recebeProduto(Produto produto) {
		List<Pedido> l = getPedidos(); // Pega a lista com todos os pedidos no carrinho
		boolean noCarrinho = false;
		
		// Para cada pedido no carrinho
		for (int i = 0; i < l.size(); i++) {
		    Pedido ped = l.get(i); // Pedido do carrinho
		    Produto prod = ped.getProduto(); // Produto do pedido no carrinho  
		    // Se o produto recebido já for um dos produtos no carrinho
		    if (prod == produto) {
		    	ped.getQuantidade(); // Incrementa quantidade desse produto no pedido dele
		    	noCarrinho = true;
		    }
		}
		
		// Se o produto não estiver no carrinho
		if (noCarrinho == false) {
			// Constroi um pedido
			Pedido pedido = new Pedido(produto, 1, 1);
			
			// Insere o pedido no carrinho
			this.pedidos.add(pedido);
		}
	
		
		
	}
	
	
}
