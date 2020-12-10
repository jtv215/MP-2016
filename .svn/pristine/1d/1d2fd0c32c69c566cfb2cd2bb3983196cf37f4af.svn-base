package org.mp.sesion05;

import java.util.Arrays;

/**
 * The Class Ordenacion.
 */
public class Ordenacion {

	/**
	 * Ordenacion por insercion.
	 *
	 * @param temp the temp
	 */
	public static void ordenacionPorInsercion(Comparable[] temp) {

		ordenacionPorInsercion(temp, 0, temp.length - 1);

	}

	/**
	 * Ordenacion por insercion.
	 *
	 * @param a the a
	 * @param izq the izq
	 * @param der the der
	 */
	private static void ordenacionPorInsercion(Comparable[] a, int izq, int der) {
		for (int i = izq; i <= der; i++) {
			Comparable temp = a[i];
			int pos = i; // nos movemos a la izq

			while (pos > izq && temp.compareTo(a[pos - 1]) < 0) {// compara con
																	// la
																	// posicio
																	// izq
				a[pos] = a[pos - 1];
				pos--;
			}
			a[pos] = temp;
		}
	}



	/**
	 * Merge sort.
	 *
	 * @param a the a
	 */
	public static void mergeSort(Comparable[] a) {
		Comparable[] vectorTemp = new Comparable[a.length];
		mergeSort(a, vectorTemp, 0, a.length - 1);

	}

	/**
	 * Merge sort.
	 *
	 * @param a the a
	 * @param aux the aux
	 * @param izq the izq
	 * @param der the der
	 */
	private static void mergeSort(Comparable[] a, Comparable[] aux, int izq, int der) {
		if (izq < der) {
			int centro = (izq + der) / 2;
			mergeSort(a, aux, izq, centro);//Division izquieda
			mergeSort(a, aux, centro + 1, der);//Division derecha
			mezclar(a,aux,izq,centro,der);
		}
	}

	/**
	 * Mezclar.
	 *
	 * @param a the a
	 * @param aux the aux
	 * @param izq the izq
	 * @param centro the centro
	 * @param der the der
	 */
	private static void mezclar(Comparable[] a, Comparable[] aux, int izq, int centro, int der) {
		// TODO Auto-generated method stub
		for (int i = izq; i <= der; i++) {
			aux[i]=a[i];

		}
		//auxiliares para comparar
		int i=izq;
		int j=centro+1;
		int k=izq;//este es el que sube
		while(i<=centro && j<=der){
			if(aux[i].compareTo(aux[j]) <=0){
				a[k]=aux[i];
			k++;
			i++;
		}else{
			a[k]=aux[j];
			k++;
			j++;
		}
		}

	while(i<=centro){
		a[k]=aux[i];
		k++;
		i++;
	}
}

	/**
	 * Sort.
	 *
	 * @param a the a
	 */
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a) {
		Arrays.sort(a);

	}
}



