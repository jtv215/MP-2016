package org.mp.sesion05;

/**
 * The Class SolucionesBusqueda.
 */
public class SolucionesBusqueda {

	/** The num elementos. */
	private int numElementos;

	/** The datos. */
	private int[] datos; // devuelve todo array

	/** The num buscado. */
	private int numBuscado;

	/**
	 * Busqueda lineal.
	 *
	 * @param busqueda the busqueda
	 * @return the int
	 * @throws ElementoNoEncontradoException the elemento no encontrado exception
	 */
	public static int busquedaLineal(Busqueda busqueda) throws ElementoNoEncontradoException {
		int n = busqueda.getNumElementos();
		int b = busqueda.getNumBuscado();

		for (int i = 0; i < n; i++) {
			if (b == busqueda.getDatos()[i]) {
				return i;
			}

		}
		throw new ElementoNoEncontradoException("No encontrado");

	}

	/**
	 * Busqueda binaria iter.
	 *
	 * @param busqueda the busqueda
	 * @return the int
	 * @throws ElementoNoEncontradoException the elemento no encontrado exception
	 */
	public static int busquedaBinariaIter(Busqueda busqueda) throws ElementoNoEncontradoException {
		// TODO Auto-generated method stub
		int inicio = 0;
		int fin = busqueda.getNumElementos() - 1;
		int centro;
		int b = busqueda.getNumElementos() - 1;
		// compruebo los lados;
		if (b < busqueda.getDatos()[inicio] || b > busqueda.getDatos()[fin]) {
			throw new ElementoNoEncontradoException("No encontrado");
		}
		while (inicio <= fin) {
			centro = (inicio + fin) / 2;
			if (b == busqueda.getDatos()[centro]) { // si es el centro
													// devuelvemelo
				return centro;
			} else if (b < busqueda.getDatos()[centro]) {// si esta en la
															// izquierda
				fin = centro - 1;
			} else {
				inicio = centro + 1;
			}

		}
		throw new ElementoNoEncontradoException("No encontrado");
	}

	/**
	 * Busqueda binaria rec.
	 *
	 * @param busqueda the busqueda
	 * @return the object
	 * @throws ElementoNoEncontradoException the elemento no encontrado exception
	 */
	public static Object busquedaBinariaRec(Busqueda busqueda) throws ElementoNoEncontradoException {

		return busquedaBinariaRec(busqueda, 0, busqueda.getNumElementos() - 1);
	}

/**
 * Busqueda binaria rec.
 *
 * @param busqueda the busqueda
 * @param inicio the inicio
 * @param fin the fin
 * @return the int
 * @throws ElementoNoEncontradoException the elemento no encontrado exception
 */
	private static int busquedaBinariaRec(Busqueda busqueda, int inicio, int fin) throws ElementoNoEncontradoException{
		if(inicio>fin){//condicion de parada
			throw new ElementoNoEncontradoException("No encontrado");
		}int centro=(inicio+fin)/2;
		int b=busqueda.getNumBuscado();//variable auxiliar
		if(b==busqueda.getDatos()[centro]){
			return centro;
		}else if (b<busqueda.getDatos()[centro]){
			return busquedaBinariaRec(busqueda,inicio,centro-1);
		}else{
			return busquedaBinariaRec(busqueda,centro+1,fin);
		}
	}}