package br.edu.ifce.estruturadedados.pilha;

/**
 */
public interface TADPilha {

	/**
	 * Operações principais
	 * 
	 */
	public void adicionaTopo(Integer value);
	public Integer removeTopo();
	
	/**
	 * Operacações secundárias
	 * 
	 */
	public boolean pilhaCheia();
	public boolean pilhaVazia();
	
	public void imprimePilha();
}
