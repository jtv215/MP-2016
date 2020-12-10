package org.mp.sesion07;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/**
 * The Class Residencia.
 */
public class Residencia implements Serializable{

	/** The nombre. */
	private String nombre;

	/** The habitaciones. */
	private ArrayList<Habitacion> habitaciones;

	/** The residente. */
	private ArrayList<Residente> residente;

	/** The reservas. */
	private ArrayList<Reserva> reservas;

	/**
	 * Instantiates a new residencia.
	 *
	 * @param nombre the nombre
	 * @param habitaciones the habitaciones
	 */
	public Residencia(String nombre, Habitacion[] habitaciones) {
		this.nombre = nombre;
		this.habitaciones = new ArrayList<Habitacion>();
		this.reservas = new ArrayList<Reserva>();
		this.residente = new ArrayList<Residente>();

		for (Habitacion h : habitaciones) {
			if (h != null) {
				this.habitaciones.add(h);
			}
		}
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
	 * Gets the habitaciones.
	 *
	 * @return the habitaciones
	 */
	public Habitacion[] getHabitaciones() {

		Habitacion[] hs = new Habitacion[this.habitaciones.size()];
		// relleno el array list
		this.habitaciones.toArray(hs);

		return hs;
	}

	/**
	 * Gets the n habitaciones.
	 *
	 * @return the n habitaciones
	 */
	public int getNHabitaciones() {
		return this.habitaciones.size();
	}

	/**
	 * Insertar habitacion.
	 *
	 * @param h the h
	 */
	public void insertarHabitacion(Habitacion h) {

		if (!this.habitaciones.contains(h)) {
			this.habitaciones.add(h);
		}

	}

	/**
	 * Buscar habitacion.
	 *
	 * @param numero the numero
	 * @return the habitacion
	 */
	public Habitacion buscarHabitacion(String numero) {
		// TODO Auto-generated method stub
		int i = this.habitaciones.indexOf(new Habitacion(numero));
		if (i == -1)
			return null;
		return this.habitaciones.get(i);

	}

	/**
	 * Eliminar habitacion.
	 *
	 * @param habitacion1 the habitacion1
	 */
	public void eliminarHabitacion(Habitacion habitacion1) {
		this.habitaciones.remove(habitacion1);

	}

	/**
	 * Gets the n reservas.
	 *
	 * @return the n reservas
	 */
	public int getNReservas() {
		return reservas.size();
	}

	/**
	 * Gets the n residentes.
	 *
	 * @return the n residentes
	 */
	public int getNResidentes() {
		return residente.size();
	}

	/**
	 * Salida.
	 *
	 * @param residente the residente
	 * @param fechaSalida the fecha salida
	 */
	public void salida(Residente residente, Date fechaSalida) {
		for (Reserva reserva : this.reservas) {
			if (reserva.getResidente().equals(residente)) {
				reserva.setFechaSalida(fechaSalida);
				break;
			}
		}
		this.residente.remove(residente);

	}

	/**
	 * Checks if is habitacion ocupada.
	 *
	 * @param h the h
	 * @param fecha the fecha
	 * @return true, if is habitacion ocupada
	 */
	public boolean isHabitacionOcupada(Habitacion h, Date fecha) {
		for (Reserva r : this.reservas) {
			if (r.getHabitacion().equals(h) && r.getFechaEntrada().compareTo(fecha) <= 0
					&& fecha.compareTo(r.getFechaSalida()) <= 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Ingreso.
	 *
	 * @param residente1 the residente1
	 * @param habitacion1 the habitacion1
	 * @param entrada the entrada
	 * @param salida the salida
	 */
	public void ingreso(Residente residente1, Habitacion habitacion1, Date entrada, Date salida) {
		if (entrada.compareTo(salida) <= 0 && !isHabitacionOcupada(habitacion1, entrada)) {
			Reserva nueva = new Reserva(residente1, habitacion1, entrada, salida);
			insertarReserva(nueva);
			insertarResidente(residente1);
		}

	}

	/**
	 * Insertar residente.
	 *
	 * @param r the r
	 */
	private void insertarResidente(Residente r) {
		if (!this.residente.contains(r)) {
			this.residente.add(r);
		}
	}

	/**
	 * Insertar reserva.
	 *
	 * @param reserva the reserva
	 */
	private void insertarReserva(Reserva reserva) {
		if (!this.reservas.contains(reserva)) {
			this.reservas.add(reserva);

		}
	}

	/**
	 * Listado habitaciones libres.
	 *
	 * @param fecha the fecha
	 * @return the string
	 */
	public String listadoHabitacionesLibres(Date fecha) {
		StringBuilder listado = new StringBuilder("");
		for (Habitacion i : habitaciones) {
			if (!isHabitacionOcupada(i, fecha))
				listado.append(i);
			listado.append(",");
		}

		return listado.substring(0, listado.length() - 2);
	}

	/**
	 * Listado residentes habitaciones.
	 *
	 * @param fecha the fecha
	 * @return the string
	 */
	public String listadoResidentesHabitaciones(Date fecha) {
		ArrayList<Residente> al = new ArrayList<Residente>();
		for (Reserva r : this.reservas) {
			if (isHabitacionOcupada(r.getHabitacion(), fecha)) {
				al.add(r.getResidente());

			}
		}
		if (al.size() == 0) {
			return "";
		}
		Collections.sort(al);// Collection ordena esta array segun el comparable
		String s = "";
		for (Residente r : al) {
			s += r.getNombre() + ", ";

		}
		s = s.substring(0, s.length() - 2);
		return s;
	}

	/**
	 * Listado edad media por sexo.
	 *
	 * @param fecha the fecha
	 * @return the string
	 */
	public String listadoEdadMediaPorSexo(Date fecha) {
		double nH = 0.0;
		double nM = 0.0;
		double edadH = 0.0;
		double edadM = 0.0;
		for (Residente r : this.residente) {
			if (r.getSexo() == 'V') {
				nH++;
				edadH += r.getEdad(fecha);
			} else {
				nM++;
				edadM += r.getEdad(fecha);

			}
		}
		String mediaH = nH == 0 ? "0.0" : String.format(new Locale("spa"), "%.1f", (edadH / nH));
		String mediaM = nM == 0 ? "0.0" : String.format(new Locale("spa"), "%.1f", (edadM / nM));

		return "Media Hombres: " + mediaH + ", Media Mujeres: " + mediaM;
	}

	/**
	 * Cambiar habitacion.
	 *
	 * @param residente the residente
	 * @param habitacion the habitacion
	 * @param entrada the entrada
	 * @param salida the salida
	 */
	public void cambiarHabitacion(Residente residente, Habitacion habitacion, Date entrada, Date salida) {
		for (Reserva r : this.reservas) {
			if (r.getResidente().equals(residente)) {
				r.setFechaSalida(entrada);
				Reserva nueva = new Reserva(residente, habitacion, entrada, salida);
				this.reservas.add(nueva);
				break;

			}

		}
	}

	/**
	 * Gets the reservas.
	 *
	 * @return the reservas
	 */
	public Reserva[] getReservas() {
		Reserva[] res = new Reserva[this.reservas.size()];
		this.reservas.toArray(res);

		return res;
	}

}
