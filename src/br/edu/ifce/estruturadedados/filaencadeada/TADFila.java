package br.edu.ifce.estruturadedados.filaencadeada;

/**
 * TAD (Tipo Abstrato de Dados) que representa a fila
 * 
 * @author Mardonio Rodrigues
 *
 * @since 13/12/2020
 *
 */
public interface TADFila<T> {

	/**
	 * Operações principais
	 */
	public void insereFinal(T valor);
	public T removeInicio();
	
	/**
	 * Operações secundárias
	 */
	public boolean filaVazia();
	public void imprime();
	
}
