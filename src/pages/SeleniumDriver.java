package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

/**
 * Created by sargis on 3/1/15.
 */
public class SeleniumDriver {
	protected static WebDriver driver;
	private boolean acceptNextAlert = true;




	public SeleniumDriver() {
		driver = new FirefoxDriver();
	}


	public static void cleanUp() {
		driver.close();
		driver.quit();
	}
}
