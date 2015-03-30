

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AdminLoginTest {

	public static void login(WebDriver driver,String deviceIP) {
		// TODO Auto-generated method stub
		String username = "admin";
        String password =  ""; // no password by default
       
        
        //Launch the WUI and login as admin(default)
        //Build URL string
        String URL = "http://" + username + ":" + password + "@" + deviceIP +"/admin";
        driver.get(URL);
        
      //implicit wait for the channel to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       // (//*[contains(., 'Apply')])[last()]
        //Get the Channel name to ensure that the channel has been created
        String text = driver.findElement(By.xpath("/html/body/div/div[1]/span")).getText();
       // String text = driver.findElement(By.xpath("//span[@id='channelname']")).getText();
        
        //Ensure text channel name is present
        Assert.assertFalse(text.isEmpty(), "Text is empty!");
        Assert.assertEquals(text, "Administrator");
        
        
        
        System.out.println("Logged in as, "+ text + " successfully!\n");
        // Close the driver
        driver.quit();
       // driver.close();
	}

}
