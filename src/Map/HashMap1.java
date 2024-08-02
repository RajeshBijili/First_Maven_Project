package Map;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<String, Integer> values = new HashMap<String, Integer>();

		values.put("Ram", 1);
		values.put("Laxman", 2);
		values.put("Bharat", 3);
		values.put("Kshatrugya", 4);
		values.put("Cartton", 5);

		System.out.println("length of the map is " + values.size());
		System.out.println("Print all values :  "+values);

		if (values.containsKey("Laxman")) {

			Integer value = values.get("Laxman");

			System.out.println("Index value of  Laxman :"+value);
		}
		
		
		values.remove("Cartton");     // removing values
		
		System.out.println(values.containsKey("Cartton"));
		
		System.out.println("Map values after removing value at 5" + values);
		
	}

}
