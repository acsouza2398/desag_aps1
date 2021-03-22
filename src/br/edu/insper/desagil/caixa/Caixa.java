package br.edu.insper.desagil.caixa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.insper.desagil.carrinho.Carrinho;
import br.edu.insper.desagil.pedido.Pedido;
import br.edu.insper.desagil.produto.Produto;

public class Caixa {
    private Map<Integer, Integer> dicDescontos;

	public Caixa() {
		Map<Integer,Integer> d = new HashMap<>();
		this.dicDescontos = d;
	}
	
    public void Adicionar(Produto produto, int desconto) {
    	int codProduto = produto.getCodigo();
    	
    	if (desconto>=1 && desconto<=99) {
    		this.dicDescontos.put(codProduto, desconto);
    	}
    }
    
    public double valorTotal(Carrinho carrinho) {
    	double valorFinal = 0;
    	
    	for (Pedido ped : carrinho.getPedidos()) {
    		int codProduto = ped.getProduto().getCodigo(); 
    		double valorPedido = ped.getTotal(); 
    		
    		int desconto = 0;
    		if (this.dicDescontos.containsKey(codProduto)) {
    			desconto = this.dicDescontos.get(codProduto); 
    		}
    		double valorFinalPedido = valorPedido *(1-(desconto/100.0));
    		valorFinal = valorFinal + valorFinalPedido; 
    	}
    	
    	return valorFinal;
    }

}
