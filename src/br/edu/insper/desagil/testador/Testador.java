package br.edu.insper.desagil.testador;
import br.edu.insper.desagil.pedido.Pedido;
import br.edu.insper.desagil.produto.Produto;
import br.edu.insper.desagil.caixa.Caixa;
import br.edu.insper.desagil.carrinho.Carrinho;

public class Testador {
	double totalCaixa;
	double resultEsperado;
	
	public boolean testeA() {
		resultEsperado = 0;
		Carrinho carrinhoA = new Carrinho();
		Caixa caixaA = new Caixa();
		totalCaixa = caixaA.valorTotal(carrinhoA);
		
		if(totalCaixa == resultEsperado) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean testeB() {
		resultEsperado = 2.5;
		Carrinho carrinhoB = new Carrinho();
		Produto skol = new Produto(1, "skol", 2.5);
		carrinhoB.getProduto(skol);
		Caixa caixaB = new Caixa();
		totalCaixa = caixaB.valorTotal(carrinhoB);
		
		if(totalCaixa == resultEsperado) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean testeC() {
	    return false;
	}

	public boolean testeD() {
	    return false;
	}

	public boolean testeE() {
	    return false;
	}
}
