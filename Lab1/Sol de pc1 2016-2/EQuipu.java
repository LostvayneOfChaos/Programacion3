import java.util.ArrayList;
class EQuipu{
	private ArrayList<Equipo> equipos;
	private ArrayList<Miembro> ejecutivos;
	
	public ArrayList<Equipo> getEquipos(){
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo> equipos){
		this.equipos = equipos;
	}

	public String consultarMiembrosDeEquipo(int numero){
		String reporte = "";
		//Recorremos todos los miembros del equipo con índice "numero".
		for(Miembro m : this.equipos.get(numero).getMiembros()){
			/* El enunciado menciona que la clase EQuipu tiene la obligacion de:
			"consultar los datos de todos los miembros PUCP (alumnos y profesores) de un equipo en particular". Esto excluye a los miembros externos.
			Si se tuviera un miembro externo como parte del equipo, no sería impreso en el reporte.
			Nótese además que se está llamando al método "consultarDatos" de la clase "MiembroPUCP" (clase base), pero debido a la sobreescritura del método, se llama al comportaiento específico establecido en la clase derivada.
			*/
			if(m instanceof MiembroPUCP)
				reporte = reporte + ((MiembroPUCP)m).consultarDatos();
		}
		return reporte;
	}
}