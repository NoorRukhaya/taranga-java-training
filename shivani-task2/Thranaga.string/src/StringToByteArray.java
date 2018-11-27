import java.util.Arrays;


public class StringToByteArray {
	public static void main(String[] args) {
		String str="PANKAJ";
		byte[] byteArr = str.getBytes();
		System.out.println("string to byte array:" + Arrays.toString(byteArr));
	}

}