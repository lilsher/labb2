package moves.Linoone;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove{

	public Slash(double pow, double acc) {
		super(Type.NORMAL,pow,acc);
		
		
	}
	
	@Override
	protected double calcCriticalHit(Pokemon att,Pokemon def) {
		return 1d / 8d;
		
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
}

