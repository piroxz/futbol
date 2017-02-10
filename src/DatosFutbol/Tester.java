package DatosFutbol;

import java.util.Scanner;

public class Tester {
	
	public static  Jugador nuevoJugador(){
		
		System.out.println("INtruduzca el nunero de id del jugador");
		idJugador = lee.
	}
	
	
	
	
	

	public static void main(String[] args)  {
		Scanner lee = new Scanner(System.in);
		
		Jugador jugador1 = new Jugador();
		
		//System.out.println(jugador1);
		
		//System.out.println("introduzca el nombre del jugador ");
	
		//Equipo nuevoEquipo = new Equipo();
		
		
		Jugador listaJugador[] = new Jugador[2];
		listaJugador[0] = new Jugador();
		listaJugador[1] = new Jugador(50 , " Daniel",10,10);
		
		Equipo Barcelona = new Equipo(1,"Barcelona",listaJugador);
		Barcelona.imprimirDatosJugadores();
		
		
		
		
	}

}
