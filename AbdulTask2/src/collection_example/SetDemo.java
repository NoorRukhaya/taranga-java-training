package collection_example;

public class SetDemo {
	public static void main(String arg[])
	{
		HashSet hashSet=new HashSet();
		
		hashSet.add("Sudhir");
		hashSet.add("Vinod");
		hashSet.add("Fareed");
		hashSet.add("Mohit");
	
		hashSet.add("Fareed"); //Duplicate Values
		
		System.out.println(hashSet);
		
		
	}
}
