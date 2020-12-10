package org.mp.sesion03;

import java.util.Iterator;

/**
 * Clase ArrayList generica hereda de AbstracList.
 *
 * @param <E> the element type
 */
	public class ArrayList<E> extends AbstractList<E> {

		/**  Atributos de array list. */
		private static final int CAPACIDAD_INICIAL = 16;

		/** The data. */
		@SuppressWarnings("unchecked")
		private E[] data = (E[]) new Object[CAPACIDAD_INICIAL];

		/**
		 *  Create a default list.
		 */
		public ArrayList() {
		}

		/**
		 *  Create a list from an array of objects.
		 *
		 * @param objects the objects
		 */
		public ArrayList(E[] objects) {
			for (int i = 0; i < objects.length; i++)
				add(objects[i]); // Warning: don’t use super(objects)!
		}


		@Override
		/** Add a new element at the specified index */

		public void add(int index, E e) {
			//asegura la capacidad
			ensureCapacity();

			// Move the elements to the right after the specified index
			for (int i = size - 1; i >= index; i--)
				data[i + 1] = data[i];

			// Insert new element to data[index]
			data[index] = e;

			// Increase size by 1
			size++;
		}

		/**
		 *  Create a new larger array, double the current size + 1.
		 */
		@SuppressWarnings("unchecked")
		private void ensureCapacity() {
			if (size == data.length) {
				//hacemos un casting generico, cuando creamos un array
				E[] nuevo = (E[]) new Object [size * 2 + 1];
				//una opcion que no nos pide
//				for (int i=0; i<size; i++)
//					nuevo[i] = data[i];
//				data = nuevo;
				//hace una copia, como me lo pide la practica

				System.arraycopy(data, 0, nuevo, 0, size);
				//de donde copio, desde que posicion, a donde copio, desde que posicion, tamaño
				data=nuevo;
			}
		}


		@Override
		/** Clear the list*/
		public void clear() {
			size = 0;
		}



		@Override
		/** Return true if this list contains the element */
		public boolean contains(E e) {
			for (int i=0; i<size; i++) {
				if (data[i].equals(e))
					return true;
			}
			return false;
		}


		@Override
		/** Te paso un indice, entonces devuelveme el elemento */
		public E get(int index) {
			checkIndex(index); //chequea si esta dentro del tamaño permitido
			return data[index];
		}

		/**
		 * Chequea si el índice esta dentro del tamaño permitido
		 */
		private void checkIndex(int index) {
			if (index < 0 || index >= size)
				throw new IndexOutOfBoundsException("Indice: " + index
						+ ", Tamaño: " + size);
		}

		@Override
		/** Return the index of the first matching element
		 *  in this list. Return -1 if no match. */
		public int indexOf(E e) {
			for (int i=0; i<size; i++) {
				if (data[i].equals(e))
					return i;
			}
			return -1;
		}

		@Override
		/** Return the index of the last matching element
		 *  in this list. Return -1 if no match. */
		public int lastIndexOf(E e) {
			for (int i=size-1; i>=0; i--) {
				if (data[i].equals(e))
					return i;
			}
			return -1;
		}

		@Override
		/** Remove the element at the specified position
		 *  in this list. Shift any subsequent elements to the left.
		 *  Return the element that was removed from the list. */
		public E remove(int index) {
			checkIndex(index);
			E elemento = data[index];  // guardo el elemnto que se va a eliminar
			for (int i=index; i<size-1; i++) {
				data[i] = data[i+1];  //desplazo los elementos a la izquierda
			}
			size--;
			return elemento;
		}


		@Override
		/** Replace the element at the specified position
		 *  in this list with the specified element. */
		public E set(int index, E e) {
			checkIndex(index);
			E antiguo = data[index];
			data[index] = e;
			return antiguo;
		}


		@Override
		public String toString() {
			StringBuilder resultado = new StringBuilder("[");

			for (int i = 0; i < size; i++) {
				resultado.append(data[i]);//se agrega el elemento
				if (i < size - 1)
					resultado.append(", ");
			}

			return resultado.toString() + "]";
		}

		/**
		 *  Trims the capacity to current size.
		 */
		//elimina las posiciones que sobran del array
		@SuppressWarnings("unchecked")
		public void trimToSize() {
			E[] nuevo = (E[]) new Object [size];
			for (int i=0; i<size; i++)
				nuevo[i] = data[i];  // en el nuevo guardamos  todos los elementos del data
			data = nuevo;
		}


		@Override
		/** Override iterator() defined in Iterable */
		public java.util.Iterator<E> iterator() {
			return new ArrayListIterator();
		}

		/**
		 * Clase ArrayList Iterator.
		 */
private class ArrayListIterator implements Iterator<E> {

			private int actual = 0;

			@Override
			/** llama una vez , y comprueba si hay siguiente */
			public boolean hasNext() {
//				if (current>=0 && current<=size-1)
//					return true;
//				return false;
				//optimizando codigo

				return actual<size;
			}

			@Override
			/**Te devuele el actual modificado**/
			public E next() {
//				if (hasNext()) {
//					E elemento = data[current];
//					current++;
//					return elemento;
//				}
//				return null;
				//optimizacion
				//te devuelve data, y luego aumenta el siguinte
				return data[actual++];
			}
			@Override
			/**elimina el contenido y la posicion del array**/
			public void remove() {

				ArrayList.this.remove(actual);
		}

}
}
