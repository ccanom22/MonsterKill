package juego;

public class HeroesEnemigos {
 private Heroes heroes;
	private byte idEnemigos;

	public HeroEnemigos(Heroes heroes, byte idEnemigos) {
		super();
		this.heroes = heroes;
		this.idEnemigos = idEnemigos;
	}

	private byte getIdEnemigos() {
		return idEnemigos;
	}

	

	private Heroes getHeroes() {
		return heroes;
	}
	
  
}
