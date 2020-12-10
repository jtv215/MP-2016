package org.mp.sesion06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * The Class ConjuntoDatos.
 */
public class ConjuntoDatos {

	/** The archivo texto. */
	private File archivoTexto;

	/** The separador. */
	private String separador;

	/** The locale. */
	private Locale locale;

	/** The cabecera. */
	@SuppressWarnings("rawtypes")
	private List cabecera;

	/** The numero lineas. */
	private int numeroLineas;

	/** The numero columnas. */
	private int numeroColumnas;

	/** The datos. */
	private double[][] datos;

	/**
	 * Instantiates a new conjunto datos.
	 *
	 * @param archivoTexto the archivo texto
	 * @param separador the separador
	 * @param locale the locale
	 */
	public ConjuntoDatos(File archivoTexto, String separador, Locale locale) {
		this.archivoTexto = archivoTexto;
		this.separador = separador;
		this.locale = locale;
		this.cabecera = cabecera(archivoTexto);
		this.numeroLineas = numeroLineas(archivoTexto);
		this.numeroColumnas = numeroColumnas(archivoTexto);
		this.datos = leerDatos(archivoTexto, numeroLineas, numeroColumnas);

	}

	/**
	 * Cabecera.
	 *
	 * @param archivoTexto the archivo texto
	 * @return the list
	 */
	@SuppressWarnings("resource")
	private List<String> cabecera(File archivoTexto) {
		try {
			Scanner sc = new Scanner(archivoTexto);
			String s = sc.nextLine();//lee una cadena de texto
			StringTokenizer st = new StringTokenizer(s, separador);
			ArrayList<String> ll = new ArrayList<String>();
			while (st.hasMoreTokens()) {
				ll.add(st.nextToken());
			}
			return ll;
		} catch (FileNotFoundException e) {
			//  Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Numero lineas.
	 *
	 * @param archivoTexto2 the archivo texto2
	 * @return the int
	 */
	@SuppressWarnings("resource")
	private int numeroLineas(File archivoTexto) {
		try {
			Scanner sc = new Scanner(archivoTexto);
			sc.nextLine();//para no contar la cabezera salto la linea
			int contador = 0;
			while (sc.hasNextLine()) {
				contador++;
				sc.nextLine();
			}
			return contador;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * Numero columnas.
	 *
	 * @param archivoTexto the archivo texto
	 * @return the int
	 */
	private int numeroColumnas(File archivoTexto) {
		return cabecera(archivoTexto).size();

	}
  
	/**
	 * Leer datos.
	 *
	 * @param archivoTexto the archivo texto
	 * @param linea the linea
	 * @param columna the columna
	 * @return the double[][]
	 */
	@SuppressWarnings("resource")
	private double[][] leerDatos(File archivoTexto, int linea, int columna) {

		double[][] matriz = new double[linea][columna];
		try {
			Scanner sc = new Scanner(archivoTexto);
			sc.nextLine();
			int contLinea = 0;
			int contColum = 0;
			while (sc.hasNextLine() && contLinea < linea) {
				contColum = 0;
				String s = sc.nextLine();
				StringTokenizer st = new StringTokenizer(s, separador);
				while (st.hasMoreTokens() && contColum < columna) {
					matriz[contLinea][contColum] = Double.parseDouble(st.nextToken());
					contColum++;
				}
				contLinea++;
			}
			return matriz;
		} catch (FileNotFoundException e) {
			//  Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * Gets the columna.
	 *
	 * @param columna the columna
	 * @return the columna
	 */
	public double[] getColumna(int columna) {
		if (columna < 0 || columna >= this.numeroColumnas) {
			throw new IndexOutOfBoundsException();
		}
		double[] array = new double[this.numeroLineas];
		for (int i = 0; i < this.numeroLineas; i++) {
			array[i] = datos[i][columna];
		}

		return array;
	}

	/**
	 * Gets the columna.
	 *
	 * @param columna the columna
	 * @return the columna
	 */
	public double[] getColumna(String columna) {
		int indice = this.cabecera.indexOf(columna);
		if (indice == -1) {
			throw new IndexOutOfBoundsException();
		}
		return getColumna(indice);
	}


	/**
	 * Gets the cabecera.
	 *
	 * @return the cabecera
	 */
	@SuppressWarnings("rawtypes")
	public List getCabecera() {

		return cabecera;
	}

	/**
	 * Gets the separador.
	 *
	 * @return the separador
	 */
	public String getSeparador() {
		return separador;
	}
	/**
	 * Gets the archivo texto.
	 *
	 * @return the archivo texto
	 */
	/**
	 * Gets the locale.
	 *
	 * @return the locale
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * Gets the numero lineas.
	 *
	 * @return the numero lineas
	 */
	public int getNumeroLineas() {

		return numeroLineas;
	}

	/**
	 * Gets the numero columnas.
	 *
	 * @return the numero columnas
	 */
	public int getNumeroColumnas() {
		return numeroColumnas;
	}

	/**
	 * Gets the datos.
	 *
	 * @return the datos
	 */
	public double[][] getDatos() {
		return datos;
	}
	public File getArchivoTexto() {
		return archivoTexto;
	}


	/**
	 * Exportar.
	 *
	 * @param cabecera the cabecera
	 * @param archivoTexto the archivo texto
	 * @param separador the separador
	 */
	public void exportar(String[] cabecera, String archivoTexto, String separador) {
		//TODO
		File f = new File(archivoTexto);

		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			String s = "";
			for (int i = 0; i < cabecera.length; i++) {
				s += cabecera[i];
				if (i < cabecera.length - 1) {
					s += separador;
				}
			}
			pw.println(s);
			for (int i = 0; i < this.numeroLineas; i++) {
				s = "";
				for (int j = 0; j < cabecera.length; j++) {
					int k = this.cabecera.indexOf((cabecera[j]));
					s += datos[i][k];
					if (j < cabecera.length - 1) {
						s += separador;
					}
				}pw.println(s);
			}


			pw.close();
			fw.close();
		} catch (IOException e) {
			//  Auto-generated catch block
			e.printStackTrace();
		}

	}


	/**
	 * Conjunto datos.
	 *
	 * @param cabecera the cabecera
	 * @param archivoTexto the archivo texto
	 * @param separador the separador
	 * @param locale the locale
	 * @return the conjunto datos
	 */
	//crea un conjuntos de datos y devuelve el conjuto de datos
		public ConjuntoDatos conjuntoDatos(String[] cabecera, String archivoTexto, String separador, Locale locale) {
			//TODO
			exportar(cabecera, archivoTexto, separador);
			return new ConjuntoDatos(new File(archivoTexto), separador, locale);
		}
}
