
import org.junit.*;
import static org.junit.Assert.*;
import pages.*;

public class ArtistParticipatedInMovieTest {
	String artistName;
	String movieName;

	@Before
	public void setUp() throws Exception {
		artistName = "Jennifer Lopez";
		movieName = "Home";

	}


	@Test
	public void artistInMovie() {
		MainPage mainPage = new MainPage();
		mainPage.openIMDB();
		mainPage.searchAnArtist(artistName);
		mainPage.clickOnItemFromSearch(artistName);

		assertTrue("The artist is not participated in this moive!", mainPage.isArtisparticipatedInMovie(movieName));
	}

	@After
	public void tearDown() throws Exception {
		SeleniumDriver.cleanUp();
	}
}
