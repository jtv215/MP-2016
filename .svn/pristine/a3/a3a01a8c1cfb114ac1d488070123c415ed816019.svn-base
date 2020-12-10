package org.mp.sesion07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * The Class ImagenDAO.
 */
public class ImagenDAO {

	/**
	 * Escribir archivo.
	 *
	 * @param nombreArchivo the nombre archivo
	 * @param imagen the imagen
	 */
	public static void escribirArchivo(String nombreArchivo, Imagen imagen) {

		File out =new File (nombreArchivo);

		try {
			PrintWriter pw= new PrintWriter(out);
			String archivo=out.getName();
			String fomato=imagen.getFormatoImagen();
			int nBandas=imagen.getNumeroBandas();
			String nombre="[";
			for(int i=0;i<nBandas;i++){
				nombre+=imagen.getBandas().get(i).getNombreBanda();
				if(i<nBandas-1){
					nombre+=";";
				}
			}
			nombre+="]";
			int nLineas=imagen.getLineas();
			int nColumnas=imagen.getColumnas();
			//cambiamos el nombre del archivoeje imagn1.cabezera a imagen1.dat
			StringTokenizer st= new StringTokenizer(archivo, ".");
			archivo=st.nextToken()+".dat";

//			archivo= archivo.substring(0,archivo.lastIndexOf("."));

			pw.println(archivo+"\n"+ fomato+"\n"+nBandas+"\n"+nombre+"\n"+nLineas+"\n"+nColumnas);
			pw.close();
			escribirBSQ(out.getParent()+File.separator+archivo,imagen);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}



	/**
	 * Escribir bsq.
	 *
	 * @param nombreArchivo the nombre archivo
	 * @param imagen the imagen
	 */
	private static void escribirBSQ(String nombreArchivo, Imagen imagen) {
try {
	DataOutputStream dos= new DataOutputStream(new FileOutputStream(nombreArchivo));
	int nLineas= imagen.getLineas();
	int nColumnas= imagen.getColumnas();

	for( BandaInt b: imagen.getBandas()){

	for(int i=0;i<nLineas;i++){
	for(int j=0; j<nColumnas; j++){
		dos.writeInt(b.getDatoXY(i,j));
	}
	}
	}
	dos.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

	/**
	 * Leer archivo.
	 *
	 * @param nombreArchivo the nombre archivo
	 * @return the imagen
	 */
	public static Imagen leerArchivo(String nombreArchivo) {
		File f = new File(nombreArchivo);
		try {
			Scanner sc = new Scanner(f);
			String archivo = sc.nextLine();
			String formato = sc.nextLine();
			int nbandas = Integer.parseInt(sc.nextLine());
			String[] nombre = new String[nbandas];
			// StringTokenizer st=new StringTokenizer(sc.nextLine(),";");
			String ana = sc.nextLine();
			ana = ana.substring(1, ana.length() - 1); // para el tema de los
														// corchetes
			StringTokenizer st = new StringTokenizer(ana, ";");
			for (int i = 0; i < nombre.length; i++) {
				nombre[i] = st.nextToken();
			}
			int lineas = Integer.parseInt(sc.nextLine());
			int columnas = Integer.parseInt(sc.nextLine());
			sc.close();
			Imagen img = new Imagen(lineas, columnas, formato);
			archivo = f.getParentFile() + File.separator + archivo;
			img = leerBSQ(archivo, img, nombre);
			return img;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * Leer bsq.
	 *
	 * @param nombreArchivo the nombre archivo
	 * @param imagen the imagen
	 * @param nombrebanda the nombrebanda
	 * @return the imagen
	 */
	// bsq es un forrmato
	public static Imagen leerBSQ(String nombreArchivo, Imagen imagen, String[] nombrebanda) {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivo));
			// fluo de datos que proviene de un archivo
			int nLineas = imagen.getLineas();
			int nColumnas = imagen.getColumnas();

			for(int i=0; i<nombrebanda.length;i++){
				BandaInt b=new BandaInt(nombrebanda[i], nLineas, nColumnas);
				//rellenamos la banda
				for (int j=0;j<nLineas;j++){
					for(int k=0;k< nColumnas; k++){
						b.setDatoXY(dis.readInt(),j,k);
					}
				}
				//añadimos la banda
				imagen.añadirBanda(b);
				}
			dis.close();

		}
			catch (IOException e) {
			e.printStackTrace();
		}

		return imagen;
	}

}
