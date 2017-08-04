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
		
		int s11=2;
		System.out.println("S1: "+s11);
		s11=3;
		System.out.println("S1: "+s11);
		String s2="three";
		String s3=s11+s2;
		System.out.println("S3: "+s3);		
		
		StringBuffer sb1=new StringBuffer();
		sb1.append(s11);
		System.out.println("String Buffer: "+sb.toString());
		sb1.append(s2);
		System.out.println("String Buffer: "+sb.toString());
		sb1.append(s11);
		System.out.println("String buffer: "+sb.toString());
		System.out.println("Index of 3: "+sb.indexOf("3"));
		
		String withUnderScore="Akash_V";
		String[] splits=withUnderScore.split("_");
		for(int i=0;i<splits.length;i++){
			System.out.println("Split strings: "+splits[i]);
		}		
		
	}

}
