package br.edu.ifce.estruturadedados.fila;

public class Fila implements TADFila {

	private Integer[] fila;
	private int posicao;
	
	
	public Fila(int tamanho) {
		fila = new Integer[tamanho];
		posicao = -1;
	}
	
	@Override
	public void insereFinal(Integer value) {
		//Realiza validações
		if(filaCheia()) {
			System.out.println("Fila cheia. Elemento " + value + " não inserido.");
			return;
		}
		
		fila[++posicao] = value;
		
	}

	@Override
	public Integer removeInicio() {
		//Realiza as validações
		if(filaVazia()) {
			System.out.println("Fila vazia. Elemento não removido.");
			return null;
		}
		Integer temp = fila[0];
		for(int i = 0; i < posicao; i++) {
			fila[i] = fila[i + 1];
		}
		fila[posicao--] = null;
		
		return temp;
	}

	@Override
	public boolean filaCheia() {
		return (posicao == fila.length - 1) ? true : false;
	}

	@Override
	public boolean filaVazia() {
		return (posicao == -1) ? true : false;
	}

	@Override
	public void imprimeFila() {
		if(filaVazia()) {
			System.out.println("Fila vazia.");
			return;
		}
		
		for(int i = 0; i <= posicao; i++) {
			System.out.print(fila[i] + "\t");
		}
		System.out.println();
	}

}
