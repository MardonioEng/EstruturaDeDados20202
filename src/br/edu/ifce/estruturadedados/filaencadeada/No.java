package br.edu.ifce.estruturadedados.filaencadeada;

/**
 * Classe que representa os elementos da Fila
 * 
 * @author Mardonio Rodrigues
 *
 * @since 13/12/2020
 */
public class No<T> {

	private T valor;
	private No proximo;

	public No(T valor, No proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

}
