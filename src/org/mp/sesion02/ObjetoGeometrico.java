package org.mp.sesion02;

import java.util.GregorianCalendar;

/**
 * clase abstracta de objeto Geometrico.
 */
public abstract class ObjetoGeometrico {

	/**  Atributos del octogono. */
	protected String color;

	/** The relleno. */
	protected boolean relleno;

	/** The fecha creado. */
	protected GregorianCalendar fechaCreado;

	/**
	 *  Constructor por defecto.
	 */
	protected ObjetoGeometrico() {
		this.color = "blanco";
		this.relleno = false;
		this.fechaCreado = new GregorianCalendar();
	}

	/**
	 *  inicitaliza un nuevo objeto Geometrico.
	 *
	 * @param color the color
	 * @param relleno the relleno
	 */
	protected ObjetoGeometrico(String color, Boolean relleno) {
		this.color = color;
		this.relleno = relleno;
		this.fechaCreado = new GregorianCalendar();
	}

	/**
	 *  describe color.
	 *
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 *  cambia color.
	 *
	 * @param color the new color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 *  te devuelve un booleano, si esta relleno true.
	 *
	 * @return true, if successful
	 */
	public boolean esRelleno() {
		return relleno;
	}

	/**
	 *  cambia relleno.
	 *
	 * @param relleno the new relleno
	 */
	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}

	/**
	 *  devuelve fecha de creado.
	 *
	 * @return the fecha creado
	 */
	public GregorianCalendar getFechaCreado() {
		return fechaCreado;
	}

	/**
	 *  describe el objeto geometrico.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return 	"Creado el " + fechaCreado + "\ncolor: " + color + " y relleno: "
				+ relleno;
	}

	/**
	 *  devuelve perimetro.
	 *
	 * @return the perimetro
	 */
	public abstract double getPerimetro();

	/**
	 *  devuelve area.
	 *
	 * @return the area
	 */
	public abstract double getArea();

}