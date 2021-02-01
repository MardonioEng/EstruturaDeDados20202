package br.edu.ifce.estruturadedados.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> implements TADListaDuplamenteEncadeada<T> {

	private No<T> header;
	private No<T> trailer;
	private int tamanho;
	
	public ListaDuplamenteEncadeada() {
		header = new No<T>(null, null, null);
		trailer = new No<T>(header, null, null);
		
		header.setPosterior(trailer);
		tamanho = 0;
	}
	
	@Override
	public void insereValor(T valor, int posicao) {
		
		//Realiza as valida��es
		if(posicao < 1 || posicao > tamanho + 1) {
			System.out.println("Posica��o inv�lida para inser��o: " + posicao);
			return;
		}
		
		No<T> noAnteriorInsercao = header;
		for(int i = 1; i < posicao; i++) {
			noAnteriorInsercao = noAnteriorInsercao.getPosterior();
		}
		
		No<T> novoNo = new No<T>(noAnteriorInsercao, valor, null);
		novoNo.setPosterior(noAnteriorInsercao.getPosterior());
		
		novoNo.getPosterior().setAnterior(novoNo);
		noAnteriorInsercao.setPosterior(novoNo);
		
		tamanho++;
		
	}

	@Override
	public T removeValor(int posicao) {
		
		//Realiza as valida��es
		if(posicao < 1 || posicao > tamanho) {
			System.out.println("Posic�o inv�lida para remo��o: " + posicao);
			return null;
		}
		
		No<T> noAnteriorRemocao = header;
		for(int i = 1; i < posicao; i++) {
			noAnteriorRemocao = noAnteriorRemocao.getPosterior();
		}
		
		No<T> noRemovido = noAnteriorRemocao.getPosterior();
		
		noAnteriorRemocao.setPosterior(noRemovido.getPosterior());
		noRemovido.getPosterior().setAnterior(noAnteriorRemocao);
		
		noRemovido.setAnterior(null);
		noRemovido.setPosterior(null);
		
		tamanho--;
		
		return noRemovido.getValor();
	}

	@Override
	public boolean listaVazia() {
		return (tamanho == 0) ? true : false;
	}

	@Override
	public void imprimelista() {
		
		if (listaVazia()) {
			System.out.println("Lista vazia! N�o h� elementos pra impress�o.");
			return;
		}

		No<T> auxiliar = header;
		while (auxiliar != null) {
			System.out.print(" <=> " + auxiliar.getValor());
			auxiliar = auxiliar.getPosterior();
		}
		System.out.println();

		
	}

}
