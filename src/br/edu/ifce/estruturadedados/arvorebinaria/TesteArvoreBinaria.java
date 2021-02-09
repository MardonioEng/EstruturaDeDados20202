package br.edu.ifce.estruturadedados.arvorebinaria;

public class TesteArvoreBinaria {

	public static void main(String[] args) {
		
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
		
		/*
		arvore.insereRaiz(30);
		
		arvore.insereEsquerda(20, arvore.getRaiz());
		arvore.insereDireita(40, arvore.getRaiz());
		
		arvore.insereEsquerda(15, arvore.getRaiz().getEsq());
		arvore.insereDireita(25, arvore.getRaiz().getEsq());
		
		arvore.insereEsquerda(33, arvore.getRaiz().getDir());
		arvore.insereDireita(44, arvore.getRaiz().getDir());
		
		System.out.println("Caminhamento Pré-fixado");
		arvore.imprimirPrefixado(arvore.getRaiz());
		System.out.println();
		
		System.out.println("Caminhamento Interfixado");
		arvore.imprimirInterfixado(arvore.getRaiz());
		System.out.println();
		
		System.out.println("Caminhamento Pós-fixado");
		arvore.imprimirPosfixado(arvore.getRaiz());
		*/
		
		arvore.insereRaiz(50);
		
		arvore.insereEsquerda(17, arvore.getRaiz());
		arvore.insereDireita(72, arvore.getRaiz());
		
		arvore.insereEsquerda(12, arvore.getRaiz().getEsq());
		arvore.insereDireita(23, arvore.getRaiz().getEsq());
		
		arvore.insereEsquerda(9, arvore.getRaiz().getEsq().getEsq());
		arvore.insereDireita(14, arvore.getRaiz().getEsq().getEsq());
		
		arvore.insereEsquerda(19, arvore.getRaiz().getEsq().getDir());
		
		arvore.insereEsquerda(54, arvore.getRaiz().getDir());
		arvore.insereDireita(76, arvore.getRaiz().getDir());
		
		arvore.insereDireita(67, arvore.getRaiz().getDir().getEsq());
		
		System.out.println("Caminhamento Pré-fixado");
		arvore.imprimirPrefixado(arvore.getRaiz());
		System.out.println();
		
		System.out.println("Caminhamento Interfixado");
		arvore.imprimirInterfixado(arvore.getRaiz());
		System.out.println();
		
		System.out.println("Caminhamento Pós-fixado");
		arvore.imprimirPosfixado(arvore.getRaiz());
		
	}
	
}
