package br.edu.ifce.estruturadedados.listaencadeada;

/**
 * TAD (Tipo Abstrato de Dados) Lista Encadeada
 * 
 * @author Mardonio Rodrigues
 *
 * @since 27/01/2021
 */
public interface TADListaEncadeada<T> {
	
	/**
	 * Operações principais
	 */
	public void insereInicio(T valor);
	public void inserePosicao(T valor, int posicao);
	public void insereFinal(T valor);
	
	public T removePosicao(int posicao);
	
	/**
	 * Operações secundárias
	 */
	public boolean listaVazia();
	public void imprimeLista();
	
}
