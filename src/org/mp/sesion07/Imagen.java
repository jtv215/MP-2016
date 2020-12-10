package org.mp.sesion07;

import java.util.ArrayList;


/**
 * The Class Imagen.
 */
public class Imagen {

/** The formato imagen. */
private String formatoImagen;

/** The bandas. */
private ArrayList<BandaInt>  bandas;

/** The lineas. */
private int lineas;

/** The columnas. */
private int columnas;

/**
 * Instantiates a new imagen.
 *
 * @param lineas the lineas
 * @param columna the columna
 * @param formatoImagen the formato imagen
 */
public Imagen(int lineas, int columna, String formatoImagen){
	this.lineas=lineas;
	this.columnas=columna;
	this.formatoImagen=formatoImagen;
	this.bandas= new ArrayList<BandaInt>();
}

/**
 * Gets the datos pixel.
 *
 * @param y the y
 * @param x the x
 * @return the datos pixel
 * @throws XYFueraImagenException the XY fuera imagen exception
 */
public int[] getDatosPixel (int y, int x)throws XYFueraImagenException {
	//interpreso  la "x" como columna  y la "y" como fila

	if(x<0 || y<0 || x>=this.columnas || y>=this.lineas){
		throw new XYFueraImagenException(" Fuera de rango");
	}
		int[] dp=new int [bandas.size()];
		for(int i=0; i<bandas.size(); i++){ //
			dp[i]=bandas.get(i).getDatoXY(x, y);

		}

	return dp;
}

/**
 * Extraer imagen.
 *
 * @param x1 the x1
 * @param y1 the y1
 * @param x2 the x2
 * @param y2 the y2
 * @return the imagen
 * @throws XYFueraImagenException the XY fuera imagen exception
 */
public Imagen extraerImagen(int x1, int y1, int x2, int y2)throws  XYFueraImagenException {
	if(!XYvalida(x1,y1,x2,y2)){
		throw new XYFueraImagenException("fuera de rango");
}
	Imagen img=new Imagen(y2-y1+1, x2-x1+1, this.formatoImagen);
	for(int i=0;i<bandas.size(); i++){
		img.añadirBanda(new BandaInt(this.bandas.get(i).getNombreBanda(), y2-y1+1,x2+x1+1));
	}
	return img;
}

/**
 * Añadir banda.
 *
 * @param banda the banda
 */
public void añadirBanda(BandaInt banda){

	this.bandas.add(banda);
}

/**
 * Eliminar banda.
 *
 * @param i the i
 */
public void eliminarBanda(int i) {
	this.bandas.remove(i);
}

/**
 * Gets the banda.
 *
 * @param i the i
 * @return the banda
 */
public BandaInt getBanda(int i){
	return this.bandas.get(i);
}


/**
 * Gets the bandas.
 *
 * @return the bandas
 */
public ArrayList<BandaInt> getBandas() {
	return this.bandas;
}

/**
 * Gets the numero bandas.
 *
 * @return the numero bandas
 */
public int getNumeroBandas() {
	return bandas.size();
}

/**
 * Gets the lineas.
 *
 * @return the lineas
 */
public int getLineas() {
	return lineas;
}

/**
 * Gets the columnas.
 *
 * @return the columnas
 */
public int getColumnas() {
	return columnas;
}

	/**
	 * Gets the formato imagen.
	 *
	 * @return the formato imagen
	 */
	public String getFormatoImagen() {
		return formatoImagen;
	}


/**
 * Sets the formato imagen.
 *
 * @param formatoImagen the new formato imagen
 */
public void setFormatoImagen(String formatoImagen) {
		this.formatoImagen = formatoImagen;
	}


/**
 * Sets the bandas.
 *
 * @param bandas the new bandas
 */
public void setBandas(ArrayList<BandaInt> bandas) {
	this.bandas = bandas;
}

/**
 * X yvalida.
 *
 * @param x1 the x1
 * @param y1 the y1
 * @param x2 the x2
 * @param y2 the y2
 * @return true, if successful
 */
private boolean XYvalida(int x1, int y1, int x2, int y2){
	if(x1<0|| y1<0|| x1>x2|| y1>y2|| x1>=this.columnas|| x2>=this.columnas||
	y1>=this.lineas || y2>=lineas){
		return false;
		}
		return true;
	}

}
