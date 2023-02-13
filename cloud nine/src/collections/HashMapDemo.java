package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	

	public static void main(String[] args) {
		HashMap<String,Integer> td = new HashMap<>();
		td.put("Ram",123456 );
		td.put("john", 234567);
		td.put("tim",456789);
		// TODO Auto-generated method stub
		for(Map.Entry m : td.entrySet() ) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}

	}

}
