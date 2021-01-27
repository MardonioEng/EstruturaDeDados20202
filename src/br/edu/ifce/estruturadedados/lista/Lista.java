package br.edu.ifce.estruturadedados.lista;

public class Lista<T> implements TADLista<T> {

	public T[] lista;
	public int posicao;
	
	@SuppressWarnings("unchecked")
	public Lista(int tamanho) {
		lista = (T[]) new Object[tamanho];
		posicao = -1;
	}
	
	@Override
	public void insereValor(T valor, int indice) {
		//Realiza as valida��es
		if(listaCheia()) {
			System.out.println("Elemento " + valor + " n�o inserido. Lista cheia.");
			return;
		}
		//Verifica se o �ndice � v�lido
		if(indice < 0 || indice > posicao + 1) {
			System.out.println("Elemento " + valor + " n�o inserido. �ndice inv�lido.");
			return;
		}
		for(int i = posicao; i >= indice; i--) {
			lista[i+1] = lista[i];
		}
		lista[indice] = valor;
		posicao++;
		
	}

	@Override
	public T removeValor(int indice) {
		//Realiza as valida��es
		if(listaVazia()) {
			System.out.println("Elemento n�o removido. Lista vazia.");
			return null;
		}
		//Verifica se o �ndice � v�lido
		if(indice < 0 || indice > posicao) {
			System.out.println("Elemento n�o removido. �ndice inv�lido.");
			return null;
		}
		
		T valorRemovido = lista[indice];
		for(int i = indice; i < posicao; i++) {
			lista[i] = lista[i+1];
		}
		lista[posicao--] = null;
		
		return valorRemovido;
	}

	@Override
	public boolean listaCheia() {
		if (posicao == lista.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean listaVazia() {
		if (posicao == -1) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimeLista() {
		if (listaVazia()) {
			System.out.println("Lista vazia. N�o h� elementos para impress�o.");
			return;
		}

		for (int i = 0; i <= posicao; i++) {
			System.out.print(lista[i] + "\t");
		}
		System.out.println();
	}

}
