package org.mp.sesion02;

/**
 * Clase Fraccion con genérico.
 *
 * @param <E> the element type
 */
public class Fraccion <E> implements Comparable<E> {

	/** The numerador. */
	private int numerador;

	/** The denominador. */
	private int denominador;

	/**
	 *  construcor por defecto.
	 */
	public Fraccion() {
		numerador = 0;
		denominador = 1;
	}

	/**
	 * crea los objetos y lo inicializa.
	 *
	 * @param numerador the numerador
	 * @param denominador the denominador
	 */
	public Fraccion(int numerador, int denominador) {

		this.numerador = ((denominador > 0) ? 1 : -1) * numerador;
		this.denominador = Math.abs(denominador);

	}

	/**
	 * Equals, compara si los valores son iguales.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Fraccion))
			return false;
		Fraccion otro = (Fraccion) obj;
		if (denominador != otro.denominador)
			return false;
		if (numerador != otro.numerador)
			return false;
		return true;
	}

	/**
	 *  Devuelve el numerador de la fraccion.
	 *
	 * @return the numerador
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 *  Devuelve el denomindor de la fraccion.
	 *
	 * @return the denominador
	 */
	public int getDenominador() {
		return denominador;
	}

	/**
	 *  Describe la fraccion.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		if (denominador == 1)
			return numerador + "";
		else
			return numerador + "/" + denominador;
	}

	/**
	 *  suma una fracciones pasada por parametro a la creada por defecto.
	 *
	 * @param b the b
	 * @return the fraccion
	 */
	public Fraccion sumar(Fraccion b) {
		int num = numerador * b.getDenominador() + denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	/**
	 *  Resta una fracciones pasada por parametro a la creada por defecto.
	 *
	 * @param b the b
	 * @return the fraccion
	 */
	public Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}

	/**
	 *  Multiplica una fraccion pasada por parametro y la creada por defecto.
	 *
	 * @param b the b
	 * @return the fraccion
	 */
	public Fraccion multiplicar(Fraccion b) {
		return new Fraccion(numerador * b.getNumerador(), denominador * b.getDenominador());
	}

	/**
	 *  Divide una fraccion pasada por parametro y la creada por defecto.
	 *
	 * @param b the b
	 * @return the fraccion
	 */
	public Fraccion dividir(Fraccion b) {
		return new Fraccion(numerador * b.getDenominador(), denominador * b.getNumerador());
	}

	/**
	 *  Maximo comun divisor mediante euclides.
	 *
	 * @param u the u
	 * @param v the v
	 * @return the int
	 */
	private static int mcd(int u, int v) {
		u = Math.abs(u);
		v = Math.abs(v);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	/**
	 *  Simplifica fracciones.
	 *
	 * @return the fraccion
	 */
	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador /= dividir;
		denominador /= dividir;
		return this;
	}

	/**
	 *  Compara dos objetcos por su valor.
	 *
	 * @param o the o
	 * @return the int
	 */
	public int compareTo(Object o) {

		Fraccion otro = (Fraccion) o;

		double valorFraccion = (double) numerador / denominador;
		double valorOtro = (double) otro.getNumerador() / otro.getDenominador();

		if (valorFraccion > valorOtro)
			return 1;
		else if (valorFraccion < valorOtro)
			return -1;
		else
			return 0;

	}

}
