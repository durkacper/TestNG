import java.io.*;
import java.util.Properties;

public class GlobalValuesDrive {

    public static void main(String[] args) throws IOException {

        //create new Properties object
        Properties properties = new Properties();

        //create new file object with path to our "data.properties" file
        FileInputStream file = new FileInputStream("D:\\Java\\UDEMY_Selenium WebDriver Java\\TestNG\\data.properties");
        //load file to properties in "read mode"
        properties.load(file);

        //just get properties and print them out
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("url"));

        properties.setProperty("browser", "firefox");

        //update changed values in "data.properties" file (new browser name, changed in previous step from chrome to firefox)
        FileOutputStream fileOutput = new FileOutputStream("D:\\Java\\UDEMY_Selenium WebDriver Java\\TestNG\\data.properties");
        properties.store(fileOutput, null);

    }
}
