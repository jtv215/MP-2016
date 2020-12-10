package org.mp.sesion02;

/**
 * Clase Busqueda.
 */
public class Busqueda {

	/**
	 * Busqueda binaria.
	 *
	 * @param <E>
	 *            the element type
	 * @param a
	 *            the a
	 * @param clave
	 *            the clave
	 * @return the int
	 * @throws ExcepcionArrayVacio
	 *             the excepcion array vacio
	 */
public static <E extends Comparable<E>> int busquedaBinaria(E[] a, E clave) throws ExcepcionArrayVacio {

		if (a.length == 0) {
			throw new ExcepcionArrayVacio("Array vacio");
		} else {
			int primero = 0;
			int ultimo = a.length - 1;
			int central;
			if (clave.compareTo(a[0]) < 0 || clave.compareTo(a[a.length - 1]) > 0) {// clave
																					// menor
																					// que
																					// el
																					// primer
																					// valor
				return -1;// o mayor que el ultimo valor
			} else {
				while (ultimo >= primero) {
					central = (primero + ultimo) / 2;
					if (clave.compareTo(a[central]) < 0) {// subarray izquierdo
						ultimo = central - 1;
					} else if (clave.compareTo(a[central]) > 0) { // subarray
																	// derecho
						primero = central + 1;
					} else
						return central;
				}
				return -1;
			}
		}

	}

	/**
	 * Busqueda binaria.
	 *
	 * @param <E>
	 *            the element type
	 * @param enteros
	 *            the enteros
	 * @param clave
	 *            the clave
	 * @return the object
	 * @throws ExcepcionArrayVacio
	 *             the excepcion array vacio
	 */
	public static <E> Object busquedaBinaria(E[] enteros, E clave) throws ExcepcionArrayVacio {
		if (enteros.length == 0) {
			throw new ExcepcionArrayVacio("Array vacio");
		} else {
			int primero = 0;
			int ultimo = enteros.length - 1;
			int central;
			if (((Integer) clave).compareTo((Integer) enteros[0]) < 0
					|| ((Integer) clave).compareTo((Integer) enteros[enteros.length - 1]) > 0) {
				return -1;
			} else {
				while (ultimo >= primero) {
					central = (primero + ultimo) / 2;
					if (((Integer) clave).compareTo((Integer) enteros[central]) < 0) {
						ultimo = central - 1;
					} else if (((Integer) clave).compareTo((Integer) enteros[central]) > 0) {
						primero = central + 1;
					} else
						return central;
				}
				return -1;
			}
		}
	}

	/**
	 * Busqueda binaria.
	 *
	 * @param <E>
	 *            the element type
	 * @param fraccion
	 *            the fraccion
	 * @param clave
	 *            the clave
	 * @return the object
	 * @throws ExcepcionArrayVacio
	 *             the excepcion array vacio
	 */
	@SuppressWarnings("rawtypes")
	public static <E> Object busquedaBinaria(Fraccion[] fraccion, Fraccion clave) throws ExcepcionArrayVacio {
		if (fraccion.length == 0) {
			throw new ExcepcionArrayVacio("Array vacio");
		} else {
			int primero = 0;
			int ultimo = fraccion.length - 1;
			int central;
			if (((Fraccion) clave).compareTo((Fraccion) fraccion[0]) < 0
					|| ((Fraccion) clave).compareTo((Fraccion) fraccion[fraccion.length - 1]) > 0) {
				return -1;
			} else {
				while (ultimo >= primero) {
					central = (primero + ultimo) / 2;
					if (((Fraccion) clave).compareTo((Fraccion) fraccion[central]) < 0) {
						ultimo = central - 1;
					} else if (((Fraccion) clave).compareTo((Fraccion) fraccion[central]) > 0) {
						primero = central + 1;
					} else
						return central;
				}
				return -1;
			}

		}
	}

}
