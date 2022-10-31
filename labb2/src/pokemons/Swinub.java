package pokemons;

import moves.Swinub.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon{
	
	public Swinub(String name, int level) {
		super(name, level);
		
		super.setType(Type.ICE,Type.GROUND);
		super.setStats(38, 30, 41, 30, 41, 60);

		IceBeam iceBeam = new IceBeam(90,100);
		MudBomb mudBomb = new MudBomb(55,95);
		
		super.setMove(iceBeam,mudBomb);
		
	}
}
