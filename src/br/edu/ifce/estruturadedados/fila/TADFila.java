package br.edu.ifce.estruturadedados.fila;

/**
 * 
 * @author Mardonio Rodrigues
 *
 */
public interface TADFila {

	/**
	 * Opera��es principais
	 */
	public void insereFinal(Integer value);
	public Integer removeInicio();
	
	/**
	 * Opera��es secund�rias
	 */
	public boolean filaCheia();
	public boolean filaVazia();
	
	public void imprimeFila();
}
