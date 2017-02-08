package DatosFutbol;

import java.util.Scanner;

public class Tester {
		public static Jugador altaJugadores(){
			
			Scanner lee = new Scanner(System.in);
				
		Jugador nuevoJugador;
		int idJugador;
		String nombre;
		double partidosJugados;
		double golesMetidos;
		System.out.println("Escriba los datos del jugador : ");
		System.out.println("Escriba el id del jugador : ");
		idJugador = lee.nextInt();
		System.out.println("Escriba el nombre : ");
		nombre = lee.nextLine();
		System.out.println("Escriba los partidos jugados :");
		partidosJugados = lee.nextDouble();
		System.out.println("Escriba  los goles metidos :");
		golesMetidos = lee.nextDouble();
		
		nuevoJugador = new Jugador(idJugador,nombre,partidosJugados,golesMetidos);
		return nuevoJugador;
	}

		
		public static Jugador nuevoJugador2(){
			Scanner lee = new Scanner(System.in);
			
			System.out.println("Escriba los datos del jugador : (id jugador , nombre , partidos jugados , goles metidos)");
			return new Jugador(lee.nextInt(),lee.nextLine(),lee.nextDouble(),lee.nextDouble());
		}
	public static void main(String[] args)  {
		
		
		Jugador jugador2 = new Jugador();

		System.out.println("introduxca los datos ");
		
		
		Jugador listaJugador[] = new Jugador[2];
		listaJugador[0] = new Jugador();
		listaJugador[1] = new Jugador(50 , " Daniel",10,10);
		
		Equipo Barcelona = new Equipo(1,"Barcelona",listaJugador);
		Barcelona.imprimirDatosJugadores();
		
		
		
		
	}

}
