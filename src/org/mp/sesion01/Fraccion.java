package org.mp.sesion01;

/**
 * Clase Fraccion.
 */

public class Fraccion {

	/** The numerador. */
	private int numerador;

	/** The denominador. */
	private int denominador;

	/** The num fracciones. */
	private static int numFracciones = 0;

	/**
	 *  construcor por defecto.
	 */
	public Fraccion() { // construcor por defecto
		numerador = 0;
		denominador = 1;
		numFracciones++;
	}

	/**
	 * crea los objetos y lo inicializa.
	 *
	 * @param numerador the numerador
	 * @param denominador the denominador
	 */
	public Fraccion(int numerador, int denominador) { // crea los objetos y lo
														// inicializa
		super();
		this.numerador = numerador;
		this.denominador = denominador;
		numFracciones++;

	}

	/**
	 * Equals, compara si los valores son iguales.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Fraccion)) // object es cualquier objeto ,no hay
										// instancia de de fraccion
			return false;
		Fraccion otro = (Fraccion) obj; // compara
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
	 * @return the num fracciones
	 */
	public static int getNumFracciones() {
		return numFracciones;
	}

	/**
	 *  Suma una fracciones pasada por parametro a la creada por defecto.
	 *
	 * @return the string
	 */
	@Override
	public String toString() { // escriba siguien un determinado formato
		if (denominador == 1) {
			return numerador + "";
		} else {
			return numerador + "/" + denominador;
		}
	}

	/*
	 * otro toString
	 *
	 * @Override public String toString() { if (den == 1) return num + ""; else
	 * return num + "/" + den; }
	 */
	/**
	 *  Suma dos fracciones pasadas por parametros.
	 *
	 * @param b the b
	 * @return the fraccion
	 */
	public Fraccion sumar(Fraccion b) {
		int num = numerador * b.getDenominador() + denominador
				* b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	/*
	 * public static Fraccion sumar(Fraccion a, Fraccion b) { Fraccion c = new
	 * Fraccion(); c.num = a.num * b.den + b.num * a.den; c.den = a.den * b.den;
	 * return c; }
	 */
	/**
	 * Método de clase que permite sumar dos fracciones.
	 *
	 * @param a the a
	 * @param b the b
	 * @return suma a + b
	 */

	public static Fraccion sumar(Fraccion a, Fraccion b) {
		int num = a.getNumerador() * b.getDenominador() + b.getNumerador()
				* a.getDenominador();
		int den = a.getDenominador() * b.getDenominador();
		return new Fraccion(num, den);
	}

	/**
	 *  Resta una fracciones pasada por parametro a la creada por defecto.
	 *
	 * @param b the b
	 * @return the fraccion
	 */
	public Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador
				* b.getNumerador();
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
		return new Fraccion(numerador * b.getNumerador(), denominador
				* b.getDenominador());
	}

	/**
	 *  Divide una fraccion pasada por parametro y la creada por defecto.
	 *
	 * @param b the b
	 * @return the fraccion
	 */
	public Fraccion dividir(Fraccion b) {
		return new Fraccion(numerador * b.getDenominador(), denominador
				* b.getNumerador());
	}

	/**
	 * Devuelve el inverso de la fraccion.
	 *
	 * @return the fraccion
	 */
	public Fraccion inversa() {
		return new Fraccion(denominador, numerador);
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

	/*
	 * public Fraccion simplificar() { int dividir = mcd(numerador,
	 * denominador); int num = numerador / dividir; int den = denominador /
	 * dividir; return new Fraccion(num, den); }
	 */

}
