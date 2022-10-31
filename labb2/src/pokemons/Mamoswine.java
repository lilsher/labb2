package pokemons;

import moves.Mamoswine.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mamoswine extends Pokemon{
	

	public Mamoswine(String name, int level) {
		super(name, level);
		
		super.setType(Type.ICE,Type.GROUND);
		super.setStats(110, 130, 80, 70, 60, 80);
		
		IceBeam iceBeam = new IceBeam(90,100);
		MudBomb mudBomb = new MudBomb(55,95);
		Amnesia amnesia = new Amnesia(0,0);		
		IceFang iceFang = new IceFang(65,95);
		
		super.setMove(iceBeam,mudBomb,amnesia,iceFang);

	}
}