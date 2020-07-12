package sigma;

import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        
        Twitter twitterService = new Twitter();
        
        twitterService.doLogin("admin", "123");
        
    }
}
