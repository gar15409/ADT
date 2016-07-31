
public class main {

	public static void main(String []args)
	{
		LeerEscribir le = new LeerEscribir();
		
		MergeSort ms = new MergeSort();
		InsertionSort is = new InsertionSort();
		SelectionSort ss = new SelectionSort();
		
		
		le.Escribir();
		
		le.Convertir(le.LeerArchivo("C:\\Users\\usuario1\\git\\HDT3\\src\\texto.txt"));
		
		ms.mergeSort(le.Convertir(le.LeerArchivo("C:\\Users\\usuario1\\git\\HDT3\\src\\texto.txt")));
		
	}
	
}
