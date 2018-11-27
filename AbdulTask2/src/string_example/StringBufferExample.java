package string_example;

public class StringBufferExample {

	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);
		sb.insert(1,"tpoint");//now original string is changed  
		System.out.println(sb);
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);
		sb.delete(1,3);  
		System.out.println(sb);
		sb.reverse();  
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
