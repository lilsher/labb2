package pokemons;

import moves.Illumise.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Illumise extends Pokemon{
	
	public Illumise(String name, int level) {
		super(name, level);
		
		super.setType(Type.BUG);
		super.setStats(65, 47, 75, 73, 85, 85);
		
		ThunderWave thunderWave = new ThunderWave(0,90);
		AerialAce aerialAce = new AerialAce(60,100);
		SweetScent sweetScent = new SweetScent(0,100);
		FakeTears fakeTears = new FakeTears(0,100);
		
		
		super.setMove(thunderWave,aerialAce,sweetScent,fakeTears);
	}

}
