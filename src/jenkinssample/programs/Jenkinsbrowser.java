package jenkinssample.programs;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Jenkinsbrowser {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajashekar.n\\Desktop\\Drivers\\chromedriver.exe");

// Initialize browser
WebDriver driver=new ChromeDriver();

// Open facebook
driver.get("http://www.facebook.com");

// Maximize browser

driver.manage().window().maximize();

}

}
