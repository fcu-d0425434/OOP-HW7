package fcu.iecs.oop.pokemon;

public abstract class Pokemon{

	private String name;

	private PokemonType type;

	private int cp;

	public Pokemon(String name, PokemonType type, int cp) {
		this.name = name;
		this.type = type;
		this.cp = cp;
	}

	public String getname(){
		return this.name;
	}

	public PokemonType gettype(){
		return this.type;
	}

	public int getcp(){
		return this.cp;
		
	}

	public void setcp(){
		cp+=500;
	}
	
	public abstract void attack();
}
