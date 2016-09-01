package demojenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test for facebook new123");
	  WebDriver driver=new FirefoxDriver();
	  System.out.println("open browser");
	  driver.get("http://www.facebook.com");
	  System.out.println("go to facebook");
	  System.out.println("title"+driver.getTitle());
	  driver.quit();
  }
}
