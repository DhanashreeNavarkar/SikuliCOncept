package co.sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class YoutubeVideosTest {

	public static void main(String[] args) throws FindFailed {
		
		/*Sikuli
		 * automate using images
		 * no api to launch browser and url - need to use seeniu
		 * can automate flash objects - youtube videos
		 * desktop applications automation
		 * it captures images - save screenshots
		 */
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setups\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=SG_sIo3qFH8");
		
		//create object of screen class
		Screen s = new Screen();
		
		Pattern play = new Pattern("Play.PNG");
		s.wait(play,2000);
		s.click();
		s.click();
		
		Pattern pause = new Pattern("Pause.PNG");
		s.wait(pause,2000);
		s.click();
	
		Pattern setting = new Pattern("Settings.PNG");
		s.wait(setting,2000);
		s.click();
		
		driver.quit();
	

	}

}
