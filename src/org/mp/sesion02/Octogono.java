package org.mp.sesion02;

/**
 * Clase Octogono hereda de ObjetoGeometrico.
 */

public  class Octogono extends ObjetoGeometrico implements Comparable,Cloneable,DeColor {

 /** The lado. */
 protected double lado;

 	/**
	  * inicializa un nuevo octogono.
	  *
	  * @param color the color
	  * @param relleno the relleno
	  * @param lado the lado
	  */
public Octogono(String color, boolean relleno, double lado) {
		super(color,relleno);
		this.lado=lado;
}

	/**
	 * octogono por defecto.
	 */
public Octogono() {
		super();
		this.lado=0.000;
}

	/**
	 * devuelve perimetro.
	 *
	 * @return the perimetro
	 */
	@Override
public double getPerimetro() {
		return 8*lado;
	}

	/**
	 * devuelve area.
	 *
	 * @return the area
	 */
	@Override
public double getArea() {

		return (2 + (4 / Math.sqrt(2))) * lado * lado;
	}

	/**
	 * cambia lado.
	 *
	 * @param lado the new lado
	 */
public void setLado(double lado){
	this.lado=lado;
}

/**
 * compara el area del objeto.
 *
 * @param o the o
 * @return the int
 */
	@Override
	public int compareTo(Object o) {
		ObjetoGeometrico b = (ObjetoGeometrico) o;
		if (this.getArea() == b.getArea()) {
			return 0;
		} else if (this.getArea()>  b.getArea()) {
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * devuelve lado.
	 *
	 * @return the lado
	 */
public double getLado(){
	return lado;
}

/**
 * describe como colorear.
 *
 * @return the string
 */
	@Override
public String comoColorear() {

		return "Colorear los 8 lados de "+ getColor();
	}

	/**
	 * clona un octonogo.
	 *
	 * @return the octogono
	 */
public Octogono clone() {
		return new Octogono(color,relleno,lado);
	}

}
