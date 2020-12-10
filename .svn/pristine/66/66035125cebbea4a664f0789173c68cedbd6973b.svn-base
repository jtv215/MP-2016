package org.mp.sesion05;

import java.util.Comparator;

/**
 * The Class NumeroPaloComparator.
 */
public class NumeroPaloComparator implements Comparator<Object> {


	@Override
	public int compare(Object o1, Object o2) {
		Carta c1=(Carta)o1;
		Carta c2=(Carta)o2;

		int v1=c1.getValor();
		int v2=c2.getValor();


		if(v1%10<v2%10){ //compara unidades al numero
			return-1;
		}else if(v1%10>v2%10){
			return 1;
		}else if (v1/10<v2/10){ //compara decenas (palo)
			return-1;
		}else if (v1/10>v2/10){
			return 1;
		}else {			//Iguales
			return 0;
		}

	}




}
