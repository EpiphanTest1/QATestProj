

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.opera.core.systems.OperaDriver;
import com.opera.core.systems.OperaProfile;

import org.testng.Assert;

public class OpenOpera {
	
	public static WebDriver createOpera() {
		
		System.out.print("Open Opera Browser!!\n");
		OperaProfile profile = new OperaProfile();  // fresh, random profile
		profile.preferences().set("User Prefs", "Ignore Unrequested Popups", false);

		DesiredCapabilities capabilities = DesiredCapabilities.opera();
		capabilities.setCapability("opera.profile", profile);

		// Create a new instance of the Firefox driver
		WebDriver driver = new OperaDriver(capabilities);
		return driver;
		
	}
	
	public static void openBrowser() {
		
		// TODO Auto-generated method stub
		System.out.print("Open Opera Browser!!\n");
		
	 
		// Create a new instance of the Firefox driver
		WebDriver driver = new OperaDriver();
		 
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String username = "admin";
		String password =  ""; // no password by default
		       
		        
		//Launch the WUI and login as admin(default)
		//Build URL string
		String URL = "http://" + username + ":" + password + "@" + "192.168.0.182/admin";
		driver.get(URL);
		        
		//find add channel
		WebElement channelName = driver.findElement(By.linkText("Add channel"));
		channelName.click();
		        
		//implicit wait for the channel to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       
		        
		//Get the Channel name to ensure that the channel has been created
		String text = driver.findElement(By.xpath("//span[@id='channelname']")).getText();
		        
		//Ensure text channel name is present
		Assert.assertFalse(text.isEmpty(), "Text is empty!");
		        
		System.out.println("New Channel, "+ text + " created successfully!");
		 
		// Close the driver
		driver.quit();
		//driver.close();


	}

}
