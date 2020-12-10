package org.mp.sesion02;

import java.util.Iterator;

/**
 * Clase iterador de primos.
 */
public class IteradorPrimos implements Iterator<Integer> {

	/** The iterador primos. */
	@SuppressWarnings("unused")
	private Iterator<Integer> iteradorPrimos;

	/** The actual. */
	protected int actual = 1;

	/** The limite. */
	protected int limite;

	/**
	 *  Inicializa un nuevo iterador*.
	 *
	 * @param limite the limite
	 */
	public IteradorPrimos(int limite) {
		this.limite = limite;

	}

	/**
	 *  nos describe los primos.
	 *
	 * @return the string
	 */
	public String mostrarPrimos() {
		int columnas = 0;
		String cadena = "";
		while (hasNext()) {
			if (columnas == 10) {
				cadena += "\n";
				columnas = 0;
			}
			cadena += "\t" + actual;
			columnas++;
		}

		return cadena;
	}

	/**
	 * te muestra los primos *.
	 *
	 * @return the string
	 */
	public String mostrarPrimos1() {

		int columnas = 0;
		String cadena = "";

		for (int numero = 2; numero < limite; numero++) {
			boolean primo = esPrimo(numero);
			if (primo == true) {

				cadena += "\t" + numero;
				columnas++;

				if (columnas == 10) {
					cadena += "\n";
					columnas = 0;
				}

			} else
				cadena += "";
		}
		return cadena;
	}

	/**
	 *  Te comprueba si el numero es primo y te devuelve true o falso*.
	 *
	 * @param actual the actual
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

	/**
	 *  Te devuelve el limite*.
	 *
	 * @return the limite
	 */
	public Object getLimite() {
		return limite;
	}

	/**
	 *  Te devuelve actual*.
	 *
	 * @return the actual
	 */
	public Object getActual() {
		return actual;
	}

	/**
	 * Te devuele el actual modificado*.
	 *
	 * @return the integer
	 */
	@Override
	public Integer next() {
		return actual;
	}

	/**
	 *  llama una vez , y comprueba si hay siguiente.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean hasNext() {
		actual++;
		boolean primo = false;
		while (primo == false) {
			if (esPrimo(actual))
				primo = true;
			else
				actual++;

		}
		if (actual > limite)
			return false;
		else
			return true;
	}

	/**
	 *  elimina.
	 */
	@Override
	public void remove() {
		throw new UnsupportedOperationException("Método no soportado");
	}

}