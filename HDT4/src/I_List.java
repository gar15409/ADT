import java.util.Iterator;

/**
 * @author Estructura de Datos
 * @version 0.0
 * @date 24/07/2016
 * ADT para Listas
 */

public interface I_List<E> 
{

	 /**
	 * @return returns el número de elementos en la lista
	 */
	public int size();
	   // post: returns number of elements in list
	
	   /**
	 * @return true si la lista no tiene elementos
	 */
	public boolean isEmpty();
	   // post: returns true iff list has no elements
	
	   /**
	 * empties list
	 */
	public void clear();
	   // post: empties list
	
	   /**
	 * value se añade al inicio de la lista
	 * @param value
	 */
	public void addFirst(E value);
	   // post: value is added to beginning of list
	
	   /**
	 * value se añade al final de la lista
	 * @param value
	 */
	public void addLast(E value);
	   // post: value is added to end of list
	
	   /**
	 * @return el primer valor de la lista
	 */
	public E getFirst();
	   // pre: list is not empty
	   // post: returns first value in list
	
	   /**
	* @return el último valor de la lista
	*/
	public E getLast();
	   // pre: list is not empty
	   // post: returns last value in list
	
	   /**
	* borra el primer valor de la lista
	* @return el elemento eliminado
	*/
	public E removeFirst();
	   // pre: list is not empty
	   // post: removes first value from list
	
	   /**
	 * @return el último valor
	 *  elimina el último valor de la lista
	 */
	public E removeLast();
	   // pre: list is not empty
	   // post: removes last value from list
	
	   /**
	    * elimina el elemento que coincide con value y lo devuelve
	 * @param value: el elemento a eliminar
	 * @return el elemento eliminado
	 */
	public E remove(E value);
	   // post: removes and returns element equal to value
	   // otherwise returns null
	
	/**
	 * se añade value a la cola de la lista
	 * @param value
	 */
	public void add(E value);
	   // post: value is added to tail of list
	
	/**
	 * Elimina el último elemento de la lista
	 * @return el elemento eliminado
	 */
	public E remove();
	   // pre: list has at least one element
	   // post: removes last value found in list
	
	/**
	 * @return el último elemento de la lista
	 */
	public E get();
	   // pre: list has at least one element
	   // post: returns last value found in list
	
	/**
	 * busca el elemento proporcionado en la lista
	 * @param value: el elemento a buscar
	 * @return true si lo encuentra, false en caso contrario
	 */
	public boolean contains(E value);
	   // pre: value is not null
	   // post: returns true iff list contains an object equal to value
	
	   /**
	 * @param value el valor a buscar en la lista
	 * @return int La posición del valor que se buscaba
	 */
	public int indexOf(E value);
	   // pre: value is not null
	   // post: returns (0-origin) index of value,
	   // or -1 if value is not found
	
	/**
	 * Devuelve la última posición del elemento buscado
	 * @param value el elemento a buscar la posición
	 * @return la posición del elemento encontrado o -1 si no se encontró
	 */
	public int lastIndexOf(E value);
	   // pre: value is not null
	   // post: returns (0-origin) index of value,
	   // or -1 if value is not found
	
	/**
	 * Obtiene el elemento que está en la posición i
	 * @param i: La posición del elemento
	 * @return el elemento encontrado en la posición i
	 */
	public E get(int i);
	   // pre: 0 <= i < size()
	   // post: returns object found at that location
	
	/**
	 * Modifica el valor del elemento que está en la posición i con el valor o
	 * @param i: posición del elemento
	 * @param o: nuevo valor del elemento
	 * @return el elemento en posición i antes de modificarlo.
	 */
	public E set(int i, E o);
	   // pre: 0 <= i < size()
	   // post: sets ith entry of list to value o;
	   // returns old value
	
	/**
	 * Adiciona un elemento en la posición i
	 * @param i posición donde estará el elemento
	 * @param o valor del elemento
	 */
	public void add(int i, E o);
	   // pre: 0 <= i <= size()
	   // post: adds ith entry of list to value o
	
	/**
	 * Elimina el elemento en la posición i
	 * @param i: posición del elemento
	 * @return el elemento eliminado
	 */
	public E remove(int i);
	   // pre: 0 <= i < size()
	   // post: removes and returns object found at that location
	
	/**
	 * @return un iterador
	 */
	public Iterator<E> iterator();
	   // post: returns an iterator allowing
	   // ordered traversal of elements in list

}