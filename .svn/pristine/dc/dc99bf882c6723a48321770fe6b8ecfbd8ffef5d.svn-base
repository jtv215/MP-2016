package org.mp.sesion06;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * The Class Estadistica.
 */
public class Estadistica {

	/** The cd. */
	private ConjuntoDatos cd;

	/**
	 * Instantiates a new estadistica.
	 *
	 * @param cd the cd
	 */
	public Estadistica(ConjuntoDatos cd) {
		this.cd = cd;
	}
	/**
	 * Media.
	 *
	 * @param columna the columna
	 * @return the double
	 */
	public double media(String columna) {
		DescriptiveStatistics ds = new DescriptiveStatistics(cd.getColumna(columna));
		return ds.getMean();
	}
	/**
	 * Max.
	 *
	 * @param columna the columna
	 * @return the double
	 */
	public double max(String columna) {
		DescriptiveStatistics ds = new DescriptiveStatistics(cd.getColumna(columna));
		return ds.getMax();
	}

	/**
	 * Min.
	 *
	 * @param columna the columna
	 * @return the double
	 */
	public double min(String columna) {
		DescriptiveStatistics ds = new DescriptiveStatistics(cd.getColumna(columna));
		return ds.getMin();
	}

	/**
	 * Suma.
	 *
	 * @param columna the columna
	 * @return the double
	 */
	public double suma(String columna) {
		DescriptiveStatistics ds = new DescriptiveStatistics(cd.getColumna(columna));
		return ds.getSum();
	}
	public double var(String columna) {
		DescriptiveStatistics ds = new DescriptiveStatistics(cd.getColumna(columna));
		return ds.getVariance();
	}

	public double stdDesv(String columna) {
		DescriptiveStatistics ds = new DescriptiveStatistics(cd.getColumna(columna));
		return ds.getStandardDeviation();

	}
	public double n(String columna) {
		DescriptiveStatistics ds = new DescriptiveStatistics(cd.getColumna(columna));
		return ds.getN();

	}

}
