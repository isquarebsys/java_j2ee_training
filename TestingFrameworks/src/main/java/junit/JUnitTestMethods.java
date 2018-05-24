package junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * https://www.softwaretestinghelp.com/selenium-junit-framework-selenium-tutorial-11/
 * 
 * @author user
 *
 */
public class JUnitTestMethods {
	
	@Test
	public void junitTest() {
		Assert.assertEquals(1, 1);
		Assert.assertTrue("Both the strings are not equal", ("HelloWorld").equals("HelloWorld"));
	}
	
}
