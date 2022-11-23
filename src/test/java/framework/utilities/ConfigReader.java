package framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * bu classın amacı configuration.properties dosyasını okuyup, key valueleri getirmektir
 *
 * */
public class ConfigReader {
    static Properties properties;

    static {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //configReader class'ına ulaşıp bu class'taki işlemleri yapmamızı sağlyacak method
    public static String getProperty(String key) {
        String value = properties.getProperty(key);
        return value;
    }
}
