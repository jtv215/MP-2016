package org.mp.sesion01;

/**
 * Clase Carta.
 */
public class Carta implements Comparable {

	/** The palo. */
	private String palo;

	/** The numero. */
	private int numero;

	/** The valor. */
	private double valor;

	/**
	 * Inicializa una nueva carta.
	 *
	 * @param palo the palo
	 * @param numero the numero
	 */
	public Carta(String palo, int numero) {
		this.palo = palo;
		this.numero = numero;
		if (palo.equals("O")) {
			valor = numero;
		} else if (palo.equals("C")) {
			valor = numero * 100;
		} else if (palo.equals("E")) {
			valor = numero * 10000;
		} else if (palo.equals("B")) {
			valor = numero * 1000000;
		}
	}

	/**
	 * Devuelve el palo de la carta.
	 *
	 * @return the palo
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * Devuelve el numero de la carta.
	 *
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Devuelve el valor de la carta.
	 *
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * Duplica la carta.
	 *
	 * @return the carta
	 */
	public Carta clone() {
		return new Carta(palo, numero);
	}

	/**
	 * Equals, compara si los valores son iguales.
	 *
	 * @param c the c
	 * @return true, if successful
	 */
	public boolean equals(Carta c) {
		return (this.palo.equals(c.palo) && this.numero == c.numero) ? true : false;
	}

	/**
	 * Describe la carta.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Inf carta:\n" + numero + "de " + palo + "\nValor: " + valor;
	}

	/**
	 * Dice que objeto es mayor, menor o si son iguales.
	 *
	 * @param o the o
	 * @return the int
	 */
	@Override
	public int compareTo(Object o) {
		Carta carta = (Carta) o;
		if (this.valor == carta.valor) {
			return 0;
		} else if (this.valor > carta.valor) {
			return 1;
		} else {
			return -1;
		}
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
