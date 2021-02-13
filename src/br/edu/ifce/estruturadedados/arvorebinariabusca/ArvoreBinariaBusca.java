package br.edu.ifce.estruturadedados.arvorebinariabusca;

public class ArvoreBinariaBusca {

	private BTSNode raiz;

	public void insereNo(Integer valor, BTSNode noBase) {

		// Verificar se o nó raiz existe
		if (raiz == null) {
			raiz = new BTSNode(valor, null, null, null);
			return;
		}

		// Procura um local para inserir a direita
		if (valor > noBase.getValor()) {
			if (noBase.getDir() == null) {
				BTSNode novoNo = new BTSNode(valor, noBase, null, null);
				noBase.setDir(novoNo);
			} else {
				insereNo(valor, noBase.getDir());
			}
			// Procura um local para inserir a esquerda
		} else if (valor < noBase.getValor()) {
			if (noBase.getEsq() == null) {
				BTSNode novoNo = new BTSNode(valor, noBase, null, null);
				noBase.setEsq(novoNo);
			} else {
				insereNo(valor, noBase.getEsq());
			}
		} else if (valor == noBase.getValor()) {
			System.out.println("Valor " + valor + "já foi inserido na árvore!");
		}

	}

	public BTSNode pesquisaNo(Integer valor, BTSNode noBase) {
		if (noBase == null) {
			return null;
		}
		if (valor == noBase.getValor()) {
			return noBase;
		}
		if (valor < noBase.getValor()) {
			return pesquisaNo(valor, noBase.getEsq());
		} else {
			return pesquisaNo(valor, noBase.getDir());
		}
	}

	public int profundidadeRecursiva(BTSNode noBase) {
		if (noBase == null || noBase.equals(raiz)) {
			return 0;
		} else {
			return 1 + profundidadeRecursiva(noBase.getPai());
		}
	}

	public int alturaNo(BTSNode noBase) {
		if (noBase == null || isFolha(noBase)) {
			return 0;
		} else {
			return 1 + Math.max(alturaNo(noBase.getEsq()), alturaNo(noBase.getDir()));
		}
	}

	public boolean isFolha(BTSNode no) {
		if (no.getEsq() == null && no.getDir() == null) {
			return true;
		}
		return false;
	}

	public void imprimirPrefixado(BTSNode noBase) {
		if (noBase != null) {
			System.out.print(noBase.getValor() + "\t");
			imprimirPrefixado(noBase.getEsq());
			imprimirPrefixado(noBase.getDir());
		}
	}

	public void imprimirInterfixado(BTSNode noBase) {
		if (noBase != null) {
			imprimirPrefixado(noBase.getEsq());
			System.out.print(noBase.getValor() + "\t");
			imprimirPrefixado(noBase.getDir());
		}
	}

	public void imprimirPosfixado(BTSNode noBase) {
		if (noBase != null) {
			imprimirPrefixado(noBase.getEsq());
			imprimirPrefixado(noBase.getDir());
			System.out.print(noBase.getValor() + "\t");
		}
	}

	public BTSNode getRaiz() {
		return raiz;
	}

}
