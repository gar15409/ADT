/**
 * 
 */

/**
 * @author Pablo Ortiz, Pedro Garcia
 *
 */
public class Factory {
	
	/**
     * @param opc1
     * @param opc2
     * @return
     */
    public PilaAbstracta getPila (int opc1, int opc2){
        if (opc1==2)
            return new PilaVector<Integer>();
        
        if (opc1==3)
            return new PilaArrayList<Integer>();
        
        if (opc1==1)
        	return new PilaListas<Integer>(opc2);
        
		return null;
        
    }
	
    /**
     * @param op2
     * @return
     */
    public ListaAbstracta getLista (int op2){
        if (op2==1)
            return new Circular();
        if (op2==2)
        	return new SinglyLinkedList();
        else 
        	return new DoublyLinkedList();
    }

}
