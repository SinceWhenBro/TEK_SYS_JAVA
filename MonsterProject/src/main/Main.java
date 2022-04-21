package main;

public class Main extends Monster {

	public static void main(String[] args) {
		
		FireMonster fire = new FireMonster("VOLCANRANIRIX","NAE NAE","PLANETARY EVISCERATION","FIREBOI");
		WaterMonster water = new WaterMonster("HYROXOLOCKOLOCKIKLEES","WATER WHIP","ETERNAL DROWN DAMNATION","WATERBOI");
		SugondeseMonster sugondese = new SugondeseMonster("SUGON DESE","DISRESPECT","UNIVERSAL REANIMATION","YO GIRL's");
		StoneMonster stone = new StoneMonster("STODECAHEDRON","STOCKTON SLAP","NANO-NANO SMUSH","ROCKBOI");
		
		System.out.println(fire.getSpecialAttack());
		System.out.println(water.getSpecialAttack());
		System.out.println(sugondese.getSpecialAttack());
		System.out.println(stone.getSpecialAttack());
		
		System.out.println(fire);
		System.out.println(water);
		System.out.println(sugondese);
		System.out.println(stone);

	}

}
