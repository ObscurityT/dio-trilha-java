package Singleton;

public class Main {
    public static void main(String[] args) {
        
        AppConfig config = AppConfig.getInstance();
        config.setAppName("NovoApp");
    }
}
