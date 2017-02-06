package DatosFutbol;

public class Equipo {

	protected int idEquipo;
	protected String nombreEquipo;
	protected int [] jugador;
	
	
	
	
	public Equipo(){
		idEquipo = 01;
		nombreEquipo = "Barcerlona";
	//	jugador [22] =  jugador[0];
		
	}
	public Equipo(int idEquipo,String nombreEquipo,int[] jugador){
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;
		this.jugador = jugador;
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
		return jugador;
	}
	
	
	//set
	
	
	public void setidEquipo(int idEquipo){
		this.idEquipo = idEquipo;
	}
	public void setnmombreEquipo(String nombreEquipo){
		this.nombreEquipo = nombreEquipo;
	}
	public void setjugador (int[] jugador){
		this.jugador = jugador;
	}
	
	
}
