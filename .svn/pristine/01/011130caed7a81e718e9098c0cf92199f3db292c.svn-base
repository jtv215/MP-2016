package org.mp.sesion07;

import java.io.Serializable;

/**
 * The Class Habitacion.
 */
public class Habitacion implements Serializable{

	/** The numero. */
	private String numero;

	/**
	 * Instantiates a new habitacion.
	 *
	 * @param numero the numero
	 */
	public Habitacion(String numero) {
		this.numero=numero;
	}

	/**
	 * Gets the numero.
	 *
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Sets the numero.
	 *
	 * @param numero the new numero
	 */
	public void setNumero(String numero) {
		this.numero=numero;
	}


	@Override
	public String toString() {
		return this.numero;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habitacion other = (Habitacion) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
