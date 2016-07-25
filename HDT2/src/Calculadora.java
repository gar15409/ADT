import java.io.BufferedReader;
import java.io.FileReader;

public class Calculadora implements I_Calculadora {

	Pila miPila = new Pila();
		
	@Override
	public int Calcular(String Vector) {
		// TODO Auto-generated method stub
		int x = 0; 
		String[] Arreglo = Vector.split(" ");
		
		for(String cadena: Arreglo){
			try{miPila.Push(Integer.parseInt(cadena));
				
			}catch (Exception e){
				switch(cadena){
				case "+":
						x = (int)miPila.Pop()+(int)miPila.Pop();
						miPila.Push(x);
						break;
				case "-":
					x = (int)miPila.Pop()-(int)miPila.Pop();
					miPila.Push(x);
					break;		
				case "*":
					x = (int)miPila.Pop()*(int)miPila.Pop();
					miPila.Push(x);
					break;
				case "/":
					x = (int)miPila.Pop()/(int)miPila.Pop();
					miPila.Push(x);
					break;	
				}
			}	
		}
		return x;
	}

	@Override
	public String LeerArchivo(String direccion) {
		// TODO Auto-generated method stub
		String operacion = "";
		
		try{
			//FileReader fr = new FileReader(direccion);
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String x ="";
			String cadena;
			while ((cadena = bf.readLine()) != null){
				x = x + cadena;
			}
		operacion = x;
		}
		catch(Exception e){
			System.out.println("NA");
		}
		return operacion;
	}
}
