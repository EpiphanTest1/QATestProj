


import org.openqa.selenium.WebDriver;



public class WUIAdminLoginTest {

	static String pearlIP = "192.168.0.182";
	static String gridIP = "192.168.0.221";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Open browsers with Admin credentials
		
		try {
			//Create Webdriver instance for FireFox
			WebDriver driver = OpenFireFox.createFireFox();
			//Run Admin login test to device using FireFox Browser
			AdminLoginTest.login(driver, pearlIP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Opera has a known issue opening user profile, so it fails
		/*try {
			//Create Webdriver instance for Opera
			WebDriver driver = OpenChrome.createChrome();
			//Run Admin login test to device using Chrome Browser
			AdminLoginTest.login(driver, pearlIP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Opera currently broken
		try {
			//Create Webdriver instance for Opera
			WebDriver driver = OpenOpera.createOpera();
			//Run Admin login test to device using Opera Browser
			AdminLoginTest.login(driver, pearlIP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	

}
