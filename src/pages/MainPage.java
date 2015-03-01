package pages;

import org.openqa.selenium.*;


/**
 * Created by sargis on 3/1/15.
 */
public class MainPage  extends SeleniumDriver {


	public void openIMDB() {
		driver.get("http://www.imdb.com/");
	}


	public void searchAnArtist (String artistName) {
		driver.findElement(By.id("navbar-query")).clear();
		driver.findElement(By.id("navbar-query")).sendKeys(artistName);
		driver.findElement(By.id("navbar-submit-button")).click();

	}

	public void clickOnItemFromSearch(String artistName) {
		driver.findElement(By.linkText(artistName)).click();
	}

	public Boolean isArtisparticipatedInMovie(String movieName) {
		try {
			driver.findElement(By.linkText(movieName));
			return true;
		}
		catch (NoSuchElementException e) {
			return false;
		}
	}
}
