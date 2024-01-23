package dtos;

public class EsclavoDtos {
	//Atributos
	String nombreEsclavo;
	String apellidosEsclavo;
	String dniEsclavo;
	String telefonoEsclavo;
	long idEsclavo;
	
	
	//Getters y Setters 
	public long getIdEsclavo() {
		return idEsclavo;
	}
	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}
	public String getNombreEsclavo() {
		return nombreEsclavo;
	}
	public void setNombreEsclavo(String nombreEsclavo) {
		this.nombreEsclavo = nombreEsclavo;
	}
	public String getApellidosEsclavo() {
		return apellidosEsclavo;
	}
	public void setApellidosEsclavo(String apellidosEsclavo) {
		this.apellidosEsclavo = apellidosEsclavo;
	}
	public String getDniEsclavo() {
		return dniEsclavo;
	}
	public void setDniEsclavo(String dniEsclavo) {
		this.dniEsclavo = dniEsclavo;
	}
	public String getTelefonoEsclavo() {
		return telefonoEsclavo;
	}
	public void setTelefonoEsclavo(String telefonoEsclavo) {
		this.telefonoEsclavo = telefonoEsclavo;
	}
	
	//Constructores
	public EsclavoDtos(long idEsclavo, String nombreEsclavo, String apellidosEsclavo, String dniEsclavo,
			String telefonoEsclavo) {
		super();
		this.idEsclavo = idEsclavo;
		this.nombreEsclavo = nombreEsclavo;
		this.apellidosEsclavo = apellidosEsclavo;
		this.dniEsclavo = dniEsclavo;
		this.telefonoEsclavo = telefonoEsclavo;
	}
	
	public EsclavoDtos() {
		super();
	}


}
