package examples;

public class ReverseString {
	
	public char[] reverseStringWords(String stringToReverse){
		String str[] = stringToReverse.split(" ");
		String finalStr = "";
		for (int i = str.length - 1; i >= 0; i--) {
			finalStr += str[i] + " ";
		}
		System.out.println("Reversed Words: "+finalStr);
		char[] charArrayToReturn=finalStr.toCharArray();
		for(int i=0;i<charArrayToReturn.length;i++){
			char charOfIndex=charArrayToReturn[i];
//			System.out.println("charOfIndex: "+i+":"+charOfIndex);
		}
		return charArrayToReturn;
	}
	public static void main(String[] args) {
		ReverseString reverseWords=new ReverseString();
		reverseWords.reverseStringWords("Hi, This is Vijay");
	}
}
