package juego;
public class HeroeEnemigo {
	private Heroe enemigo;
	private byte idEnemigos;
	
	public void crearEnemigo(){
		String[] nombre = {"Dragon", "Ogro", "Duende"};
		int[] vida = {500,300,175};
		int[] ataque = {90,70,50};
		int[] curacion = {70,60,50};
	}

	public HeroeEnemigo(Heroe heroe, byte idEnemigos) {
		super();
		this.enemigo = heroe;
		this.idEnemigos = idEnemigos;
	}

	public byte getIdEnemigos() {
		return idEnemigos;
	}

	

	public Heroe getHeroes() {
		return enemigo;
	}
}
