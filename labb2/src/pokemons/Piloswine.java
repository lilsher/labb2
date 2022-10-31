package pokemons;

import moves.Piloswine.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Piloswine extends Pokemon{

	public Piloswine(String name, int level) {
		super(name, level);
		
		super.setType(Type.ICE,Type.GROUND);
		super.setStats(100, 100, 80, 60, 60, 50);
		
		IceBeam iceBeam = new IceBeam(90,100);
		MudBomb mudBomb = new MudBomb(55,95);
		Amnesia amnesia = new Amnesia(0,0);		
		super.setMove(iceBeam,mudBomb,amnesia);
	}
}