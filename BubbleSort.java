package bubbleSort;

public class BubbleSort {
	int[] vetor = {1, 6, 7, 5,2, 4,3 };
	int aux = 0;
	int i = 0;


	public void ordena(int[] vetor) {
		
		for(i=0;i<7;i++) {
			for(int j = 0; j<6;j++) {
				if (vetor[j] > vetor[j+1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
		for (i=0;i<7;i++) {
			System.out.println(vetor[i]);
		}
	}
		
	
	public int[] getVetor() {
		return vetor;
	}

		}
