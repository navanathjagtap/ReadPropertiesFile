# ReadPropertiesFile
// Run CMD- mvn -Dusername=AgentHunt -Dpassword=MissionImpossible clean install

# Prerequisites
Java 8 or higher
Maven 3.x



#clone
# Navigate to the project directory:
``` cd CucumberSelenium ```

# Run the tests with Maven:
``` mvn clean test ```

The tests will execute in parallel, and you can view the test results in the target/cucumber-reports directory.

# Customization
To adjust the level of parallelism, edit the testng.xml file and update the thread-count attribute to the desired number of threads:

``` <suite name="Cucumber Parallel Suite" verbose="1" parallel="tests" thread-count="5"> ```
You can also add or remove <test> elements in the testng.xml file to control the number of parallel test executions.

# Contributing
Feel free to submit issues or pull requests if you find any bugs or have suggestions for improvements.

# License
This project is licensed under the MIT License. See the LICENSE file for more information.
