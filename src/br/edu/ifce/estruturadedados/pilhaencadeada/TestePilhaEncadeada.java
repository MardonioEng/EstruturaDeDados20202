package br.edu.ifce.estruturadedados.pilhaencadeada;

public class TestePilhaEncadeada {
	public static void main(String[] args) {
		
		TADPilha pilha = new PilhaEncadeada();
		
		pilha.insereTopo(10);
		pilha.imprimePilha();
		
		pilha.insereTopo(8);
		pilha.imprimePilha();
		
		pilha.insereTopo(6);
		pilha.imprimePilha();
		
		pilha.insereTopo('a');
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
	}
}
