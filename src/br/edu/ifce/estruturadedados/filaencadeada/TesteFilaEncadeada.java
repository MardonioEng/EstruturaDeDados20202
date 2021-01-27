package br.edu.ifce.estruturadedados.filaencadeada;

public class TesteFilaEncadeada {
	public static void main(String[] args) {
		
		TADFila<Integer> fila = new Fila<Integer>();
		
		fila.imprime();
		
		fila.insereFinal(10);
		fila.imprime();
		
		fila.insereFinal(12);
		fila.imprime();

		fila.insereFinal(14);
		fila.imprime();
		
		fila.removeInicio();
		fila.imprime();
		
		fila.removeInicio();
		fila.imprime();
		
		fila.removeInicio();
		fila.imprime();
		
		fila.removeInicio();
		fila.imprime();
		
	}
}
