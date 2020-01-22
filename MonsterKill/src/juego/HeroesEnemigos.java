package juego;

public class HeroesEnemigos {
 private Heroes heroes;
	private byte idEnemigos;

	public HeroEnemigos(Heroes heroes, byte idEnemigos) {
		super();
		this.heroes = heroes;
		this.idEnemigos = idEnemigos;
	}

	public byte getIdEnemigos() {
		return idEnemigos;
	}

	

	public Heroes getHeroes() {
		return heroes;
	}
	
  
}
