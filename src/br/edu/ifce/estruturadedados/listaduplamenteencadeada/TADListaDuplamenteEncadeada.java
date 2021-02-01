package br.edu.ifce.estruturadedados.listaduplamenteencadeada;

/**
 * TAD (Tipo Abastrato de Dados) que representa a lista
 * 
 * @author Mardonio Rodrigues
 *
 * @since 28/01/2021
 */
public interface TADListaDuplamenteEncadeada<T> {
	
	/**
	 * Opera��es Principais
	 */
	public void insereValor(T valor, int posicao);
	public T removeValor(int posicao);
	
	/**
	 * Opera��es Secund�rias
	 */
	public boolean listaVazia();
	public void imprimelista();
	
}
