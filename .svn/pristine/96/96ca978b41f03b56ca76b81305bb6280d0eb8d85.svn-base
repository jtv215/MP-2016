package org.mp.sesion04;

import java.util.Iterator;

import org.mp.sesion03.LinkedList;

/**
 * The Class SortedLinkedList.
 *
 * @param <E> the element type
 */
//linked list ordenado
public class SortedLinkedList <E extends Comparable<E>> extends LinkedList<E>{

	/**
	 * Instantiates a new sorted linked list.
	 */
	public SortedLinkedList(){

	}

	/**
	 * Instantiates a new sorted linked list.
	 *
	 * @param objects the objects
	 */
	public SortedLinkedList(Comparable <E>[] objects){
		for (int i = 0; i < objects.length; i++) {
			addSorted(objects[i]);
		}
	}



	public void addFirst(E o){
		throw new UnsupportedOperationException("No garantiza orden");

	}

	public void addLast(E o){
		throw new UnsupportedOperationException("No garantiza orden");

	}

	public E set (int index,E o){
		throw new UnsupportedOperationException("No garantiza orden");

	}

	public void add(E o){
		throw new UnsupportedOperationException("No garantiza orden");

	}

	/**
	 * Adds the sorted.
	 *
	 * @param e the e
	 */
	public void addSorted(Comparable<E> e){
		Iterator<E> it = iterator();
		int index=0;//contador
		while (it.hasNext()&& e.compareTo(it.next())>0){
			index++;
		}
		if(index==0){
			super.addFirst((E)e);
		}else if (index==size) {
			super.addLast((E)e);
		}else{
			add(index,(E)e);
		}
	}

	public String toString(){
		String s="Lista ordenada: [";
		Iterator<E>it =iterator();

		while(it.hasNext()){
			s+=it.next();
			if(it.hasNext()){
				s+=", ";
			}
		}s+="]";
		return s;

	}



}
