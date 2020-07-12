package sigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
    
    String BASE_URL = "https://twitter.com";
    Configurations config = new Configurations();
    ChromeDriver driver = config.getChromeDriver();
    
    void doLogin(String username, String password) {
        driver.navigate().to(BASE_URL+"/login");
        driver.manage().window().maximize();
        
        WebElement usernameField = driver.findElement(By.name("session[username_or_email]"));
        usernameField.sendKeys(username);
        
        WebElement passwordField = driver.findElement(By.name("session[password]"));
        passwordField.sendKeys(password);
        
        passwordField.submit();
        
    }
    
}
