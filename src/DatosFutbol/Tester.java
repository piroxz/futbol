package DatosFutbol;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args)  {
		Scanner lee = new Scanner(System.in);
		
		Jugador jugador1 = new Jugador();
		
		System.out.println(jugador1);
		
		//System.out.println("introduzca el nombre del jugador ");
	
		//Equipo nuevoEquipo = new Equipo();
		
		
		Jugador listaJugador[] = new Jugador[2];
		listaJugador[0] = new Jugador();
		listaJugador[1] = new Jugador(50,"50");
		
		
		for (int i = 0; i < listaJugador.length; i++) {
			listaJugador[i].golesMetidos();

		}
		
		
		
		
	}

}
