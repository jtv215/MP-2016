package org.mp.sesion02;

import java.util.GregorianCalendar;

/**
 * Clase empleado hereda de persona.
 */
public class Empleado extends Persona {

	/** atributos: despacho,salario y fecha de contratacion. */
	public String despacho;

	/** The salario. */
	public int salario;

	/** The fecha de contratacion. */
	protected GregorianCalendar fechaDeContratacion;

	/**
	 * contstructor empleado.
	 *
	 * @param nombre the nombre
	 * @param direccion the direccion
	 * @param telefono the telefono
	 * @param email the email
	 * @param despacho the despacho
	 * @param salario the salario
	 * @param fechaDeContratacion the fecha de contratacion
	 */
	public Empleado(String nombre, String direccion, String telefono, String email, String despacho, int salario,
			GregorianCalendar fechaDeContratacion) {
		super(nombre, direccion, telefono, email);
		this.despacho = despacho;
		this.salario = salario;
		this.fechaDeContratacion =  fechaDeContratacion;

	}


	/**
	 * Nos devuelve fecha de contratacion.
	 *
	 * @return the fecha de contratacion
	 */
	public GregorianCalendar getFechaDeContratacion() {
		return fechaDeContratacion;
	}

	/**
	 * cambia fecha de contratacion.
	 *
	 * @param fechaDeContratacion the new fecha de contratacion
	 */
	public void setFechaDeContratacion(GregorianCalendar fechaDeContratacion) {
		this.fechaDeContratacion = fechaDeContratacion;
	}





}