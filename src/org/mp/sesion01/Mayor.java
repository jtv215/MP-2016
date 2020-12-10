package org.mp.sesion01;


/**
 * La Clase Mayor.

 */

public class Mayor {

	/**
	 * elEnteroMayor.
	 *
	 * @param arr the arr
	 * @return El entero mayor del array
	 */


	public static Object elEnteroMayor(int[] arr) {


		if (arr.length == 0) {
			throw new RuntimeException("Array vacio");
		} else {
			int mayor = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > mayor)
					mayor = arr[i] ;
			}
			return mayor;
		}

	}

}
