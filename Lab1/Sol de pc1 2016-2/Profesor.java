class Profesor extends MiembroPUCP{
	
	private TipoDedicacion estado;
	
	public Profesor(String codigoPUCP, String nombre, String apellidoPaterno, TipoDedicacion estado){
		super(codigoPUCP, nombre, apellidoPaterno);
		this.estado = estado;
	}
	
	@Override
	public String consultarDatos(){
		return "Profesor: " + getCodigoPUCP() + " " + getNombre() + " " + getApellidoPaterno() + " - " + estado + "\n";
	}
}