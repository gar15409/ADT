
public class main {

	public static void main(String []args)
	{
		LeerEscribir le = new LeerEscribir();
		
		le.Escribir();
		
		le.Convertir(le.LeerArchivo("C:\\Users\\usuario1\\git\\HDT3\\texto.txt"));
		
		System.out.println("EEEA");
		System.out.println(le.Convertir(le.LeerArchivo("C:\\Users\\usuario1\\git\\HDT3\\texto.txt")));
		
	}
	
}
