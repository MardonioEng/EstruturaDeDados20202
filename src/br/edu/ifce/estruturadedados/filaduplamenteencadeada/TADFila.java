package br.edu.ifce.estruturadedados.filaduplamenteencadeada;

/**
 * TAD (Tipo Abstrato de Dados) que representa a fila
 * 
 * @author Mardonio Rodrigues
 *
 * @since 27/01/2021
 *
 */
public interface TADFila<T> {

	/**
	 * Opera��es principais
	 */
	public void insereFinal(T valor);
	public T removeInicio();
	
	/**
	 * Opera��es secund�rias
	 */
	public boolean filaVazia();
	public void imprime();
	
}
