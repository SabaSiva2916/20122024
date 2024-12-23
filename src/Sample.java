
public class Sample {
	public static void main(String[] args) {
		System.out.println("Hello World");
		// Reverse of String
		String str = "PojectClass Dec 2024";
		System.out.println("Before Reverse :" + str.length()+" "+ str);
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
		System.out.println("After reverse :" + output.length()+" "+output);

	}
}
