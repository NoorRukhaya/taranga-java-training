package string_example;
import java.util.Arrays;
public class JavaStringSplit {
	
	public static void main(String args[]) {
		String line = "I am a java developer";

		String[] words = line.split(" ");

		String[] twoWords = line.split(" ", 2);
		
		String[] threewords = line.split(" ",4);

		System.out.println("String split with delimiter: " + Arrays.toString(words));

		System.out.println("String split into two: " + Arrays.toString(twoWords));

		System.out.println("String split into three:"+Arrays.toString(threewords));
		// split string delimited with special characters
		String wordsWithNumbers = "I|am|a|java|developer";

		String[] numbers = wordsWithNumbers.split("\\|");

		System.out.println("String split with special character: " + Arrays.toString(numbers));

	}
}
