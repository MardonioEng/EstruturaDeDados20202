package br.edu.ifce.estruturadedados.fila;

/**
 * 
 * @author Mardonio Rodrigues
 *
 */
public interface TADFila {

	/**
	 * Operações principais
	 */
	public void insereFinal(Integer value);
	public Integer removeInicio();
	
	/**
	 * Operações secundárias
	 */
	public boolean filaCheia();
	public boolean filaVazia();
	
	public void imprimeFila();
}
