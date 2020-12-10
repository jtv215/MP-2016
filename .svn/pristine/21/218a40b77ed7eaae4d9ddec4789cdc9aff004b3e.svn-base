package org.mp.sesion07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * The Class ResidenciaXML.
 */
public class ResidenciaXML extends ResidenciaDAOFactory implements DataAccessObject {

	/** The xstream. */
	XStream xstream;

	/**
	 * Instantiates a new residencia xml.
	 *
	 * @param nombreArchivo the nombre archivo
	 */
	public ResidenciaXML(String nombreArchivo) {
		this.nombreArchivo=nombreArchivo;
		xstream=new XStream(new DomDriver("UTF-8"));
		xstream.alias("residencia",Residencia.class);
		xstream.alias("residente",Residente.class);
		xstream.alias("reserva",Reserva.class);
		xstream.alias("habitacion",Habitacion.class);
	}


	@Override
	public Object leer() {
		File f=new File (nombreArchivo);

		return xstream.fromXML(f);
	}


	@Override
	public void escribir(Object o) {
try {FileOutputStream fos= new FileOutputStream(nombreArchivo);
xstream.toXML(o,fos);


} catch (FileNotFoundException e) {
	e.printStackTrace();
}
	}

}
