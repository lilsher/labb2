package moves.Illumise;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends StatusMove{
	
	public AerialAce(double pow, double acc) {
		super(Type.FLYING,pow,acc);
		
		
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
	}
	
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		super.applySelfEffects(p);
	}
	
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
}
