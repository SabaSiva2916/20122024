import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Hello World");
		// Reverse of String
		String str = "PojectClass Dec 2024";
		System.out.println("Before Reverse :" + str.length() + " " + str);
		// split the code based on space
		String[] st = str.split(" ");
		// st[0] = projectclass
		// st[1] = Dec
		// st[2] = 2024
		String output = "";
		for (int i = st.length - 1; i >= 0; i--) {
			String s = st[i];
			output = output + s + " ";
		}

		output = output.trim();
		System.out.println("After reverse :" + output.length() + " " + output);

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
