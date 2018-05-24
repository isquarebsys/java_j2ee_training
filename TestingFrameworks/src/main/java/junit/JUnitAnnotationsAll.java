package junit;

import org.junit.Assert;
import org.testng.annotations.Parameters;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;

/**
 * https://www.softwaretestinghelp.com/selenium-junit-framework-selenium-tutorial-11/
 * @author user
 *
 */
public class JUnitAnnotationsAll {
	
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
	
	@Parameters
	public static Collection<Object[]> parameter(){
	Object[][] pData=new Object[2][2];
	pData[0][0]="Tom";
	pData[0][1]=30;
	pData[1][0]="Harry";
	pData[1][1]=40;
	return Arrays.asList(pData);
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
