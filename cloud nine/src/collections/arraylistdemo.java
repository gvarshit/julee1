package collections;
import java.util.ArrayList;


public class arraylistdemo {
	public static void main (String[]args) {
		ArrayList <String> cities = new ArrayList<>();
		cities.add("london");
		cities.add("paris");
		cities.add("banglore");
		cities.add("hyderabad");
		cities.add("chennai");
		for (String t: cities) {
			System.out.println(t);
		}
		System.out.println("total no of items in arraylist = " + cities.size());
		System.out.println("item at index 1" + cities.get(1));
		System.out.println("index of paris" + cities.indexOf("paris"));
		
		
		
	}

}
