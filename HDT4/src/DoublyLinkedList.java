/**
 * @author Estructura de Datos
 * @version 0.0
 * @date 09/08/2016
 * @file DoublyLinkedList.java
 * Implementa una lista doblemente enlazada
 * 
 */
public class DoublyLinkedList<E> extends A_List<E> {
	/**
	 * Atributos
	 */
	private DoubleNode<E> head;
	private DoubleNode<E> tail;
	private int count;

	
	public DoublyLinkedList(DoubleNode<E> head, DoubleNode<E> tail, int count) {
		this.head = head;
		this.tail = tail;
		this.count = count;
	}


	public DoublyLinkedList() {
		count = 0;
		head = null; 
		tail = null;
	}



	public DoubleNode<E> getHead() {
		return head;
	}
	
	public void setHead(DoubleNode<E> head) {
		this.head = head;
	}
	
	public DoubleNode<E> getTail() {
		return tail;
	}
	
	public void setTail(DoubleNode<E> tail) {
		this.tail = tail;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	

}