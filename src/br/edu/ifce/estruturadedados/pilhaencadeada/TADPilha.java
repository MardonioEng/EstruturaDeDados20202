package br.edu.ifce.estruturadedados.pilhaencadeada;

/**
 * TAD (Tipo Abstrato de Dados) referente a Pilha
 * 
 * @author Mardonio Rodrigues
 * 
 * @since 27/01/2021
 *
 */
public interface TADPilha<T> {

	/**
	 * Operações principais
	 */
	public void insereTopo(T valor);
	public T removeTopo();
	
	/**
	 * Operações secundárias
	 */
	public boolean pilhaVazia();
	public void imprimePilha();
}
