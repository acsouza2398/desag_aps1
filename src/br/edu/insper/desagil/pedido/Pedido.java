package br.edu.insper.desagil.pedido;
import br.edu.insper.desagil.produto.Produto;

public class Pedido {
	private Produto produto;
	private int quantidade;
	private double total;
	
	public Pedido(Produto produto, int quantidade) {
			this.produto = produto;
			this.quantidade = quantidade;
	}
	
	private Pedido pedido;
	
	public Produto getProduto() {
        return this.produto;   
	}
	
	public int getQuantidade() {
        return this.quantidade = Quantidade(pedido);   
	}
	
	public double getTotal() {
		return this.produto.getPreco() * this.getQuantidade();
	}
	
	private int Quantidade(Pedido pedido) {
		return pedido.quantidade ++;
	}
}

