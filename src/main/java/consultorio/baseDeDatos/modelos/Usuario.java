package consultorio.baseDeDatos.modelos;

public class Usuario{
	private int telefono;
	private int folio;
	private String categoria;
	private String TMedicos;
	private String padecimientos;
	private String nombre;
	private String FDNacimiento;
	private String domicilio;
	
	public Usuario() {
		telefono = 0;
		folio = 0;
		categoria = "";
		TMedicos = "";
		padecimientos = "";
		nombre = "";
		FDNacimiento = "";
		domicilio = "";
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTMedicos() {
		return TMedicos;
	}

	public void setTMedicos(String tMedicos) {
		TMedicos = tMedicos;
	}

	public String getPadecimientos() {
		return padecimientos;
	}

	public void setPadecimientos(String padecimientos) {
		this.padecimientos = padecimientos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFDNacimiento() {
		return FDNacimiento;
	}

	public void setFDNacimiento(String fDNacimiento) {
		FDNacimiento = fDNacimiento;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
}