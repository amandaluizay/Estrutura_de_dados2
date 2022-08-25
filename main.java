package aula24;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho:  "));
		Vetor v = new Vetor(qtd);
		v.preencherVetor();
		v.imprimirVetor();
		
		int busca = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado:  "));

				
		 BuscaBinaria bb = new BuscaBinaria();
		 bb.realizarBuscaBinaria(v.getVetor(), busca);

	}

}
