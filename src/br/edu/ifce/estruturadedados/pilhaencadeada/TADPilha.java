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
	 * Opera��es principais
	 */
	public void insereTopo(T valor);
	public T removeTopo();
	
	/**
	 * Opera��es secund�rias
	 */
	public boolean pilhaVazia();
	public void imprimePilha();
}
