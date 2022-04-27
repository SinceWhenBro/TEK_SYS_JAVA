package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main extends Monster {

	public static void main(String[] args) {

		FireMonster fire = new FireMonster("VOLCANRANIRIX", "NAE NAE", "PLANETARY EVISCERATION", "FIREBOI");
		WaterMonster water = new WaterMonster("HYROXOLOCKOLOCKIKLEES", "WATER WHIP", "ETERNAL DROWN DAMNATION",
				"WATERBOI");
		SugondeseMonster sugondese = new SugondeseMonster("SUGON DESE", "DISRESPECT", "UNIVERSAL REANIMATION",
				"YO GIRL's");
		StoneMonster stone = new StoneMonster("STODECAHEDRON", "STOCKTON SLAP", "NANO-NANO SMUSH", "ROCKBOI");

//		System.out.println(fire.getSpecialAttack());
//		System.out.println(water.getSpecialAttack());
//		System.out.println(sugondese.getSpecialAttack());
//		System.out.println(stone.getSpecialAttack());

		System.out.println(fire);
		System.out.println(water);
		System.out.println(sugondese);
		System.out.println(stone);
		String fileName = "test.txt";
		File myFile = new File(fileName);

		try {
			FileReader fr = new FileReader(myFile);
			System.out.println("------------------------");
			System.out.println(fire);
			System.out.println("------------------------");
			System.out.println(water);
			System.out.println("------------------------");
			System.out.println(stone);
			System.out.println("------------------------");
			System.out.println(sugondese);
		} catch (FileNotFoundException err) {
			System.out.println(err);
		}

	}

}
