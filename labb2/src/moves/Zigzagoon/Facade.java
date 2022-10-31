package moves.Zigzagoon;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove{
	
	public Facade(double pow, double acc) {
		super(Type.NORMAL,pow,acc);
		
		
	}
	
	@Override
	protected void applyOppDamage(Pokemon def,double damage) {
		super.applyOppDamage(def, damage);
		super.applyOppDamage(def, damage);
		
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


