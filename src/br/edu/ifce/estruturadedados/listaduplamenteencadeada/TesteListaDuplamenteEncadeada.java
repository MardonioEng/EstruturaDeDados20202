package br.edu.ifce.estruturadedados.listaduplamenteencadeada;

public class TesteListaDuplamenteEncadeada {
	public static void main(String[] args) {
		
		TADListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<String>();
		
		lista.imprimelista();
		
		lista.insereValor("a", 0);
		lista.imprimelista();
		
		lista.insereValor("a", 1);
		lista.imprimelista();
		
		lista.insereValor("d", 2);
		lista.imprimelista();
		
		lista.insereValor("c", 2);
		lista.imprimelista();
		
		lista.insereValor("b", 2);
		lista.imprimelista();
		
		lista.insereValor("e", 6);
		lista.imprimelista();
		
		lista.insereValor("e", 5);
		lista.imprimelista();
		
		lista.removeValor(0);
		lista.imprimelista();
		
		lista.removeValor(6);
		lista.imprimelista();
		
		lista.removeValor(1);
		lista.imprimelista();
		
		lista.removeValor(4);
		lista.imprimelista();
		
		lista.removeValor(2);
		lista.imprimelista();
		
		lista.removeValor(2);
		lista.imprimelista();
		
		lista.removeValor(1);
		lista.imprimelista();
		
		
	}
}
