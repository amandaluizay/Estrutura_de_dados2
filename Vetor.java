package aula24;

import javax.swing.JOptionPane;

public class Vetor {
	private int vetor[];
	
	Vetor (int qtd){
		vetor = new int[qtd];
	}
	
	public int[] getVetor() {
		return vetor;
	}


	public void preencherVetor() {
		for (int i=0; i<vetor.length;i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + ( i+1) + "� n�mero: "));
		}
	}
	
	public void imprimirVetor() {
		for (int i=0; i< vetor.length; i++) {
			System.out.println(" " + vetor[i]);
		}
	}

}
