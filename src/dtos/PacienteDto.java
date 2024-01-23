package dtos;

public class PacienteDto {
	
	long idPaciente;
	String nombreMascota ="aaaaa";
	int edadPaciente=11111;
	String fechaNacimientoPaciente="9999/12/31";
	char sexoBiologicoPaciente='a';
	String especiePaciente="aaaaa";
	long idEsclavo;
	
	//Constructores
	public PacienteDto(long idPaciente, String nombreMascota, int edadPaciente, String fechaNacimientoPaciente,
			char sexoBiologicoPaciente, String especiePaciente, long idEsclavo) {
		super();
		this.idPaciente = idPaciente;
		this.nombreMascota = nombreMascota;
		this.edadPaciente = edadPaciente;
		this.fechaNacimientoPaciente = fechaNacimientoPaciente;
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
		this.especiePaciente = especiePaciente;
		this.idEsclavo = idEsclavo;
	}
	
	public PacienteDto() {
		super();
	}
	
	//GETTERS Y SETTERS
	public long getIdPaciente() {
		return idPaciente;
	}
	
	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public int getEdadPaciente() {
		return edadPaciente;
	}
	public void setEdadPaciente(int edadPaciente) {
		this.edadPaciente = edadPaciente;
	}
	public String getFechaNacimientoPaciente() {
		return fechaNacimientoPaciente;
	}
	public void setFechaNacimientoPaciente(String fechaNacimientoPaciente) {
		this.fechaNacimientoPaciente = fechaNacimientoPaciente;
	}
	public char getSexoBiologicoPaciente() {
		return sexoBiologicoPaciente;
	}
	public void setSexoBiologicoPaciente(char sexoBiologicoPaciente) {
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
	}
	public String getEspeciePaciente() {
		return especiePaciente;
	}
	public void setEspeciePaciente(String especiePaciente) {
		this.especiePaciente = especiePaciente;
	}
	public long getIdEsclavo() {
		return idEsclavo;
	}
	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}

	//ToString
	@Override
	public String toString() {
		return "PacienteDto [idPaciente=" + idPaciente + ", nombreMascota=" + nombreMascota + ", edadPaciente="
				+ edadPaciente + ", fechaNacimientoPaciente=" + fechaNacimientoPaciente + ", sexoBiologicoPaciente="
				+ sexoBiologicoPaciente + ", especiePaciente=" + especiePaciente + ", idEsclavo=" + idEsclavo + "]";
	}
	
	

	
}
