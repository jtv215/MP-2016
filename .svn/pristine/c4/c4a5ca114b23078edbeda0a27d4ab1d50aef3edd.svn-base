package org.mp.sesion02;

import java.util.GregorianCalendar;

/**
 * Clase profesor hereda de Empleado.
 */
public class Profesor extends Empleado {

	/**  atributos de profesor. */
	public String tutorias;

	/** The categoria. */
	public int categoria;

	/**
	 *  inicializa un nuevo profesor.
	 *
	 * @param nombre the nombre
	 * @param direccion the direccion
	 * @param telefono the telefono
	 * @param email the email
	 * @param despacho the despacho
	 * @param salario the salario
	 * @param fechaDeContratacion the fecha de contratacion
	 * @param tutorias the tutorias
	 * @param categoria the categoria
	 */
	public Profesor(String nombre, String direccion, String telefono, String email, String despacho, int salario,
			GregorianCalendar fechaDeContratacion, String tutorias, int categoria) {
		super(nombre, direccion, telefono, email, despacho, salario, fechaDeContratacion);
		this.tutorias = tutorias;
		this.categoria = categoria;

	}

	/**
	 *  devuelve nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *  devuelve direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 *  devuelve telefono.
	 *
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;

	}

	/**
	 *  devuelve email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 *  devuelve despacho.
	 *
	 * @return the despacho
	 */
	public String getDespacho() {
		return despacho;
	}

	/**
	 *  devuelve salario.
	 *
	 * @return the salario
	 */
	public int getSalario() {
		return salario;

	}

	/**
	 *  devuelve tutorias.
	 *
	 * @return the tutorias
	 */
	public String getTutorias() {
		return tutorias;
	}

	/**
	 *  devuelve categoria.
	 *
	 * @return the categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 *  devuelve la categoria del profesor y describe profesor.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		String salida = "";
		if (getCategoria() == 1) {
			salida += "Profesor Ayudante\n";
		} else if (getCategoria() == 2) {
			salida += "Profesor Titular de Universidad\n";
		} else if (getCategoria() == 3) {
			salida += "Profesor Catedrático de Universidad\n";
		}

		return salida + "Nombre = " + getNombre() + ", Direccion = " + getDireccion() + ", Teléfono = " + getTelefono()
				+ ", email = " + getEmail() + "\n" + "Despacho = " + getDespacho() + ", salario = " + getSalario()
				+ ", Fecha de contratación = " + fechaDeContratacion.get(GregorianCalendar.DATE) + "/"
				+ (fechaDeContratacion.get(GregorianCalendar.MONTH) + 1) + "/"
				+ fechaDeContratacion.get(GregorianCalendar.YEAR) + "\n" + "Horario = " + getTutorias();

	}

}
