import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NaturopathyAssistantTest {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "10.0");
    desiredCapabilities.setCapability("app", "D:\\i2bs-drive\\projects\\In-Progress\\Wellbeing-Assistant\\apk-code\\NatAssist-v101.apk");
    desiredCapabilities.setCapability("deviceName", "Android Emulator");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    MobileElement el1 = (MobileElement) driver.findElementById("scires.bots.naturopathy:id/textToSearch");
    el1.sendKeys("mango");
    MobileElement el2 = (MobileElement) driver.findElementById("scires.bots.naturopathy:id/textToSearchButton");
    el2.click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
