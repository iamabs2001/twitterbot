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
    
    void doTweet(String msg) {
        WebElement twitterBtn =  driver.findElement(By.xpath(".//button[@class='tweet-action EdgeButton EdgeButton--primary js-tweet-btn']"));
        WebElement tweetMsg =  driver.findElement(By.id("tweet-box-home-timeline"));
        tweetMsg.click();
        tweetMsg.sendKeys(msg);
//        twitterBtn.click();
        
    }
    
    void doLogout() {
        WebElement logout = driver.findElement(By.id("signout-button"));
        logout.click();    
    }
    
}
