package DatosFutbol;

public class Equipo {

	protected int idEquipo;
	protected String nombreEquipo;
	protected int [] jugadores;
	
	
	
	
	public Equipo(){
		idEquipo = 01;
		nombreEquipo = "Barcerlona";
	//	jugadores [22] =  jugadores[0];
		
	}
	public Equipo(int idEquipo,String nombreEquipo,int[] jugador){
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;
		this.jugadores = jugador;
	}
	public Equipo(int idEquipo,String nombreEquipo){
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;
	}
	
	
	//get
	
	public int getidEquipo(){
		return idEquipo;
	}
	public String getnombreEquipo(){
		return nombreEquipo;
	}
	public int[] getjugador(){
		return jugadores;
	}
	
	
	//set
	
	
	public void setidEquipo(int idEquipo){
		this.idEquipo = idEquipo;
	}
	public void setnmombreEquipo(String nombreEquipo){
		this.nombreEquipo = nombreEquipo;
	}
	public void setjugador (int[] jugador){
		this.jugadores = jugador;
	}
	public void imprimirDatosJugadores(){

		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i]
		}
		
		
		
	}
	
}
