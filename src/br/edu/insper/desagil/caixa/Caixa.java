package br.edu.insper.desagil.caixa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.insper.desagil.carrinho.Carrinho;
import br.edu.insper.desagil.pedido.Pedido;
import br.edu.insper.desagil.produto.Produto;

public class Caixa {
	//private Produto produto;
	//private Pedido pedido;
	
	// Mapeia código de produtos para inteiros (1 a 99)
    private Map<Integer, Integer> dicDescontos;

	public Caixa() {
		Map<Integer,Integer> d = new HashMap<>();
		this.dicDescontos = d;
	}
	
    public void Adicionar(Produto produto, int desconto) {
    	int codProduto = produto.getCodigo();
    	
    	// Se codigo estiver entre 1 e 99 insere o código do produto no dicionario com o seu desconto
    	if (desconto>=1 && desconto<=99) {
    		this.dicDescontos.put(codProduto, desconto);
    	}
    }
    
    public double valorTotal(Carrinho carrinho) {
    	double valorFinal = 0;
    	
    	// Para cada um dos pedidos no carrinho
    	for (Pedido ped : carrinho.getPedidos()) {
    		int codProduto = ped.getProduto().getCodigo(); // Código do produto do pedido
    		double valorPedido = ped.getTotal(); // Valor do pedido
    		
    		int desconto = 0;
    		// Se o código do produto estiver no dicDescontos
    		if (this.dicDescontos.containsKey(codProduto)) {
    			desconto = this.dicDescontos.get(codProduto); // pega o valor do desconto 
    		}
    		double valorFinalPedido = valorPedido *(1-(desconto/100.0)); // Valor do pedido com desconto
    		valorFinal = valorFinal + valorFinalPedido; // Acrescenta o valor ao valor final
    	}
    	
    	return valorFinal;
    }

}
