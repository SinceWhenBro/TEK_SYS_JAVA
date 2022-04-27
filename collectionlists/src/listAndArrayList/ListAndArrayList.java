package listAndArrayList;

import java.time.DayOfWeek;

import java.util.*;
public class ListAndArrayList {

	public static void main(String[] args) {
		List<Integer> myNumberList;
		ArrayList<String> myStringList;
		
		
		//linked list
//		LinkedList<Integer> linkOne = new LinkedList<Integer>();
//		System.out.println(linkOne.add(23));
//		linkOne.add(12);
//		linkOne.add(48);
//		System.out.println(linkOne.set(2, 98));
//		System.out.println(linkOne);
//		linkOne.indexOf(98);
		
//		linkOne.size();
		
		//enum maps
		EnumMap<DayOfWeek, Integer> map = new EnumMap<>(DayOfWeek.class);
		map.put(DayOfWeek.FRIDAY, 23);
		System.out.println(map);
		
		//hash maps
		
		HashMap<Integer, String> hash = new HashMap<>();
		hash.containsKey(hash);
		hash.containsValue(hash);
		
		//set -- collection for when you don't want duplicates (ON IDS)
		
		HashSet<String> setHashList = new HashSet<String>();
		setHashList.add("booba");
		setHashList.add("twoa" );
		setHashList.add("threea");
		setHashList.add("foura");
		setHashList.add("booba");
		System.out.println(setHashList);
		
		Iterator<String> itr =setHashList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	

}
