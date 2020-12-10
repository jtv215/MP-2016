package org.mp.sesion04;

import org.mp.tema04.GenericStack;

/**
 * The Class PilaPrimos.
 */
public class PilaPrimos {

	/** The limite. */
	private int limite;

	/** The pila. */
	private GenericStack<Integer> pila;

	/**
	 * Instantiates a new pila primos.
	 *
	 * @param limite
	 *            the limite
	 */
	public PilaPrimos(int limite) {
		this.limite = limite;
		pila = new GenericStack<Integer>();

		for (int i = 2; pila.getSize() < limite; i++) {
			if (esPrimo(i)) {
				pila.push(i);

			}
		}
	}

	/**
	 * Gets the limite.
	 *
	 * @return the limite
	 */
	public int getLimite() {
		return limite;
	}

	/**
	 * Obtener pila primos.
	 *
	 * @return the generic stack
	 */
	public GenericStack<Integer> obtenerPilaPrimos() {
		return this.pila;
	}

	/**
	 * Mostrar primos.
	 *
	 * @param pila
	 *            the pila
	 * @return the string
	 */
	public String mostrarPrimos(GenericStack<Integer> pila) {
		String s = "";
		int cont = 0;
		while (!pila.isEmpty()) {
			s += "\t" + pila.pop();
			cont++;
			if (cont % 10 == 0) {
				s += "\n";
			}
		}
		return s;
	}

	/**
	 * Es primo.
	 *
	 * @param actual
	 *            the actual
	 * @return true, if successful
	 */
	public static boolean esPrimo(int actual) {

		boolean primo = true;
		for (int divisor = 2; divisor < actual && primo; divisor++) {
			if (actual % divisor == 0) {
				primo = false;
			}
		}
		if (primo)
			return true;
		else
			return false;
	}
}