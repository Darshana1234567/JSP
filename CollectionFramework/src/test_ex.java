import java.util.*;
public class test_ex {
public static void main(String[] args) {
	ArrayList<String> a  = new ArrayList<String>();
	a.add("darshana");
	a.add("rahul");
	a.add("raj");
	a.add(1,"Abhi");
	for(int i = 0; i <a.size();i++)
	{
	System.out.println(a.get(i));
	}
    ArrayList al=new ArrayList(a);
    System.out.println(al);
}
}