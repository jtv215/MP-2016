package org.mp.sesion05;

/**
 * Clase Carta.
 */
public class Carta implements Comparable {

	/** The palo. */
	private String palo;

	/** The numero. */
	private int numero;

	/** The valor. */
	private int valor;

	/**
	 * Inicializa una nueva carta.
	 *
	 * @param palo the palo
	 * @param numero the numero
	 */
	public Carta(String palo, int numero) {
		this.palo = palo;
		this.numero = numero;
		int fila = 0;
		switch (palo) {
		case "B":
			fila++;
		case "E":
			fila++;
		case "C":
			fila++;
		default:
			break;
		}
		int columna = numero;
		if (numero > 7) {
			columna -= 2;
		}
		this.valor = fila * 10 + columna-1;
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
	public int getValor() {
		return valor;
	}

	/**
	 *  Duplica la carta.
	 *
	 * @return the carta
	 */
	public Carta clone() {
		return new Carta(palo, numero);
	}

	/**
	 * Equals, compara si los valores son iguales.
	 *
	 * @param o the o
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Carta))
			return false;
		Carta otra=(Carta) o;
		return this.valor == otra.valor;
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
