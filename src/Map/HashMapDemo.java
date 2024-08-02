package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMapDemo {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(5, "Java");
		m.put(1, "C++");
		m.put(15, "C");
		m.put(12, "SQL");
		m.put(9, "Selenium");
		m.put(15, "Hadoop");
		
		System.out.println(m);
		
		String s1 = (String) m.get(9);
		System.out.println(s1);
		
	Set<Integer> keys = m.keySet();
	System.out.println(keys);
	
	TreeSet<Integer> treeset = new TreeSet<Integer>(keys);
	System.out.println(treeset);
	
	Iterator<Integer> itr = keys.iterator();
	while(itr.hasNext())
	{
		int keyvalue = itr.next();
		System.out.println( keyvalue);
				
		
		String val = (String) m.get(keyvalue);
		System.out.println(val);
		
	}
	
	
	
	}

}
