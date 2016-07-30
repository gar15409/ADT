import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Escribir {
	
	
	public static void main(String []args)
	{
		  Random rnd = new Random();
		  rnd.nextInt();

	//Un texto cualquiera guardado en una variable
	String saludo="Hola hugo gaytored 1 6 5 1 5 4 6 8 4 8";

	try
	{
	//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
	File archivo=new File("texto.txt");

	//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
	FileWriter escribir=new FileWriter(archivo,true);

	//Escribimos en el archivo con el metodo write 
	escribir.write(saludo);

	//Cerramos la conexion
	escribir.close();
	}

	//Si existe un problema al escribir cae aqui
	catch(Exception e)
	{
	System.out.println("Error al escribir");
	}
	}
	
	
}
