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
