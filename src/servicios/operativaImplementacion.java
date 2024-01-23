package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.EsclavoDtos;
import dtos.PacienteDto;

public class operativaImplementacion implements operativaInterfaz
{
	Scanner comunicacionTecladoM = new Scanner (System.in);
	@Override
	public void aniadirNuevoPaciente(List<PacienteDto> listaPacientes) {
		
		PacienteDto paciente =CrearNuevoPaciente();
		listaPacientes.add(paciente);
	}
	
				private PacienteDto CrearNuevoPaciente() {
		
		PacienteDto pacienteNuevo = new PacienteDto();
		
		System.out.println("Introduzca id de la mascota");
		pacienteNuevo.setIdPaciente(comunicacionTecladoM.nextInt());
		System.out.println("Introduzca nombreMascota");
		pacienteNuevo.setNombreMascota(comunicacionTecladoM.next());
		System.out.println("Introduzca edadMascota");
		pacienteNuevo.setEdadPaciente(comunicacionTecladoM.nextInt());
		System.out.println("Introduzca fechaNacimientoMascota");
		pacienteNuevo.setFechaNacimientoPaciente(comunicacionTecladoM.next());
		System.out.println("Introduzca sexoBiologicoMascota");
		pacienteNuevo.setSexoBiologicoPaciente(comunicacionTecladoM.next().charAt(0));
		System.out.println("Introduzca especieMascota ");		
		pacienteNuevo.setEspeciePaciente(comunicacionTecladoM.next());
		return pacienteNuevo;
	}
				@Override
				public void aniadirNuevoCliente(List<PacienteDto> listaPacientes) {
					
					System.out.println("Tiene una cuenta como cliente ya creada? S o N");
					String respuestaCliente =comunicacionTecladoM.next();
					if(respuestaCliente.equals("s")) {
						
						aniadirNuevoPaciente(listaPacientes);
					}else {if(respuestaCliente.equals("n")) {CrearNuevoEsclavo();}
					
					}
					}
	
public void aniadirNuevoEsclavo(List<EsclavoDtos> listaEsclavos) {
		
	EsclavoDtos esclavo =CrearNuevoEsclavo();
		listaEsclavos.add(esclavo);
	}
				private EsclavoDtos CrearNuevoEsclavo() {
		
		EsclavoDtos esclavoNuevo = new EsclavoDtos();
		
		
		System.out.println("Introduzca id del esclavo");
		esclavoNuevo.setIdEsclavo(comunicacionTecladoM.nextInt());
		System.out.println("Introduzca nombreEsclavo");
		esclavoNuevo.setNombreEsclavo(comunicacionTecladoM.next());
		System.out.println("Introduzca apellidosEsclavo");
		esclavoNuevo.setApellidosEsclavo(comunicacionTecladoM.next());
		System.out.println("Introduzca dniEsclavo");
		esclavoNuevo.setDniEsclavo(comunicacionTecladoM.next());
		System.out.println("Introduzca telefonoEsclavo");
		esclavoNuevo.setTelefonoEsclavo(comunicacionTecladoM.next());
		
		return esclavoNuevo;
		}

	
		
	}
	

