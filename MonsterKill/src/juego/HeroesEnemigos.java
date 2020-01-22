package juego;
public class HeroeEnemigo {
	private Heroe enemigo;
	private byte idEnemigos;

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
