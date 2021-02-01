package br.edu.ifce.estruturadedados.listaduplamenteencadeada;

/**
 * Classe que representa os elemento da lista duplamente encadeada
 * 
 * @author Mardonio Rodrigues
 *
 * @since 28/01/2021
 */
public class No<T> {

	private No<T> anterior;
	private T valor;
	private No<T> posterior;

	public No(No<T> anterior, T valor, No<T> posterior) {
		super();
		this.anterior = anterior;
		this.valor = valor;
		this.posterior = posterior;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public No<T> getPosterior() {
		return posterior;
	}

	public void setPosterior(No<T> posterior) {
		this.posterior = posterior;
	}

	public No<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(No<T> anterior) {
		this.anterior = anterior;
	}

}
