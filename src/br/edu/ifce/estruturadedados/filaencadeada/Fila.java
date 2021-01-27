package br.edu.ifce.estruturadedados.filaencadeada;

public class Fila<T> implements TADFila<T> {

	private No<T> cabeca;
	private int tamanho;

	@Override
	public void insereFinal(T valor) {

		No<T> novoNo = new No<T>(valor, null);

		if (filaVazia()) {
			cabeca = novoNo;
		} else {
			No<T> auxiliar = cabeca;
			while (auxiliar.getProximo() != null) {
				auxiliar = auxiliar.getProximo();
			}
			auxiliar.setProximo(novoNo);
		}
		tamanho++;
	}

	@Override
	public T removeInicio() {
		// Realiza validações
		if (filaVazia()) {
			System.out.println("Fila vazia! Não há elementos pra remoção.");
			return null;
		}

		No<T> noRemovido = cabeca;
		cabeca = cabeca.getProximo();
		noRemovido.setProximo(null);

		tamanho--;

		return noRemovido.getValor();
	}

	@Override
	public boolean filaVazia() {
		return (tamanho == 0) ? true : false;
	}

	@Override
	public void imprime() {
		if (filaVazia()) {
			System.out.println("Fila vazia! Não há elementos pra impressão.");
			return;
		}

		No<T> auxiliar = cabeca;
		while(auxiliar != null) {
			System.out.print(" => " + auxiliar.getValor());
			auxiliar = auxiliar.getProximo();
		}
		System.out.println();
		
	}

}
