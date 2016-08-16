/**
 * @author Pablo Ortiz, Pedro Garcia
 *
 * @param <E>
 */
public class DoubleNode <E>{
	protected E data; 
	protected DoubleNode<E> nextElement; 
	protected DoubleNode<E> previousElement;
	
	/**
	 * @param v
	 * @param next
	 * @param previous
	 */
	public DoubleNode(E v, DoubleNode<E> next, DoubleNode<E> previous) { 
		data = v; 
		nextElement = next; 
		previousElement = previous;
		if (nextElement != null){ 
			nextElement.previousElement = this; 
			previousElement = previous;
		}
		if (previousElement != null) {
			previousElement.nextElement = this;
		}
	}
	/**
	 * @param v
	 */
	public DoubleNode(E v){  
		// post: constructs a single element 
		this(v,null,null);
	}
	/**
	 * @return
	 */
	public DoubleNode<E> next() {
		// TODO Auto-generated method stub
		return nextElement;
	}
	/**
	 * @return
	 */
	public E value() {
		// TODO Auto-generated method stub
		return data;
	}
	/**
	 * @return
	 */
	public DoubleNode<E> previous() {
		// TODO Auto-generated method stub
		return previousElement;
	}
	
	/**
	 * @param next
	 */
	public void setNext(DoubleNode<E> next) {
	// post: sets reference to new next value  
		nextElement = next; 
	}

}
