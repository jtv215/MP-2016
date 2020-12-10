package org.mp.sesion02;
import java.util.GregorianCalendar;

/**
 * Clase Administrativo hereda de Empleado.
 */
public class Administrativo extends Empleado{

	/**  becas. */
	public String becas;

	/**
	 * contstructor administrativo.
	 *
	 * @param nombre the nombre
	 * @param direccion the direccion
	 * @param telefono the telefono
	 * @param email the email
	 * @param despacho the despacho
	 * @param salario the salario
	 * @param fechaDeContratacion the fecha de contratacion
	 * @param becas the becas
	 */
	public Administrativo(String nombre, String direccion, String telefono, String email,
			String despacho,int salario,GregorianCalendar fechaDeContratacion,
			String becas) {
		super(nombre, direccion, telefono,email,despacho,salario,fechaDeContratacion);
		this.becas=becas;

	}

	/**
	 *  nos devuelve nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre(){
		return nombre;
	}

	/**
	 * Nos devuelve direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 *  Nos devuelve teléfono.
	 *
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;

	}

	/**
	 *  Nos devuelve el email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 *  Nos devuelve despacho.
	 *
	 * @return the despacho
	 */
	public String getDespacho() {
		return despacho;
	}

	/**
	 *  Nos devuelve salario.
	 *
	 * @return the salario
	 */
public int getSalario(){
	return salario;

}

/**
 *  Nos devuelve becas.
 *
 * @return the becas
 */

public String getBecas(){
	return becas;
}

/**
 *  Nos describe administracion.
 *
 * @return the string
 */
@Override
	public String toString() {
		String salida = "";
		if (getBecas() == "Becas") {
			salida = "Destinado en la unidad Becas";

		}

		return  "Administrativo\nNombre = " + getNombre() + ", Direccion = " + getDireccion() + ", Teléfono = " + getTelefono()
				+ ", email = " + getEmail() + "\n" + "Despacho = " + getDespacho() + ", salario = " + getSalario()
				+ ", Fecha de contratación = " + fechaDeContratacion.get(GregorianCalendar.DATE) +
				"/"+(fechaDeContratacion.get(GregorianCalendar.MONTH)+1)+"/"+fechaDeContratacion.get(GregorianCalendar.YEAR)+"\n" +salida;

	}


}
