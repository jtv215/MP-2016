package org.mp.sesion04;

/**
 * The Class GenericStack.
 *
 * @param <E> the element type
 */
public class GenericStack<E> {

  /** The lista. */
  private org.mp.sesion03.ArrayList<E>
     lista = new org.mp.sesion03.ArrayList<E>();

  /**
   * Gets the size.
   * @return the size
   */
  public int getSize() {
    return lista.size();
  }

  /**
   * Peek.
   * @return the e
   */
  public E peek() {
    return lista.get(getSize() - 1);
  }

  /**
   * Push.
   * @param o the o
   */
  public void push(E o) {
    lista.add(o);
  }

  /**
   * Pop.
   * @return the e
   */
  public E pop() {
    E o = lista.get(getSize() - 1);
    lista.remove(getSize() - 1);
    return o;
  }

  /**
   * Checks if is empty.
   *
   * @return true, if is empty
   */
  public boolean isEmpty() {
    return lista.isEmpty();
  }


  @Override
  public String toString() {
	return "Pila: " + lista.toString();
  }
}
