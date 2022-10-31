package pokemons;

import moves.Zigzagoon.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zigzagoon extends Pokemon{ 

		public Zigzagoon(String name, int level) {
			super(name, level);
			
			super.setType(Type.NORMAL);
			super.setStats(38, 30, 41, 30, 41, 60);
			
			Facade facade = new Facade(70,100);
			Rest rest = new Rest(0,100);
			Confide confide = new Confide(0,100);
			
			super.setMove(facade,rest,confide);
		}
	}

