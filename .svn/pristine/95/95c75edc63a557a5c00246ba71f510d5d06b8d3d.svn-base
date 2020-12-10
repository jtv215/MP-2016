package org.mp.sesion05;

/**
 * The Class Accion.
 */
public class Accion implements Comparable<Object> {

	/** The nombre. */
	private String nombre;

	/** The volumen. */
	private long volumen;

	/**
	 * Instantiates a new accion.
	 * @param nombre the nombre
	 * @param volumen the volumen
	 */
	public Accion(String nombre, long volumen) {
		this.nombre=nombre;
		this.volumen=volumen;

	}

	/**
	 * Gets the nombre.
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the volumen.
	 * @return the volumen
	 */
	public long getVolumen() {
		return volumen;
	}

	/**
	 * Sets the volumen.
	 * @param volumen the new volumen
	 */
	public void setVolumen(long volumen) {
		this.volumen = volumen;
	}


	/**dos objetos son iguales si tienen el mismo nombre*/
	public boolean equals (Object o){
		if(o==null)
			return false;
		if(!(o instanceof Accion))
			return false;
		Accion otra=(Accion)o;
		return this.nombre.equals(otra.nombre);
	}

	@Override
	public String toString() {
		return "Accion [nombre=" + nombre + ", volumen=" + volumen + "]";
	}

	public int compareTo(Object o) {
		Accion otra=(Accion) o;
		return this.nombre.compareTo(otra.nombre);
	}
}
