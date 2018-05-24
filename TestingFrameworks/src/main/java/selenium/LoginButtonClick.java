package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Setup: 
 * 		Download the driver from https://sites.google.com/a/chromium.org/chromedriver/downloads
 * 			chromedriver.exe is to copied and set in below example
 * 
 * References
 * 		https://www.guru99.com/first-webdriver-script.html
 * @author user
 *
 */
public class LoginButtonClick {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", 
        		"D:\\ws\\git\\java\\TestingFrameworks\\src\\main\\resources\\drivers\\chromedriver.exe");
        
        // WebDriver is used to instantiate a new browser loaded with a specific driver
        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.google.com");
        String baseUrl = "http://localhost:9090/index";
        String expectedTitle = "Welcome to Testing Frameworks";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        // username is the name of the html element
        WebElement userNameElement=driver.findElement(By.name("firstname"));
        // Set the value for the element
        userNameElement.sendKeys("vijay");
        WebElement lastNameElement=driver.findElement(By.name("lastname"));
        lastNameElement.sendKeys("p");
        
        // Find the submit button and click
        WebElement submitElement=driver.findElement(By.name("login_submit"));
        lastNameElement.click();
        
        driver.close();
               
    }
}