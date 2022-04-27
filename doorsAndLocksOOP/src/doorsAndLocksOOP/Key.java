package doorsAndLocksOOP;

import java.util.UUID;

public class Key implements Cloneable{
	private UUID key = UUID.randomUUID();
	public Key() {
		key = UUID.randomUUID();
	}
	
	public Key(Key original) { 
		key = original.key;
	}
	
	public String toString() {
		return key.toString();
	}

}
