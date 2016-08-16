/**
 * 
 */
import java.util.Scanner;
/**
 * @author Pablo Ortiz, Pedro Garcia
 * @version 15/08/2016
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
	    int menu = 0;
	    int opcion= 0;
	    int opcion1 =0;

		
	    Calculadora texto = new Calculadora(opcion1,opcion);
		int cont;
		int contList;
		int x = 0;
		
		while(x==0){	
		System.out.println("Ingrese el numero de la opcion");
		System.out.println("");
		System.out.println("1. ArrayList");
		System.out.println("2. Vector");
		System.out.println("3. Lista");
		cont = sc.nextInt();
		
		
		if(cont == 3 && x ==0){
			x = 1;
			System.out.println("Ingrese tipo de lista");
			System.out.println("");
			System.out.println("1. Singly Linked List");
			System.out.println("2. Double Linked List");
			System.out.println("3. Circular");
			contList = sc.nextInt();
			x = 0;
		}
		
		texto.Calcular(texto.LeerArchivo("C:\\Users\\usuario1\\git\\HDT4\\src\\ejemplo.txt"));
		System.out.println("El resultado de la operacion es: \n");
		System.out.println(texto.Calcular(texto.LeerArchivo("C:\\Users\\usuario1\\git\\HDT4\\src\\ejemplo.txt")));
		
		}
	}
}