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
		resultEsperado = 4 * (0.9);
		Carrinho carrinhoC = new Carrinho();
		Produto kirin = new Produto(2, "kirin", 4);
		carrinhoC.getProduto(kirin);
		Caixa caixaC = new Caixa();
		caixaC.Adicionar(kirin, 10);
		totalCaixa = caixaC.valorTotal(carrinhoC);
		if(totalCaixa == resultEsperado) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean testeD() {
		resultEsperado = 8.6;
		Carrinho carrinhoD = new Carrinho();
		Produto skol = new Produto(1, "skol", 2.5);
		Produto kirin = new Produto(2, "kirin", 4);
		carrinhoD.getProduto(kirin);
		carrinhoD.getProduto(skol);
		carrinhoD.getProduto(skol);
		Caixa caixaD = new Caixa();
		caixaD.Adicionar(kirin, 10);
		totalCaixa = caixaD.valorTotal(carrinhoD);
		
		if(totalCaixa == resultEsperado) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean testeE() {
		resultEsperado = 12.2;
		Carrinho carrinhoE = new Carrinho();
		Produto skol = new Produto(1, "skol", 2.5);
		Produto kirin = new Produto(2, "kirin", 4);
		carrinhoE.getProduto(kirin);
		carrinhoE.getProduto(kirin);
		carrinhoE.getProduto(skol);
		carrinhoE.getProduto(skol);
		Caixa caixaE = new Caixa();
		caixaE.Adicionar(kirin, 10);
		totalCaixa = caixaE.valorTotal(carrinhoE);
		
		if(totalCaixa == resultEsperado) {
			return true;
		}
		else {
			return false;
		}
	}
}
