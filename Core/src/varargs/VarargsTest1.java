package varargs;

public class VarargsTest1 {
	// A method that takes variable number of intger
	// arguments.
	static void numArray(int... a) {
		System.out.println("Number of arguments: " + a.length);

		// using for each loop to display contents of a
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}

	static void stringAndNumbers(String str, int ...a)
    {
        System.out.println("String: " + str);
        System.out.println("Number of arguments is: "+ a.length);
 
        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i + " ");
 
        System.out.println();
    }
	
	public static void main(String[] args) {
//		numArray(100); // one parameter
//		numArray(1, 2, 3, 4); // four parameters
//		numArray(); // no parameter
//		
//		stringAndNumbers("Test",1);
//		stringAndNumbers("Test",1,2);
		calculateTotal(89,90,95);
	}
	
	public static int calculateTotal(int... marks) {
		int totalMarks=0;
		for (int i : marks) {
			totalMarks=totalMarks+i;
		}
		System.out.println(totalMarks);
		return totalMarks;
	}

}
