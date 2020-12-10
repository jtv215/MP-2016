package org.mp.sesion07;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class Reserva.
 */
public class Reserva implements Serializable{

	/** The residente. */
	private Residente residente;

	/** The habitacion. */
	private Habitacion habitacion;

	/** The Fecha entrada. */
	private Date FechaEntrada;

	/** The Fecha salida. */
	private Date FechaSalida;

	/** The numero reserva. */
	private int numeroReserva;

	/** The contador. */
	public static int contador=0;

	/**
	 * Instantiates a new reserva.
	 *
	 * @param residente the residente
	 * @param habitacion the habitacion
	 * @param fechaEntrada the fecha entrada
	 * @param fechaSalida the fecha salida
	 */
	public  Reserva (Residente residente, Habitacion habitacion, Date fechaEntrada, Date fechaSalida){
		contador++;
		this.residente=residente;
		this.habitacion=habitacion;
		this.FechaEntrada=fechaEntrada;
		this.FechaSalida=fechaSalida;
		this.numeroReserva=contador;
	}

	/**
	 * Gets the fecha entrada.
	 *
	 * @return the fecha entrada
	 */
	public Date getFechaEntrada() {
		return FechaEntrada;
	}

	/**
	 * Sets the fecha entrada.
	 *
	 * @param fechaEntrada the new fecha entrada
	 */
	public void setFechaEntrada(Date fechaEntrada) {
		FechaEntrada = fechaEntrada;
	}

	/**
	 * Gets the fecha salida.
	 *
	 * @return the fecha salida
	 */
	public Date getFechaSalida() {
		return FechaSalida;
	}

	/**
	 * Sets the fecha salida.
	 *
	 * @param fechaSalida the new fecha salida
	 */
	public void setFechaSalida(Date fechaSalida) {
		FechaSalida = fechaSalida;
	}

	/**
	 * Gets the residente.
	 *
	 * @return the residente
	 */
	public Residente getResidente() {
		return residente;
	}

	/**
	 * Gets the habitacion.
	 *
	 * @return the habitacion
	 */
	public Habitacion getHabitacion() {
		return habitacion;
	}

	/**
	 * Gets the ultimo numero.
	 *
	 * @return the ultimo numero
	 */
	public static int getUltimoNumero() {


		return contador;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		if (numeroReserva != other.numeroReserva)
			return false;
		return true;
	}

	/**
	 * Gets the numero reserva.
	 *
	 * @return the numero reserva
	 */
	public int getNumeroReserva() {
		// TODO Auto-generated method stub
		return numeroReserva;
	}



}
