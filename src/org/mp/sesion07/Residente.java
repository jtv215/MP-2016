package org.mp.sesion07;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Class Residente.
 */
public class Residente implements Comparable<Residente> ,Serializable{

	/** The nombre. */
	private String nombre;

	/** The dni. */
	private String dni;

	/** The sexo. */
	private char sexo;

	/** The fecha nacimiento. */
	private Date fechaNacimiento;



	/**
	 * Instantiates a new residente.
	 *
	 * @param nombre the nombre
	 * @param dni the dni
	 * @param sexo the sexo
	 * @param fechaNacimiento the fecha nacimiento
	 */
	public Residente(String nombre, String dni, char sexo, Date fechaNacimiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}


	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Sets the dni.
	 *
	 * @param dni the new dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * Gets the sexo.
	 *
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * Sets the sexo.
	 *
	 * @param sexo the new sexo
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	/**
	 * Gets the fecha nacimiento.
	 *
	 * @return the fecha nacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Sets the fecha nacimiento.
	 *
	 * @param fechaNacimiento the new fecha nacimiento
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Gets the edad.
	 *
	 * @param fechaActual the fecha actual
	 * @return the edad
	 */
	public int getEdad(Date fechaActual) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");  //Solo me de vuelve la fecha

		//le paso la fecha , le doy formato para solo coger el año
		//y que me guarde el  entero
		int anoNac= Integer.parseInt(sdf.format(this.fechaNacimiento));
		int anoActual= Integer.parseInt(sdf.format(fechaActual));
		int edad=anoActual-anoNac;

		//comparamos el mes
		sdf =new SimpleDateFormat("MM");
		int mesNac=Integer.parseInt(sdf.format(this.fechaNacimiento));
		int mesActual= Integer.parseInt(sdf.format(fechaActual));
		if(mesNac>mesActual){
			return edad-1;
		}

		if(mesNac==mesActual){
			sdf=new SimpleDateFormat("dd");
			int diaNac=Integer.parseInt(sdf.format(this.fechaNacimiento));
			int diaActual= Integer.parseInt(sdf.format(fechaActual));

			if(diaNac>diaActual){
				return edad-1;
			}
		}
		return edad;
	}

/** Compara el dni**/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Residente other = (Residente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

/** devuelveme nombre */
	@Override
	public String toString() {
		return this.nombre;
	}

/** comparame residente*/
	@Override
	public int compareTo(Residente o) {
		return this.nombre.compareTo(o.nombre);
	}

}
