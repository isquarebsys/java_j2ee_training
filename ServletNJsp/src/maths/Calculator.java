package maths;


public class Calculator {
//	public int add(int a,int b)throws NumberFormatException{
//		
//		return a+b;
//	}
	public int add(String a,String b)throws Exception{
		try{
			int a1=Integer.parseInt(a);
			int b1=Integer.parseInt(b);
			System.out.println("a1: "+a1+" b1: "+b1);
			return a1+b1;
		}catch(Exception e){
			Exception ce=new Exception("Number Exception in Calculator");
			throw ce;
		}
	}
}	
