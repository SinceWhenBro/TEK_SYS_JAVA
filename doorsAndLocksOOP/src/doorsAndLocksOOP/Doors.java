package doorsAndLocksOOP;

import java.util.HashMap;

public class Doors {
	boolean isLocked;
	boolean hasKey;
	HashMap<String,String> doorsAndKeys;
	
	public Doors() {
		Key newKey = Key();
		doorsAndKeys.put(newKey, null);
		boolean isLocked = true;
		boolean hasKey = true;
	}
	
	

}
