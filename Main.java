
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int c = 30;
	
		System.out.println("Before Swapping");
		System.out.println(a + " " + b + " " + c);

		int d = 0;
		d = a;
		a = b;
		b = c;
		c = d;
		
		System.out.println("after Swapping");
		System.out.println(a + " " + b + " " + c);

	}

}
