package br.edu.ifce.estruturadedados.arvorebinariabusca;

public class TesteArvoreBinariaBusca {
	public static void main(String[] args) {
		
		ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
		
		arvore.insereNo(20, arvore.getRaiz());
		arvore.insereNo(30, arvore.getRaiz());
		arvore.insereNo(10, arvore.getRaiz());
		arvore.insereNo(35, arvore.getRaiz());
		
		arvore.imprimirInterfixado(arvore.getRaiz());
		
		System.out.println();
		System.out.println("Altura da raiz: " + arvore.alturaNo(arvore.getRaiz()));
		System.out.println("Profundidade da raiz: " + arvore.profundidadeRecursiva(arvore.getRaiz()));
		
		int valor = 10;
		BTSNode noPesquisado = arvore.pesquisaNo(valor, arvore.getRaiz());
		if(noPesquisado != null) {
			System.out.println("Altura Nó " + valor + "  Pesquisado: " + arvore.alturaNo(noPesquisado));
			System.out.println("Profundidade Nó " + valor + " Pesquisado: " + arvore.profundidadeRecursiva(noPesquisado));
		} else {
			System.out.println("Nó de valor " + valor + " não encontrado!");
		}
	}
}
