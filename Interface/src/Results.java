public class Results implements IAdvanceCalc {

	@Override
	public void sub() {
		System.out.println("Substraction");
		
	}

	@Override
	public void percentage() {
		System.out.println("Percentage");
	}

	@Override
	public void add() {
         System.out.println("Addition");		
	}
	
	public static void main(String[] args) {
		Results r = new Results();
		r.sub();
		r.percentage();
		r.add();
	}
	
}
