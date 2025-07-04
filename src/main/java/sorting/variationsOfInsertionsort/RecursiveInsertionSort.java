package sorting.variationsOfInsertionsort;

import sorting.AbstractSorting;

public class RecursiveInsertionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementacaoo RECURSIVA do insertion sort. Para isso, tente definir o 
	 * caso base do algoritmo e depois o caso recursivo, que reduz o problema 
	 * para uma entrada menor em uma chamada recursiva. Seu algoritmo deve 
	 * ter complexidade quadratica O(n^2).
	 * 
	 * Restrições:
	 *  - voce NAO pode utilizar array auxiliar
	 *  - voce pode utilizar variaveis temporarias
	 *  - voce NAO pode declarar novos atributos na classe
	 *  - para as trocas no array, utilize o metodo Util.swap
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		

		if (leftIndex < 0 || leftIndex > rightIndex || rightIndex > array.length || leftIndex > array.length || rightIndex < 0) {

		} 

		if (leftIndex == rightIndex) {

		} else {
			T key = array[leftIndex + 1];
			int i = leftIndex;
			while (i >= 0 && (key.compareTo(array[i]) < 0)) { 
				util.Util.swap(array, i + 1, i);
				i--;
			}

			sort(array, leftIndex + 1, rightIndex);
		}
	}
}