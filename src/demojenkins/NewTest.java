package demojenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test for facebook new123");
	  WebDriver driver=new FirefoxDriver();
	  try{Thread.sleep(3000);}catch(Exception e){}
	  System.out.println("pass 1");
	  driver.get("http://www.facebook.com");
	  System.out.println("pass 2");
	  try{Thread.sleep(3000);}catch(Exception e){}
	  System.out.println(driver.getTitle());
	  try{Thread.sleep(3000);}catch(Exception e){}
	  System.out.println("pass 3");
	  driver.quit();
  }
}
