package org.mp.sesion02;

/**
 * Clase estudiante hereda de persona.
 */
public class Estudiante extends Persona {

	/** The nivel. */
	public int nivel;

	/**
	 * Instancia un nuevo estudiante.
	 *
	 * @param nombre the nombre
	 * @param direccion the direccion
	 * @param telefono the telefono
	 * @param correo the correo
	 * @param nivel the nivel
	 */
	public Estudiante(String nombre, String direccion, String telefono, String correo, int nivel) {
		super(nombre, direccion, telefono, correo);
		this.nivel = nivel;
	}

	/**
	 * Describe el nivel del estudiante.
	 *
	 * @return the string
	 */
	public String toString() {
		String salida = "";
		if (getNivel() == 1) {
			salida += "Estudiante de Grado\n";
		} else if (getNivel() == 2) {
			salida += "Estudiante de Master\n";
		} else if (getNivel() == 3) {
			salida += "Estudiante de Doctorado\n";
		}

		return salida + "Nombre = " + getNombre() + ", Direccion = " + getDireccion() + ", Teléfono = " + getTelefono()
				+ ", email = " + getEmail();

	}

	/**
	 *  nos devuelve nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *  nos devuelve direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 *  nos devuelve telefono.
	 *
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;

	}

	/**
	 *  nos devuelve email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 *  nos devuelve nivel.
	 *
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}

}
