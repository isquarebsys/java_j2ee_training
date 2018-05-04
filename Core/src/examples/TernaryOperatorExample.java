package examples;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=20;
		boolean boolean1=true;
		int min=(boolean1)?b:a;
		System.out.println(min);		
		System.out.println(a<b && a++<c);
		System.out.println(a);
		System.out.println(a<b & a++<c);
		System.out.println(a);

	}

}
