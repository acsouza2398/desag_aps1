package br.edu.insper.desagil.testador;
import br.edu.insper.desagil.pedido.Pedido;
import br.edu.insper.desagil.produto.Produto;
import br.edu.insper.desagil.caixa.Caixa;
import br.edu.insper.desagil.carrinho.Carrinho;

public class Testador {
	Produto skol = new Produto(1, "skol", 2.50);
	Produto kirin = new Produto(2, "kirin", 4);
	double t;
	
	public boolean testeA() {
		
	    return false;
	}

	public boolean testeB() {
		Carrinho carrinhoB = new Carrinho();
		carrinhoB.getProduto(skol);
		Caixa caixaB = new Caixa();
		t = caixaB.valorTotal(carrinhoB);
		if(t == 2.5) {
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
