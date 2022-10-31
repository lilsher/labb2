package labb2;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {

	//https://pokemondb.net/pokedex/illumise
	//https://pokemondb.net/pokedex/zigzagoon
	//https://pokemondb.net/pokedex/linoone
	//https://pokemondb.net/pokedex/swinub
	//https://pokemondb.net/pokedex/piloswine
	//https://pokemondb.net/pokedex/mamoswine
	
	public static void main(String[] args) {
		Battle b = new Battle();
		
		Illumise p1 = new Illumise("Cocunut",1);
		Zigzagoon p2 = new Zigzagoon("BRUSH",1);
		Linoone p3 = new Linoone("UFF",1);
		Swinub p4 = new Swinub("OFHFH",1);
		Piloswine p5 = new Piloswine("hohoho",1);
		Mamoswine p6 = new Mamoswine("tototo",1);
		b.addAlly(p1);
		b.addAlly(p3);
		b.addAlly(p6);
		b.addFoe(p2);
		b.addFoe(p4);
		b.addFoe(p5);
		b.go();

	}
	
	public static boolean chance(double d) {
		return d > Math.random();
	}

}
