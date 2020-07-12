package sigma;

import org.openqa.selenium.chrome.ChromeDriver;

public class Configurations {
    
    
    ChromeDriver getChromeDriver() {
       System.setProperty("webdriver.chrome.driver","/home/sigma/abhijeet/programme files/linux/chromedriver");  
       ChromeDriver driver = new ChromeDriver();
        return driver;
    }
}
