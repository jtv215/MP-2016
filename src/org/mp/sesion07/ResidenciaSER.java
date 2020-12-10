package org.mp.sesion07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * The Class ResidenciaSER.
 */
public class ResidenciaSER extends ResidenciaDAOFactory implements DataAccessObject {

	/**
	 * Instantiates a new residencia ser.
	 *
	 * @param nombreArchivo the nombre archivo
	 */
	public ResidenciaSER(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;

	}

	/* (non-Javadoc)
	 * @see org.mp.sesion07.DataAccessObject#leer()
	 */
	@Override
	public Object leer() {
		Residencia residenciaSer = null;

		File f = new File(nombreArchivo);
		try {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			residenciaSer = (Residencia) ois.readObject();
			ois.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return residenciaSer;
	}

	@Override
	public void escribir(Object o) {
		Residencia residenciaSer = (Residencia) o;
		File f = new File(nombreArchivo);
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(residenciaSer);
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
