package regex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample1 {
	public static void main(String[] args) {
		HashMap sourceMap = new HashMap();
		HashMap targetMap = new HashMap();
		String sourcePatternString = "ADT AR AEPSLA AA20D4AR  FCN 1  PU 1" + "\n"+
									"MIN 150.00   ARS  FEE APP  4  .064308 USD "+"\n"
									+ "MAX 200.00   ARS  FEE APP  4  .064308 USD " + "REFUNDABLE (N)".toString();

		String targetPatternStringForPTC = "PTC notNeeded notNeeded notNeeded  notNeeded  notNeeded notNeeded notNeeded"+"\n"+
									"MIN 150.00   notNeeded  notNeeded notNeeded  notNeeded  notNeeded notNeeded "+"\n"													
											;

		Pattern sourcePattern = Pattern.compile("\\w+");

		Matcher matcher = sourcePattern.matcher(sourcePatternString);
		// check all occurance
		int i = 0;
		while (matcher.find()) {
			String individualWords = matcher.group();
//			System.out.println("Source Matcher: " + matcher.group());
			sourceMap.put(i + "", individualWords);
			i++;
		}

		Iterator sourceMapIterator=sourceMap.keySet().iterator();
		while(sourceMapIterator.hasNext()){
			String key=(String)sourceMapIterator.next();
			//UNCOMMENT the following line if you need to debug patterns
			//System.out.println("Source Key: "+ key+ " Value: "+sourceMap.get(key));
		}
		
		Pattern targetPattern = Pattern.compile("\\w+");
		Matcher targetMatcher = targetPattern.matcher(targetPatternStringForPTC);
		// check all occurance
		int j = 0;
		while (targetMatcher.find()) {

			String individualWords = targetMatcher.group();
			System.out.println("Target Matcher: " + targetMatcher.group());
			String targetString = targetMatcher.group();
			targetMap.put(j + "", targetString);
			if (targetString.equals("PTC")) {
				String sourceString = (String) sourceMap.get(j + "".trim());
				System.out.println("sourceString: " + sourceString);
			}
			if (targetString.equals("MIN")) {
				String sourceString = (String) sourceMap.get(j+1 + "".trim());
				System.out.println("sourceString: " + sourceString);
			}
			if (targetString.equals("MAX")) {
				String sourceString = (String) sourceMap.get(j + "".trim());
				System.out.println("sourceString: " + sourceString);
			} else {
				// System.out.println("Source string NOT found");
			}
			j++;
		}
		
		Iterator targetMapIterator=sourceMap.keySet().iterator();
		while(targetMapIterator.hasNext()){
			String key=(String)targetMapIterator.next();
			// UNCOMMENT the following line if you need to debug patterns
			//System.out.println("Target Key: "+ key+ " Value: "+targetMap.get(key));
		}
	}
}

