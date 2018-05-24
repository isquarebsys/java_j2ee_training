package testng;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Before running this class, install TestNG plugin in Eclipse Marketplace
 * @author user
 *
 */
public class HelloWorldNGTest {
	@Test()
	public void testEmailGenerator() {
		HelloWorldNG obj = new HelloWorldNG();
		String email = obj.generate();
		Assert.assertNotNull(email);
		Assert.assertEquals(email, "feedback@yoursite.com");
	}
}
