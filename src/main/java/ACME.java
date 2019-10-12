import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ACME {
	@Test
	public void pooma() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drive.get("https://acme-test.uipath.com/account/login");
		drive.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		drive.findElementById("password").sendKeys("leaf@12");
		drive.findElementById("buttonLogin").click();
		drive.findElementByXPath("//button[text()[normalize-space()='Vendors']]").click();
		drive.findElementByLinkText("Search for Vendor").click();
		drive.findElementByName("vendorName").sendKeys("Blue Lagoon");
		drive.findElementById("buttonSearch").click();
		System.out.println(drive.findElementByXPath("(//th[text()='Country']/following::td[text()='Blue Lagoon']/following-sibling::td )[4]").getText());
		drive.findElementByLinkText("Log Out").click();
		drive.close();
	}
}
