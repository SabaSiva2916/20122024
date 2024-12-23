import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Hello World");
		// creating a List, Set , map
		List<String> li = new ArrayList<String>();
		// Adding value to list
		li.add("Java");
		li.add("Selenium");
		li.add("Python");
		li.add("C#");
		li.add("Scalar");

		// Creating Set

		Set<Integer> si = new LinkedHashSet<>();
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(40);
		si.add(50);

		// Creating Map, Key -- String, value -- integer
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Java", 1);
		map.put("Selenium", 2);
		map.put("Python", 3);
		map.put("C#", 4);

	}
}
