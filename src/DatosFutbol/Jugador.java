package DatosFutbol;

	public class Jugador extends Equipo {

		protected int idJugador;
		protected String nombre;
		protected double partidosJugados;
		protected double golesMetidos;
		
		public Jugador(){

			idJugador = 01;
			nombre = " Roberto";
			idEquipo = 01;
			partidosJugados = 20;
			golesMetidos = 30;
		}
		

		public Jugador(int idJugador,String nombre,double partidosJugados,double golesMetidos){
			
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
		
		public double promedioGoles(){
			
			double mediaGoles = 0;
			if (partidosJugados!=0)
					mediaGoles=golesMetidos / partidosJugados;
			else 
				mediaGoles =-1;
			return mediaGoles;
		}
		
		public void imprimirPromedioGol(){
			imprimirJugador();
			if (promedioGoles()==-1)
				System.out.println("No ha jugado ningún partido");
			else
				System.out.println("el promedio de los goles "
			+this.getClass().getSimpleName()+" es "+promedioGoles());
		}
		public String datosJugador(){
			/*idEquipo = 01;
			partidosJugados = 20;
			golesMetidos = 30;*/
			return "Id jugador: "+ idJugador+" nombre: "+nombre+" partidos Jugados "+partidosJugados+" Goles Metidos "+golesMetidos;
 			
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
		public double partidosJugados(){
			return partidosJugados;
		}
		public double golesMetidos(){
			return golesMetidos;
		}
		
		//set
		
		
		public void setidJugador(int idJugador){
			this.idJugador = idJugador;
		}
		public void setnombre(String nombre){
			this.nombre = nombre;
		}
		public void setpartidosJugados(double partidosJugados){
			this.partidosJugados = partidosJugados;
		}
		public void setgolesMetidos(double golesMetidos){
			this.golesMetidos = golesMetidos;
		}
		
		
		
		
		
		
}
