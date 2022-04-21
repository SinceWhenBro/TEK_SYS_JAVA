package main;

public class Monster {
	private String name;
	private String attack;
	
	public Monster(){
		
	}

	public Monster(String name, String attack) {
		super();
		this.name = name;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", attack=" + attack + "]";
	}
	
	
}
