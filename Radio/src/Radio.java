/**
@author Pablo Ortiz, Pedro Garcia, Fredy Espana
@version 1.1 alpha
*/		
public interface Radio {
	
	public void  ON_OFF(); /** Cambia el estado, funcion switch */ 
	public void AM_FM(); /** Cambia el estado, funcion switch */
	public void Cambio_de_Emisora(boolean a); /** Cambia de emisora (forward, backward) */
	public void Guardar_Emisora(int numero); /** Guarda la emisora en un boton determinado */
	public void Seleccionar_emisora_guardada(int x); /** Selecciona la emisora de un boton determinado */
	public void Guardar_seleccion(); /** Determina si los botonoes guardan o seleccionan emisoras*/
	public double getEmisora(); /** */
}

