package juego;

public class Heroes {
 	private String nombre;
	private int vida, ataque, curacion;
	
	public Heroe(String nombre, int vida, int ataque, int curacion) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.curacion = curacion;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getCuracion() {
		return curacion;
	}
}
