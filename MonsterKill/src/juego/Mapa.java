package juego;

import java.util.Random;
import java.util.Scanner;

public class Mapa {

	public void crearEnemigo(){
		String[] nombre = {"Dragon", "Ogro", "Duende, "Vampiro"};
		int[] vida = {500,300,175, 200};
		int[] ataque = {90,70,50,60};
		int[] curacion = {70,60,50, 80};
	}
	public void crearHeroe() {
	 	String nombres[] = {"Arquero","Mago","Caballero","Asesino","Lancero"};
		 int ataques[]= {80,60,70,90,75};
	 	int vidas[]= {325,325,450,275,450};
	 	int curaciones[]= {20,50,30,40,30};
	}
	
	public void luchar() {
		
		do {
		
		System.out.println("Que quieres hacer luchar o curate");
		char accionHeroe = decidirAccion();
		if (accionHeroe=='l') {
			vidaEnemigo-=ataqueHeroe;
		}else {
			vidaHeroe+=curacionHeroe;
		}
		
		int accionEnemigo=obtenerEntero(1, 100);
		if (accionEnemigo<75) {
			vidaHeroe-=ataqueEnemigo;
		}else {
			vidaEnemigo+=curacionEnemigo;
		}
		
	
		} while (vidaHeroe<=0 || vidaEnemigo<=0);
		if (vidaHeroe>0) {
			System.out.println("Enhorabuena has derrotado al enemigo");
			vidaHeroe+=100;
		}else {
			System.out.println("has sido derrotado");
		}
		
		
		
	}
	
	public static char decidirAccion() {
		Scanner leer = new Scanner(System.in);
		char letra = leer.nextLine().charAt(0);
		letra = Character.toUpperCase(letra);
		return letra;
	}
	
	public static int obtenerEntero(int min, int max) {
		int intervalo = max + 1 - min;
		return (int) (Math.random() * (intervalo)) + min;
	}
	
}
