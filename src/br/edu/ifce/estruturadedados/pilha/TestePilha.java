package br.edu.ifce.estruturadedados.pilha;

public class TestePilha {
	public static void main(String[] args) {
		
		TADPilha pilha = new Pilha(5);
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.adicionaTopo(10);
		pilha.imprimePilha();
		
		pilha.adicionaTopo(20);
		pilha.imprimePilha();
		
		pilha.adicionaTopo(30);
		pilha.imprimePilha();
		
		pilha.adicionaTopo(40);
		pilha.imprimePilha();
		
		pilha.adicionaTopo(50);
		pilha.imprimePilha();
		
		pilha.adicionaTopo(60);
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
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
