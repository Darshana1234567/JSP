import java.util.*;
public class ipl_match {
public static void main(String[] args) {
	//boolean ipl  = new ArrayList<String>() != null;
	ArrayList<String> mi  = new ArrayList<String>();
	ArrayList<String> rcb  = new ArrayList<String>();
	ArrayList<String> ipl  = new ArrayList<String>();

   mi.add("rahul");
   mi.add("yuvraj");
   mi.add("sachin");
   rcb.add("Virat");
   rcb.add("Dhoni");
   rcb.add("Rohit");
   
   ipl.addAll(mi);
  ipl.addAll(rcb);
  
	  System.out.println(ipl);
//	  if(ipl.isEmpty())
//	  {
	  for(int i = 0 ; i<ipl.size();i++)
	  {
		//  if(ipl.get(i)== "rahul")
		  if(ipl.contains("rahul"))
		  ipl.remove(i);
		  
	  }
	  System.out.println(ipl);
//	  }
	  if(ipl.containsAll(rcb))
	  {
		  ipl.removeAll(rcb);
		  System.out.println(ipl);
	  }
//	  }
//	  else 
//		  ipl.clear();
//	  





}
}
