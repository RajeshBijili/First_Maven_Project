package Map;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		System.out.println("HashCode is: "+h.hashCode());
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("E");
		h.add(10);
		h.add(null);
		System.out.println(h.add("A"));
		System.out.println("Hashset is: "+h);
		System.out.println("HashSet size is: "+h.size());
		
		Iterator it = h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
