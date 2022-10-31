package pokemons;

import moves.Linoone.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Linoone extends Pokemon{
	
	public Linoone(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		super.setStats(78, 70, 61, 50, 61, 100);
		
		Facade facade = new Facade(70,100);
		Rest rest = new Rest(0,100);
		Confide confide = new Confide(0,100);
		Slash slash = new Slash(70,100);
		
		super.setMove(facade,rest,confide,slash);
	}
}

