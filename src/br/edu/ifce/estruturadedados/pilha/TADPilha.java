package br.edu.ifce.estruturadedados.pilha;

/**
 */
public interface TADPilha {

	/**
	 * Opera��es principais
	 * 
	 */
	public void adicionaTopo(Integer value);
	public Integer removeTopo();
	
	/**
	 * Operaca��es secund�rias
	 * 
	 */
	public boolean pilhaCheia();
	public boolean pilhaVazia();
	
	public void imprimePilha();
}
