package main;

public class SugondeseMonster extends Monster {
	private String specialAttack;
	private String monsterType;
	
	public SugondeseMonster() {
		
	}

	public SugondeseMonster(String name, String attack, String specialAttack, String monsterType) {
		super(name, attack);
		this.specialAttack = specialAttack;
		this.monsterType = monsterType;
	}

	public String getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(String specialAttack) {
		this.specialAttack = specialAttack;
	}

	public String getMonsterType() {
		return monsterType;
	}

	public void setMonsterHype(String monsterType) {
		this.monsterType = monsterType;
	}

	@Override
	public String toString() {
		return getName() + " is type --" + getMonsterType() + ". Their base attack is " + getAttack() + " and their special attack is " + getSpecialAttack() + "!";
	}
	
	
	
}
