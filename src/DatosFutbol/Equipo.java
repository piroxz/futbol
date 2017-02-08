package DatosFutbol;

public class Equipo {

	protected int idEquipo;
	protected String nombreEquipo;
	protected Jugador [] jugadores;
	
	
	
	
	public Equipo(){
		idEquipo = 01;
		nombreEquipo = "Barcerlona";
	//	jugadores [22] =  jugadores[0];
		
	}
	public Equipo(int idEquipo,String nombreEquipo,Jugador[] jugador){
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
	public Jugador[] getJugador(){
		return jugadores;
	}
	
	
	//set
	
	
	public void setidEquipo(int idEquipo){
		this.idEquipo = idEquipo;
	}
	public void setnmombreEquipo(String nombreEquipo){
		this.nombreEquipo = nombreEquipo;
	}
	
	public void imprimirDatosJugadores(){
		System.out.println("Equipo: " + nombreEquipo +"\nID del equipo : "+idEquipo);
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i].imprimirJugador();
			jugadores[i].imprimirPromedioGol();
			
		}
		
		
		
	}
	
}
