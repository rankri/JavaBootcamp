
public class TwoSwap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 30;
	
		System.out.println("Before Swapping");
		System.out.println(a + " " + b + " " + c);

		a = a+b+c;
		b = a-(b+c);
		c = a-(b+c);
		a = a-(b+c);
			
		
		System.out.println("after Swapping");
		System.out.println(a + " " + b + " " + c);
		
	}

}
