
public class Driver implements Radio {
	
	// Atributos
	
	private boolean power;
	private boolean Tune_Type;
	private double Tune;
	
	public void  OnOff(){
		power = !power;
	}
	public void AmFm(){
		Tune_Type = !Tune_Type;
	}
	public void CambiarEmisora(double Tune){
		
	}
	public void GuardadEmisora(int numero){
		
	}
	public void SeleccionarEmisora(){
		
	}
	public void GuardarSeleccionar(){
		
	}
	
	
}
