package org.mp.sesion01;

/**
 * Clase Baraja.
 */
public class Baraja {

	/** Nombre baraja. */
	private String nombreBaraja;

	/** Cartas. */
	private Carta[] cartas;

	/**
	 * Inicializa una baraja.
	 *
	 * @param nombreBaraja the nombre baraja
	 * @param carta the carta
	 */
	public Baraja(String nombreBaraja, Carta[] carta) {
		this.nombreBaraja = nombreBaraja;
		cartas = new Carta[carta.length];
		for (int i = 0; i < cartas.length; i++) {
			cartas[i] = carta[i].clone();
		}

	}

	/**
	 * Devuelve el nombre de la baraja.
	 *
	 * @return the nombre baraja
	 */
	public String getNombreBaraja() {
		return nombreBaraja;
	}

	/**
	 * Devuelve las cartas.
	 *
	 * @return the cartas
	 */
	public Carta[] getCartas() {
		return cartas;
	}

	/**
	 * Describe la baraja.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		String aux = "";
		for (int i = 0; i > cartas.length; i++) {
			aux += cartas[i] + " \n";
		}
		return aux;
	}
	
	/**
	 *  ordena la baraja.
	 *
	 * @param a the a
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void insercion(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			Comparable aux = a[i];
			int j;
			for (j = i - 1; j >= 0 && aux.compareTo(a[j]) < 0; j--) {
				a[j + 1] = a[j];
			}
			// Inserto el elemento (aux) en a[j + 1]
			a[j + 1] = aux;
		}
	}

}
