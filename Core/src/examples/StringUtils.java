package examples;

public class StringUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Name";
		String s2="Vijay";
		StringBuffer sb=new StringBuffer();
		sb.append("Name");
		sb.append("\t");
		sb.append("Id");
		sb.append("\n");
		sb.append("Vijay");
		sb.append("\t");
		sb.append("1314");
		sb.append("\n");
		sb.append("Ajay");
		sb.append("\t");
		sb.append("123414");
		System.out.println(sb.toString());
		StringBuilder sbuilder=new StringBuilder();
		sbuilder.append("Hello");
		
	}

}
