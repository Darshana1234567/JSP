
public class Dept {
    String name ; 
    int  deptid;
	public Dept(String n , int d) {
		name = n;
		deptid = d;
	}

	public static void main(String[] args) {
    Dept d1 = new Dept("IT", 1234);
   System.out.println(d1.name+"  "+ d1.deptid);
   Dept d2 = new Dept("ECE", 1333);
   System.out.println(d2.name+"  "+ d2.deptid);
	}

}
