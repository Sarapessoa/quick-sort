import java.util.Arrays;
import java.util.Random;

public class Main {
	
	public static int[] gerarVetor(int tam) {
		int[] vetor = new int[tam];
		
		for(int i = 0; i < tam; i++) {
			vetor[i] = gerarNumero();
		}
		
		return vetor;
	}
	
	public static int gerarNumero() {
		Random r = new Random();
		
		int num = r.nextInt(100);
		
		return num;
	}

	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		
		
		int[] vetor = gerarVetor(10);
		
		System.out.println("Vetor Normal:");
		System.out.println(Arrays.toString(vetor));
		
		q.quickSort(vetor, 0, vetor.length - 1);
		
		System.out.println("Vetor Ordenado");
		System.out.println(Arrays.toString(vetor));
		
	}

}
