package br.edu.ifce.estruturadedados.pilha;

/**
 * Implementa��o da pilha usando aloca��o est�tica de mem�ria
 * Considera-se o topo o �ndice ZERO do vertor.
 * 
 * @author Mardonio
 *
 */
public class Pilha implements TADPilha {

	public Integer[] pilha;
	public int posicao;
	
	
	public Pilha(int tamanho) {
		pilha = new Integer[tamanho];
		posicao = -1;
	}
	
	@Override
	public void adicionaTopo(Integer value) {
		//Realiza as valida��es
		if(pilhaCheia()) {
			System.out.println("Elemento " + value + " n�o inserido. Pilha cheia!");
			return;
		}
		
		for(int i = posicao; i >= 0; i--) {
			pilha[i+1] = pilha[i];
		}
		pilha[0] = value;
		posicao++;
	}

	@Override
	public Integer removeTopo() {
		//Realiza as valida��es
		if(pilhaVazia()) {
			System.out.println("N�o h� elementos para remo��o. Pilha vazia!");
			return null;
		}
		
		Integer elementoRemovido = pilha[0];
		for(int i = 0; i < posicao; i++) {
			pilha[i] = pilha[i+1];
		}
		pilha[posicao--] = null;
		
		return elementoRemovido;
	}

	@Override
	public boolean pilhaCheia() {
		return (posicao+1 == pilha.length);
	}

	@Override
	public boolean pilhaVazia() {
		return (posicao == -1);
	}

	@Override
	public void imprimePilha() {
		//Realiza as valida��es
		if(pilhaVazia()) {
			System.out.println("N�o h� elementos para impress�o. Pilha vazia!");
			return;
		}
		
		for (int i = 0; i <= posicao; i++) {
			System.out.print(pilha[i] + "\t");
		}
		System.out.println();

	}

}
