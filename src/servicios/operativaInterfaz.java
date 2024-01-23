package servicios;

import java.util.List;

import dtos.EsclavoDtos;
import dtos.PacienteDto;

public interface operativaInterfaz {

	public void aniadirNuevoPaciente(List<PacienteDto> listaPacientes);
	
	public void aniadirNuevoCliente(List<PacienteDto> listaPacientes);
	
	public void aniadirNuevoEsclavo(List<EsclavoDtos> listaEsclavos);
}
