package org.mp.sesion04;

import java.util.EmptyStackException;
import java.util.StringTokenizer;

/**
 * The Class Evaluador.
 */
public class Evaluador {

	/** The sumar. */
	private final char SUMAR = '+';

	/** The restar. */
	private final char RESTAR = '-';

	/** The multiplicar. */
	private final char MULTIPLICAR = '*';

	/** The dividir. */
	private final char DIVIDIR = '/';

	/** The pila. */
	private GenericStack<Integer> pila;

	/**
	 *  constructor por defecto.
	 */
	public Evaluador() {
		this.pila = new GenericStack<Integer>();
	}

	/**
	 * Evaluar.
	 *
	 * @param expresion the expresion
	 * @return the string
	 */
	public String evaluar(String expresion) {
		if (soloDigitos(expresion)) {
			String s = "";
			StringTokenizer st = new StringTokenizer(expresion, " ");
			while (st.hasMoreTokens()) {
				s += st.nextToken();
			}
			return s;
		} else {
			String[] p = parser(expresion);
			try {
				int q = postfija(p);
				return "" + q;
			} catch (ArithmeticException e) {
				return e.getMessage();
			}
		}
	}

	/**
	 * Parser.
	 *
	 * @param expresion the expresion
	 * @return the string[]
	 */
	public String[] parser(String expresion) {
		String temp = "";

		for (int x = 0; x < expresion.length(); x++) {
			if (esOperador(expresion.charAt(x) + ""))
				temp += " ";
			temp += expresion.charAt(x);
		}
		StringTokenizer sT = new StringTokenizer(temp, " ");
		String[] salida = new String[sT.countTokens()];
		int i = 0;
		while (sT.hasMoreTokens()) {
			salida[i] = sT.nextToken();
			i++;
		}
		return salida;
	}

	/**
	 * Postfija.
	 *
	 * @param expresion the expresion
	 * @return the int
	 */
	public int postfija(String[] expresion) throws EmptyStackException {
		for (int i = 0; i < expresion.length; i++) {
			if (esOperador(expresion[i])) {
				int ope2 = pila.pop();
				int ope1 = pila.pop();
				int r = evaluarOperacion(expresion[i].charAt(0), ope1, ope2);
				pila.push(r);
			} else {
				pila.push(Integer.parseInt(expresion[i]));
			}
		}
		return pila.pop();
	}

	/**
	 * Evaluar operacion.
	 *
	 * @param operacion the operacion
	 * @param op1 the op1
	 * @param op2 the op2
	 * @return the int
	 */
	private int evaluarOperacion(char operacion, int op1, int op2) {

		switch (operacion) {
		case SUMAR:
			return op1 + op2;
		case RESTAR:
			return op1 - op2;
		case MULTIPLICAR:
			return op1 * op2;
		case DIVIDIR:
			if (op2 == 0) {
				throw new ArithmeticException("No es posible una división por cero");
			} else
				return op1 / op2;
		default:
			return 0;
		}
	}

	/**
	 * Es operador.
	 *
	 * @param token the token
	 * @return true, if successful
	 */
	private boolean esOperador(String token) {
		if (token.length() != 1)
			return false;
		return evaluarOperacion(token.charAt(0), 9, 7) != 0;
	}

	/**
	 * Solo digitos.
	 *
	 * @param expresion the expresion
	 * @return true, if successful
	 */
	private boolean soloDigitos(String expresion) {
		StringTokenizer sT = new StringTokenizer(expresion, "0123456789 ");
		return sT.countTokens() == 0;
	}
}
