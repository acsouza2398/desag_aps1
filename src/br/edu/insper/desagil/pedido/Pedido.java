package br.edu.insper.desagil.pedido;
import br.edu.insper.desagil.produto.Produto;

public class Pedido {
	private Produto produto;
	private int quantidade;
	private double total;
	
	public Pedido(Produto produto, int quantidade, int total) {
			this.produto = produto;
			this.quantidade = quantidade;
			this.total = total;
	}
	
	private Pedido pedido;
	
	public Produto getProduto() {
        return this.produto;   
	}
	
	public int getQuantidade() {
        return this.quantidade = Quantidade(pedido);   
	}
	
	public double getTotal() {
		return this.total = setTotal(produto, pedido);
	}
	
	private int Quantidade(Pedido pedido) {
		return pedido.quantidade ++;
	}
	
	private double setTotal(Produto produto, Pedido pedido) {
		return pedido.total = produto.getPreco() * pedido.getQuantidade();
	}
}

