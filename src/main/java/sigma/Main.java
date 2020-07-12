package sigma;

public class Main {
    
    public static void main(String[] args) {
        
        Twitter twitterService = new Twitter();
        
        twitterService.doLogin("admin", "123");
        
    }
}
