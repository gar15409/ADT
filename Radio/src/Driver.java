
/**
@author Pablo Ortiz, Pedro Garcia, Fredy Espana
@version 1.1 alpha
*/	
public class Driver implements Radio {
	
	/** Atributos */
	
	protected boolean power = false; /** Determina encendio apagado */
	protected boolean Tune_Type = false; /** Am o FM */
	protected boolean Save_Select = false; /** Determina si los botones guardan o seleccionan */
	protected double Tune; /** Estacion de radio */
	protected double AmArray[] = new double[11]; /** Memoria AM de botones */
	protected double FmArray[] = new double[11]; /** Memoria FM de botones */
	
	/**
	@param null
	@return null
	*/
	public void  ON_OFF(){
		power = !power;
	}
	
	/**
	@param null
	@return null
	*/
	public void AM_FM(){
		Tune_Type = !Tune_Type;
		if(Tune_Type == false){
			Tune = 530;
		}
		else{
			Tune = 87.90;
		}
	}
	
	/**
	@param null
	@return null
	*/
	public void Cambio_de_Emisora(boolean a){
		/** true = AM */
		if(a == true){
		if(Tune_Type == false && Tune >= 530 && Tune <= 1610){
			Tune = Tune + 10;
			if(Tune >= 1610){
				Tune = 530;
			}
		}
		if(Tune_Type = true && Tune >= 87.9 && Tune <= 107.9){
			Tune = Tune + (0.2);
			System.out.println(Tune);
			if(Tune >= 107.9){
				Tune = 87.9;
			}
		}
	}
		/** false = FM */
		if(a == false){
			if(Tune_Type == false && Tune >= 530 && Tune <= 1620){
				Tune = Tune - 10;
				if(Tune <= 530){
					Tune = 1610;
				}
			}
			if(Tune_Type = true && Tune >= 87.9 && Tune <= 107.9){
				Tune = Tune - 0.20;
			}
			if(Tune <= 87.9){
				Tune = 107.9;
			}
			}
	}
	
	/**
	@param numero entero, determina el boton en el que se guarda
	@return null
	*/
	public void Guardar_Emisora(int numero){
		if(Tune_Type == true){
			AmArray[numero] = Tune;
		}
		if(Tune_Type == false){
			FmArray[numero] = Tune;
		}
	}
	
	/**
	@param numero entero, determina el boton del que se extrae la emisora
	@return null
	*/
	public void Seleccionar_emisora_guardada(int numero){
		if(Tune_Type == true){
			Tune = AmArray[numero];
		}
		if(Tune_Type == false){
			Tune = FmArray[numero];
		}
		
	}
	
	/**
	@param null
	@return null
	*/
	public void Guardar_seleccion(){
		Save_Select = !Save_Select;
	}
	
	/**
	@param null
	@return emisora, Tune
	*/
	public double getEmisora(){
		return Tune;
	}
	
}
