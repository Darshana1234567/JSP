import java.util.*;
public class Test 
{
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
	//  ArrayList<Object> al=new ArrayList<Object>();

		al.add("Java");
		al.add(33);
		al.add(44.4);
		al.add('e');
		al.add(true);
		System.out.println(al);
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println();
		for(Object o:al)
		{
			System.out.println(o);
		}
		System.out.println();
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
