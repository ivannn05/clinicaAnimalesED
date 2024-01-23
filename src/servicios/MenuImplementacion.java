
package servicios;

import java.util.Scanner;
/**
 * Implementacion de la intefaz menu
 * @author csi23-iloposa - 061023
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion (Scanner comunicacionTecladoM){
		 
		int opcionSeleccionada; 
		 
		System.out.println("#################################");
		System.out.println("\t0.Cerrar la aplicacion\t#");
		System.out.println("\t1.Registro de paciente\t#");
		System.out.println("#################################");
		System.out.println("Elija una opcion");
		
		opcionSeleccionada= comunicacionTecladoM.nextInt();
		
    		  return opcionSeleccionada;	 
	}

}
