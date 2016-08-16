/**
 * @author Pedro Garcia, Pablo Ortiz
 * @version 15/08/2016
 * I_Stack.java 
 */

public interface I_Stack<E> {
	/**
 	* @description se llaman los metodos de la pila
 	*/
	public void Push(E Element);
	public E Pop();
	public boolean IsEmpty();
	public int Size();
	public E get();
	
}
