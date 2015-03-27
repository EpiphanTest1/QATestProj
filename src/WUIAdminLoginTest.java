


import org.openqa.selenium.WebDriver;

public class WUIAdminLoginTest {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Open browsers with Admin credentials
		
		try {
			WebDriver driver = OpenFireFox.createFireFox();
			AdminLoginTest.login(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			WebDriver driver = OpenChrome.createChrome();
			AdminLoginTest.login(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Opera currently broken
		//	OpenOpera.openBrowser();
		
		
		
	}

	

}
