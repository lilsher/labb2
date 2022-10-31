package moves.Mamoswine;

import labb2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class IceFang extends StatusMove {
	public IceFang(double pow, double acc) {
		super(Type.ICE,pow,acc);
		
		
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		if(Program.chance(0.1)) {
			Effect.freeze(p);
		}
		if(Program.chance(0.1)) {
			Effect.flinch(p);
		}
		
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
}

