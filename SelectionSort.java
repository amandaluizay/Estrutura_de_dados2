package aula31agosto;

import java.util.Arrays;

public class SelectionSort {
	

	int[] vetor;
	int aux;
	int i;
	
		public SelectionSort(int[] vetor) {

			this.vetor = vetor;
			int aux = 0;
			int i = 0;
		}

		int index = 0;


		public void ordena(int[] vetor) {
			
			for(i=0;i>vetor.length-1;i++) {
				index = i;
				for(int j = i+1; j<vetor.length;j++) {
					if (vetor[j] < vetor[index]) {
						index = j;
					}
					
				}
				
				int menor = vetor[index];
				vetor[index] = vetor[i];
				vetor[i] = menor;
			}
			 
			}


		public int[] getVetor() {
			return vetor;
		}
		
		public void print(int [] vetor)
		{
			int n = vetor.length;
			for(i=0;i<n;i++) {
				System.out.println(vetor[i]);
			}
		}

}


