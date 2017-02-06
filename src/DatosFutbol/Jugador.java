package DatosFutbol;

	public class Jugador extends Equipo {

		protected int idJugador;
		protected String nombre;
		protected int partidosJugados;
		protected int golesMetidos;
		
		public Jugador(){

			idJugador = 01;
			nombre = " Roberto";
			idEquipo = 01;
			partidosJugados = 20;
			golesMetidos = 30;
		}
		

		public Jugador(int idJugador,String nombre,int partidosJugados,int golesMetidos){
			
			this.idJugador = idJugador;
			this.nombre = nombre;
			this.partidosJugados = partidosJugados;
			this.golesMetidos = golesMetidos;
			
		}
		
		public Jugador(int idJugador, String nombre){
			this.idJugador = idJugador;
			this.nombre = nombre;
		}
		
		public Jugador(String nuevoNombre){
			nombre = nuevoNombre;
		}
		
		public int promedioGoles(){
			int mediaGoles = golesMetidos / partidosJugados;
			return mediaGoles;
		}
		
		public void imprimirPromedioGol(){
			System.out.println("el promedio de los goles "
			+this.getClass().getSimpleName()+" es "+promedioGoles());
		}
		public String datosJugador(){
			
			Jugador.class.getName();
			return datosJugador();
		}
		public void imprimirJugador(){
			System.out.println("Los datos del jugador son : "
			+this.getClass().getSimpleName()+" es "+datosJugador());
		}
		//GETS
		
		public int getidJugador(){
			return idJugador;
		}
		public String nombre(){
			return nombre;
		}
		public int partidosJugados(){
			return partidosJugados;
		}
		public int golesMetidos(){
			return golesMetidos;
		}
		
		//set
		
		
		public void setidJugador(int idJugador){
			this.idJugador = idJugador;
		}
		public void setnombre(String nombre){
			this.nombre = nombre;
		}
		public void setpartidosJugados(int partidosJugados){
			this.partidosJugados = partidosJugados;
		}
		public void setgolesMetidos(int golesMetidos){
			this.golesMetidos = golesMetidos;
		}
		
		
		
		
		
		
}
