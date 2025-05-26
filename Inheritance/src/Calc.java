public class Calc {

	int add(int n1,int n2) {
		return n1+n2;
	}
	int sub(int n1 , int n2)
		{
			return n1-n2;
		}
}
class advcalc extends Calc {

	int multi(int n1,int n2) 
	{
		return n1*n2;
	}
	int power(int n1,int n2) {
		//return Math.pow(n1,n2);
		return n1*n2;
	}
	
	public static void main(String[] args) {
		advcalc a1 = new advcalc();
		int aa = a1.add(2,3);
		int bb = a1.sub(5, 4);
		int m = a1.multi(12, 34);
		int p = a1.power(1,2);
		System.out.println("add"+ aa +"sub" + bb + " " +m + " " +p);
		
		
	}
}
