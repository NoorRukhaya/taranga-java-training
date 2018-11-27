package collection_example;
import java.util.*;
public class Iterator_ex {
	public static void main(String arg[])
	{
	
		ArrayList list=new ArrayList();
		
		list.add("Suraj"); //Adding String objects
		list.add("Kiran");
		list.add("Gagan");
		list.add(890);  //=> 890= new Integer(890)
		list.add(788);
		list.add(89.7f);
		
		Iterator iterator=list.iterator();
		
		while(iterator.hasNext())
		{
			Object ob=iterator.next();
			
			if(ob instanceof String)
			{
				String str=(String)ob;
				System.out.println(str);
				
				if(str.equals("Kiran"))
					iterator.remove();
				
			}
			else if(ob instanceof Integer)
			{
				Integer intr=(Integer)ob;
				System.out.println(intr);
			}
			else
			{
				Float f=(Float)ob;
				System.out.println(f);
			}
		}
		
		System.out.println(list);
	}

}
