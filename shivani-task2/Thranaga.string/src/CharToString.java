
public class CharToString {
	public static void main(String[] args) {
		char c = 'X';
		String str = String.valueOf(c);
		String str1 = Character.toString(c);
		System.out.println(c + " char converted to String using String.valueOf(char c) = " + str);
		System.out.println(c + " char converted to String using Character.toString(char c) = " + str1);

	}



}
