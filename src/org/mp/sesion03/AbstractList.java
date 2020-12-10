package org.mp.sesion03;

/**
 * Clase abstracta de abstractlist generico.
 *
 * @param <E> the element type
 */
public abstract class AbstractList<E> implements List<E> {

  /** The size. */
  protected int size = 0; // Tamaño de la lista

  /**
   *  Crea una lista por defecto.
   */
  protected AbstractList() {
  }

  /**
   *  Crea una lista a partir de un array de objetos.
   *
   * @param objects the objects
   */
  protected AbstractList(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]);
  }

  /**
   *  Añade un nuevo elemento al final de la lista.
   *
   * @param e the e
   */
  public void add(E e) {
    add(size, e);
  }

  /**
   *  Devuelve true si la lista no contiene ningún elemento.
   *
   * @return true, if is empty
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   *  Devuelve el número de elementos de la lista.
   * @return the int
   */
  public int size() {
    return size;
  }

  /**
   *  Elimina la primera ocurrencia del elemento e de la lista.
   *  Desplaza la subsecuencia de elementos a la izquierda.
   *  Shift any subsequent elements to the left.
   *  Devuelve true si el elemento se eliminó.
   *
   * @param e the e
   * @return true, if successful
   */
  public boolean remove(E e) { 
    if (indexOf(e) >= 0) {
      remove(indexOf(e));
      return true;
    }
    else
      return false;
  }
}

