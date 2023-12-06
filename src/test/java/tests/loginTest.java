package tests;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class loginTest {

    @Test
    public void testLogin() throws IOException {

        // Load properties file
        Properties prop = new Properties();
        prop.load(loginTest.class.getClassLoader().getResourceAsStream("MyProject.properties"));

        // Get username and password from properties file
        String uName = prop.getProperty("uName"); // AgentHunt
        String pwd = prop.getProperty("Pwd"); // MissionImpossible

        System.out.println("Username Value is ==> " + uName);
        System.out.println("Password Value is ==> " + pwd);

        // Run CMD- mvn -Dusername=AgentHunt -Dpassword=MissionImpossible clean install

        // Additional code for WebDriver setup and actions would go here

        // Close the WebDriver
        // driver.quit();
    }
}
