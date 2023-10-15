package Singleton;

public class AppConfig
{

    private static AppConfig instance;

    private String appName;
    private int Maxconnections; //Maximo de conexões com o servidor

    private AppConfig()
    {
        appName = "Meu app";
        Maxconnections = 5;
    }
    public static AppConfig getInstance()
    {
        if (instance == null)
        {
            instance = new AppConfig();
        }

        return instance;
    }
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getMaxconnections() {
        return Maxconnections;
    }

    public void setMaxconnections(int maxconnections) {
        Maxconnections = maxconnections;
    }
    
    
}
