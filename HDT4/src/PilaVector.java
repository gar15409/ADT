import java.util.Vector;

/**
 * 
 */

/**
 * @author Pablo Ortiz, Pedro Garcia
 *
 */
public class PilaVector<E> extends PilaAbstracta<E>{
    
    protected Vector<E> miPilaV;
    
    /**
     * Constructor
     */
    public PilaVector(){
        miPilaV = new Vector<E>();
    }
    
	/**
     * @see ADTStack#push(java.lang.Object)
     */
    public void Push(E Elemento){
        miPilaV.add(Elemento);
    }
    
	/**
     * @see ADTStack#pop()
     */
    public E Pop(){
    	E x = (E) miPilaV.lastElement();
		miPilaV.remove(miPilaV.lastElement());
		return x;
    }
    
    
	/**
     * @see ADTStack#size()
     */
    public int Size(){
        return miPilaV.size();
    }

	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}
}