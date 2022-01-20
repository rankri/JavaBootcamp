
public class FourSwap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
	
		System.out.println("Before Swapping");
		System.out.println(a + " " + b + " " + c + " " + d);

		a=a+b;
		b=a-b;
		a=a-b;
		
		b=b+c;
		c=b-c;
		b=b-c;
		
		c=c+d;
		d=c-d;
		c=c-d;
		
		System.out.println("after Swapping");
		System.out.println(a + " " + b + " " + c + " " + d);

		
	}

}
