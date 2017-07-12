package util;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Vijay");
		System.out.println("S1: "+s1);
		StringBuffer sb=new StringBuffer();
		sb.append("1");
		System.out.println("SB is "+sb.toString());
		sb.append(s1);
		System.out.println("SB is "+sb.toString());
		sb.delete(0, sb.length());
		System.out.println("SB is "+sb.toString());
	}

}
