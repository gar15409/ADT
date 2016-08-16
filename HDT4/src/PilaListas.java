/**
 * 
 */

/**
 * @author Pablo Ortiz, Pedro Garcia
 *
 */
public class PilaListas<E> extends PilaAbstracta<E> {

    protected ListaAbstracta<E> miPilaL;
    protected int tipo;
    protected Factory fListas = new Factory();
    
    /**
     * @param type
     */
    public PilaListas(int type){
    	tipo=type;
    	miPilaL= fListas.getLista(tipo);
    	
    }

	/**
	 * @see ADTStack#push(java.lang.Object)
	 */
	@Override
	public void Push(E Elemento) {
		// TODO Auto-generated method stub
		miPilaL.addLast(Elemento);
	}

	/**
	 * @see ADTStack#pop()
	 */
	@Override
	public E Pop() {
		// TODO Auto-generated method stub
		return miPilaL.removeLast();
	}

	/**
	 * @see ADTStack#size()
	 */
	@Override
	public int Size() {
		// TODO Auto-generated method stub
        return miPilaL.size();
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
