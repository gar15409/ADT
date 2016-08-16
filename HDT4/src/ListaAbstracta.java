/**
 * 
 */

/**
 * @author Pablo Ortiz, Pedro Garcia
 *
 */
public abstract class ListaAbstracta<E> implements ILista<E> {

	protected int contador;
	
	/**
	 * @see ILista#size()
	 */
	public int size(){
		return contador;	
	}
	
}