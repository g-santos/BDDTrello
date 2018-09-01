package util;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hook {
    protected static WebDriver driver;

    @Before
	public void before(Scenario scenario) {
        System.out.println(scenario.getName());
       /* System.out.println("Abrindo o browser\n\n");
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver( );
        driver.manage().window().maximize();*/
    }

	@After
	public void after() {
		/*System.out.println("Quit browser\n\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.quit();*/
	}

	/*public static WebDriver getDriver(){
        return driver;*/
    }
