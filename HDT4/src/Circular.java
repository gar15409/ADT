import java.util.Iterator;

public class Circular<E> extends ListaAbstracta<E>  {
	
	protected Node<E> tail;

	/**
	 * Instantiates a new circular.
	 */
	public Circular() {
		// TODO Auto-generated constructor stub
		tail = null;
		contador = 0;
	}


	/**
	 * @see InterfazLista#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		Node<E> temp = new Node<E>(value);
		if(tail == null){
			tail = temp;
			tail.setNext(tail);
		}
		else{
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		contador++;
	}


	/**
	 * @see InterfazLista#removeFirst()
	 */
	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		Node<E> temp = null;
		if( tail == tail.next()){
			temp = tail.next();
			tail = null;
		}
		else if (tail != tail.next()){
			temp = tail.next();
			tail.setNext(tail.next().next());
		}
		contador--;
		return temp.value();
	}


	/**
	 * @see InterfazLista#removeLast()
	 */
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		Node<E> finger = tail;
		while(finger.next() != tail){
			finger = finger.next();
		}
		Node<E> temp = tail;
		if (finger == tail){
			tail = null;
		}
		else{
			finger.setNext(tail.next());
			tail = finger;
		}
		contador--;
		return temp.value();
	}


	/**
	 * @see InterfazLista#addLast(java.lang.Object)
	 */
	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		addFirst(value);
		tail = tail.next();
	}


	/**
	 * @see InterfazLista#getFirst()
	 */
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return tail.next().value();
	}

	/**
	 * @see InterfazLista#getLast()
	 */
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return tail.value();
	}


	/**
	 * @see InterfazLista#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		Node<E> finger = tail;
		while(finger != null && !finger.value().equals(value)){
			finger.next();
		}
		return finger != null;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public E remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int lastIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public E set(int i, E o) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(int i, E o) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
