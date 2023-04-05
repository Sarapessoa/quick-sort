
public class QuickSort {
	
	
	public void quickSort(int[] vetor, int inicio, int fim) {

		if(inicio < fim) {
			int posicaoPivo = particionar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo-1);
			quickSort(vetor, posicaoPivo+1, fim);
		}
	}
	
	private int particionar(int[] vetor, int inicio, int fim) {
		int i = inicio - 1;
		
		for(int j = inicio; j < fim; j++) {
			if(vetor[j] <= vetor[fim]) {
				troca(vetor, i+1, j);
				i++;
			}
		}
		troca(vetor,i+1,fim);
		
		return i + 1;
	}
	
	private void troca(int[] vetor, int inicio, int fim) {
		int temp = vetor[inicio];
		vetor[inicio] = vetor[fim];
		vetor[fim] = temp;
	}
}
