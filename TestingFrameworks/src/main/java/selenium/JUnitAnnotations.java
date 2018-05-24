package selenium;

import org.junit.Assert;
import org.junit.*;

/**
 * https://www.softwaretestinghelp.com/selenium-junit-framework-selenium-tutorial-11/
 * @author user
 *
 */
public class JUnitAnnotations {
	
	/**
	 * This method executes once before running all test. 
	 * The method has to be a static method. 
	 * 
	 * Usage: 
	 * 	Initialization of properties files, databases etc are done in the beforeClass method
	 */
	@BeforeClass
	public static void beforeClassTest(){
	System.out.println("Executed before class method");
	}
	
	/**
	 * @Before annotation is used to run any specific test before each test
	 */
	@Before
	public void beforeTest(){
	System.out.println("Running before test");
	}
	
	@Test
	public void junitTest() {
		System.out.println("Running Junit test");
		Assert.assertEquals(1, 1);
	}
	
	/**
	 * After annotation executes after each test
	 */
	
	@After
	public void afterTest(){
	System.out.println("Running after method");
	}
	
	/**
	 *	Like @BeforeClass, @AfterClass executes once after executing all test methods 
	 */
	@AfterClass
	public static void afterClassTest(){
	System.out.println("Running afterclass method");
	}
	
}
