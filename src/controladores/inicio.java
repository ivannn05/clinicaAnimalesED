package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.EsclavoDtos;
import dtos.PacienteDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.operativaImplementacion;
import servicios.operativaInterfaz;

/**
 * Clase por el que se accede a la aplicacion
 * 290923 - ilp
 * @author csi23-ilp
 */

public class inicio {
	
	/**
	 * Metodo principal de nuestra aplicacion 
	 * Define el procedimento, es de donde toda accion parte 
	 * Y a donde toda accion llega cuando acaba 
	 * 290923
	 * @author ilp
	 * @param args
	 */
	public static void main(String[] args) {
	    
		int seleccionUsuario;
		boolean cerrarMenu = false;
		Scanner comunicacionTecladoM = new Scanner (System.in);
		
		
	

		
		
		List<PacienteDto> listaPacientes = new ArrayList<PacienteDto>();
		List<EsclavoDtos> listaEsclavos = new ArrayList<EsclavoDtos>();
		
		MenuInterfaz mi =new MenuImplementacion ();
		operativaInterfaz op = new operativaImplementacion();
		while (!cerrarMenu) {
			
			seleccionUsuario = mi.mostrarMenuYSeleccion(comunicacionTecladoM);
			System.out.println(seleccionUsuario);
			switch(seleccionUsuario) {
			case 0:
				System.out.println("Se ejecuta caso 0");
				cerrarMenu=true;
				break;
			case 1:
				op.aniadirNuevoCliente(listaPacientes);
				break;
			case 2:
				System.out.println("Se ejecuta caso 2");
				break;
			case 3:
				System.out.println("Se ejecuta caso 3");
				break;
			case 4:
				System.out.println("Se ejecuta caso default");
					break;
			}
			
		}

	}

}

