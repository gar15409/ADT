import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;

public class LeerEscribir {
	

	
	public void Escribir(){
		
		Random rnd = new Random();
		
		for (int i = 0;i<5;i++){
		// Genera numero random	
		int x = (int)(rnd.nextDouble()*5000+1000);
		 
		System.out.println(x);
		
		String saludo = Integer.toString(x);

		try
		{
		//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
		File archivo=new File("C:\\Users\\usuario1\\git\\HDT3\\src\\texto.txt");
		//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
		FileWriter escribir=new FileWriter(archivo,true);
		//Escribimos en el archivo con el metodo write 
		escribir.write(saludo+" ");
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
	
	
	public String LeerArchivo(String direccion) {
		// TODO Auto-generated method stub
		String operacion = "";
		try{
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String cadena;
			while ((cadena = bf.readLine()) != null){
				operacion = operacion + cadena;
			}
		}
		catch(Exception e){
			System.out.println("NA");
		}
		System.out.println(operacion);
		return operacion;
	}
	
	
	public String[] Convertir(String Vector){
		String[] Arreglo = Vector.split(" ");
		System.out.println("  ");
		System.out.println(Arrays.toString(Arreglo));
		return Arreglo;
	}
	
	}

