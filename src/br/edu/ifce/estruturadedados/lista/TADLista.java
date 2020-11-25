package br.edu.ifce.estruturadedados.lista;

/**
 * Tipo Abstrato de Dados (TAD) da lista
 * 
 * @author Mardonio
 *
 */
public interface TADLista<T> {
	
	/**
	 * Operações principais
	 */
	public void insereValor(T valor, int indice);
	public T removeValor(int indice);
	
	/**
	 * Operações secundárias
	 */
	public boolean listaCheia();
	public boolean listaVazia();
	
	public void imprimeLista();
}
