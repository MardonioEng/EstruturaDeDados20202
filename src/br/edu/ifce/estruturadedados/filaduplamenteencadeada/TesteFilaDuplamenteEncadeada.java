package br.edu.ifce.estruturadedados.filaduplamenteencadeada;

public class TesteFilaDuplamenteEncadeada {

	public static void main(String[] args) {
		
		TADFila<String> fila = new FilaDuplamenteEncadeada<String>();
		
		fila.imprime();
		
		fila.insereFinal("a");
		fila.imprime();
		
		fila.insereFinal("b");
		fila.imprime();
		
		fila.insereFinal("c");
		fila.imprime();
		
		fila.removeInicio();
		fila.imprime();
		
		fila.insereFinal("b");
		fila.imprime();
		
		fila.removeInicio();
		fila.imprime();
		
		fila.removeInicio();
		fila.imprime();
		
		fila.removeInicio();
		fila.imprime();
		
	}
	
}
