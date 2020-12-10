package org.mp.sesion04;

/**
 * The Class GenericQueue.
 *
 * @param <E> the element type
 */
public class GenericQueue<E> {

  /** The lista. */
  private org.mp.sesion03.LinkedList<E> lista
    = new org.mp.sesion03.LinkedList<E>();

  /**
   * Enqueue.
   *
   * @param e the e
   */
  public void enqueue(E e) {
    lista.addLast(e);
  }

  /**
   * Dequeue.
   *
   * @return the e
   */
  public E dequeue() {
    return lista.removeFirst();
  }

  /**
   * Gets the size.
   * @return the size
   */
  public int getSize() {
    return lista.size();
  }


  @Override
  public String toString() {
    return "Cola: " + lista.toString();
  }
}
