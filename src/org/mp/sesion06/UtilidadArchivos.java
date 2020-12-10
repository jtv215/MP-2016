package org.mp.sesion06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.sun.xml.internal.bind.api.impl.NameConverter.Standard;

/**
 * The Class UtilidadArchivos.
 */
public class UtilidadArchivos {

	/** The lista. */
	private  ArrayList<File> lista;

	/**
	 * Instantiates a new utilidad archivos.
	 */
	public UtilidadArchivos() {
		this.lista = new ArrayList();
	}

	/**
	 * Copiar.
	 *
	 * @param origen the origen
	 * @param destino the destino
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void copiar(File origen, File destino) throws IOException {
		if (origen == null) {
			throw new IOException();
		}

		//Se copia por tamaño de buffer

		InputStream in =new FileInputStream(origen);//lectura de bytes
		OutputStream out=new FileOutputStream(destino);
		byte [] buffer=new byte [1024];
		int length;
		while ((length =in.read(buffer))>0){
			out .write(buffer, 0, length);
		}

		//Otra forma de copiar pero para el proximo año
//		Files.copy(origen.toPath(), destino.toPath(),StandardCopyOption.REPLACE_EXISTING);
	}


	/**
	 * Listar directorios archivos.
	 *
	 * @param dir the dir
	 * @return the array list
	 */
	public ArrayList listarDirectoriosArchivos(File dir) {
		// limpiamos la lista
				lista.clear();
		// añadimos el elemento a la lista
				listarDirectoriosArchivosRec(dir);
				return lista;
	}

	/**
	 * Listar directorios archivos rec.
	 *
	 * @param dir the dir
	 */
	private void listarDirectoriosArchivosRec(File dir) {
		lista.add(dir);  //1 metemos el directiorio en la raiz
		if(dir.isDirectory()){
			File []hijos=dir.listFiles(); //listo tu hijos
			for(File f:hijos){
				listarDirectoriosArchivosRec(f);  //llamada recursiva
			}
		}

	}

	/**
	 * Zip.
	 *
	 * @param directorio the directorio
	 * @param caminoSalida the camino salida
	 * @param nombreArchivo the nombre archivo
	 */
	public void zip(File directorio, String caminoSalida, String nombreArchivo) {
		listarDirectoriosArchivos(directorio);

		byte[]buffer=new byte[1024];
		String Path= caminoSalida+File.separator+nombreArchivo;
		try {
			ZipOutputStream zip= new ZipOutputStream(new FileOutputStream(new File(Path)));
			zip.setLevel(Deflater.BEST_COMPRESSION);// Establecer el nivel de compresion
			for(File f:lista){
				if(f.isFile()){
					FileInputStream fis=new FileInputStream(f);
					try {
						zip.putNextEntry(new ZipEntry(f.getAbsolutePath()));
						int length;
						while ((length=fis.read(buffer))>0){
							zip.write(buffer, 0, length);
						}
						zip.closeEntry();
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				zip.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
