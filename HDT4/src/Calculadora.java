/**
 * @author Pedro Garcia, Pablo Ortiz
 * @version 15/08/2016
 * Calculadora.java 
 */

import java.io.*;

public class Calculadora implements I_Calculadora {
	/**
	* @param Objeto
     Pila decision = new Pila();
	*/
	Factory stackFactory = new Factory();
	private PilaAbstracta<Integer> decision;
	
	/**
     * @param opc1
     * @param opc2
     */
    public Calculadora(int opc1, int opc2){
        decision = stackFactory.getPila(opc1,opc2);
    }
	 /**
	* @description Metodo calular, en el cual se realiza la operacion que se lea en el archivo
	*/
	@Override
	public int Calcular(String Vector) {
		// TODO Auto-generated method stub
		int x = 0; 
		String[] Arreglo = Vector.split(" ");
		 /**
		* se realiza un ciclo para leer y realizar las operaciones
		*/
		for(String cadena: Arreglo){
			try{decision.Push(Integer.parseInt(cadena));
				
			}catch (Exception e){
				switch(cadena){
				case "+":
						x = (int)decision.Pop()+(int)decision.Pop();
						decision.Push(x);
						break;
				case "-":
					x = (int)decision.Pop()-(int)decision.Pop();
					decision.Push(x);
					break;		
				case "*":
					x = (int)decision.Pop()*(int)decision.Pop();
					decision.Push(x);
					break;
				case "/":
					x = (int)decision.Pop()/(int)decision.Pop();
					decision.Push(x);
					break;	
				}
			}	
		}
		return x;
	}
	 /**
	* @description metodo LeerArchivo, se lee el archivo
	*/
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
		return operacion;
	}
}
