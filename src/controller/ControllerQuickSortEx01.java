package controller;

import br.edu.fateczl.QuickSort.OrdenacaoQuickSort;

public class ControllerQuickSortEx01 {

	public ControllerQuickSortEx01() {
		super();
	}
	
	public void ordenaVetorQuickSort01() {
		OrdenacaoQuickSort quickSortEx01 = new OrdenacaoQuickSort();
		
		int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		vetor = quickSortEx01.quickSort(vetor, 0, vetor.length - 1);
		
		for(int valor : vetor) {
			System.out.print(valor);
			System.out.print(" ");
		}
	}
}
