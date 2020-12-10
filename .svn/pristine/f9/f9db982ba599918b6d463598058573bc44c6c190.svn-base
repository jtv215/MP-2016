package org.mp.sesion07;

/**
 * The Class BandaInt.
 */
public class BandaInt {

/** The nombre banda. */
private  String nombreBanda;

/** The datos. */
private int [][] datos;

/**
 * Instantiates a new banda int.
 *
 * @param nombre the nombre
 * @param x the x
 * @param y the y
 */
public BandaInt(String nombre, int x ,int y){
	//una banda esta formada por capas
	this.nombreBanda=nombre;
	this.datos=new int [x][y];
}

/**
 * Instantiates a new banda int.
 *
 * @param nombre the nombre
 * @param datos the datos
 */
public BandaInt(String nombre, int [][]datos){
	this.nombreBanda=nombre;
	this.datos=datos;

}

/**
 * Gets the nombre banda.
 *
 * @return the nombre banda
 */
public String getNombreBanda() {
	return nombreBanda;
}

/**
 * Sets the nombre banda.
 *
 * @param nombreBanda the new nombre banda
 */
public void setNombreBanda(String nombreBanda) {
	this.nombreBanda = nombreBanda;
}

/**
 * Gets the datos.
 *
 * @return the datos
 */
public int[][] getDatos() {
	return datos;
}

/**
 * Sets the datos.
 *
 * @param datos the new datos
 */
public void setDatos(int[][] datos) {
	this.datos = datos;
}

/**
 * Gets the dato xy.
 *
 * @param x the x
 * @param y the y
 * @return the dato xy
 */
public int getDatoXY(int x, int y){
	return datos[x][y];
}

/**
 * Sets the dato xy.
 *
 * @param dato the dato
 * @param x the x
 * @param y the y
 * @return the int
 */
public int setDatoXY(int dato, int x, int y){
	int aux=datos[x][y];
	datos[x][y]=dato;
	return aux;
}

public String toString(){
	return nombreBanda;
}


}
