package selenium;
import org.openqa.selenium.WebDriver;
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
public class HelloWorld {
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

        // get the actual value of the title from the web page
        actualTitle = driver.getTitle();
        System.out.println("actualTitle: "+actualTitle);

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        //close Fire fox
        driver.close();
               
    }
}