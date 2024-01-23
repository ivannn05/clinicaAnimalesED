package servicios;
import java.util.Scanner;
/**
 * Interfaz que enumera los metodos del a funcionalidad del menu
 * @author csi23-iloposa -031023
 */
public interface MenuInterfaz {

	/**
	 * Mostrar el menu al ususario y que recoja la opcion
	 * @author csi23-iloposa-031023
	 * @return (int) el numero de la acion que soluciona el usuario
	 */
	
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM);
	
}

