package br.edu.ifce.estruturadedados.lista;

/**
 * Tipo Abstrato de Dados (TAD) da lista
 * 
 * @author Mardonio
 *
 */
public interface TADLista<T> {
	
	/**
	 * Opera��es principais
	 */
	public void insereValor(T valor, int indice);
	public T removeValor(int indice);
	
	/**
	 * Opera��es secund�rias
	 */
	public boolean listaCheia();
	public boolean listaVazia();
	
	public void imprimeLista();
}
