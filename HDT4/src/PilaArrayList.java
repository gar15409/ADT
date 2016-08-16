/**
 * 
 */

import java.util.ArrayList;
/**
 * @author Pablo Ortiz, Pedro Garcia
 *
 */
public class PilaArrayList<E> extends PilaAbstracta<E> 
{
	protected ArrayList<E> miPilaA;

	/**
	 * Constructor
	 */
	public PilaArrayList()
	// post: constructs a new, empty stack
	{
		miPilaA = new ArrayList<E>();
	}

	/**
	 * @see I_Stack#push
	 */
	public void Push(E Elemento)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		miPilaA.add(Elemento);
	}

	/**
	 * @see I_Stack#pop()
	 */
	public E Pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return miPilaA.remove(Size()-1);
	}
	
        
        public int Size()
	// post: returns the number of elements in the stack
	{
		return miPilaA.size();
	}


	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
        
        
}
