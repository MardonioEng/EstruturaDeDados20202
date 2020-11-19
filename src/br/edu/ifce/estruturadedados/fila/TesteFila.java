package br.edu.ifce.estruturadedados.fila;

public class TesteFila {
	public static void main(String[] args) {
		Fila fila = new Fila(3);
		
		fila.insereFinal(3);
		fila.insereFinal(2);
		fila.insereFinal(1);
		fila.insereFinal(1);
		fila.imprimeFila();
		
		fila.removeInicio();
		fila.removeInicio();
		fila.imprimeFila();
		
	}
}
