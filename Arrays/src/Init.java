public class Init {
public static void main(String[] args) {
	
	int [] a = {1,2,3,45,5};
	int n =a.length;
	for (int i=0;i<n;i++)
	{
		System.err.println(a[i]);
	}
	
	// second way of initialization
	int[] arr;
	arr = new int[5];
	arr[0]= 5;
	arr[1]= 6;
	arr[3]=0;
	System.out.println("second");
	for (int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}}
