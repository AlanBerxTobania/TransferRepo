# README #

### How do I run Cucumber scenario's? ###

### Browser Drivers

 * The framework uses the following library to automatically download the latest version of ChromeDriver and GeckoDriver (FireFox):
  https://github.com/bonigarcia/webdrivermanager

#### JUnit

 * Add -Dspring.profiles.active={browser} where browser is chrome or firefox


#### Maven
 * mvn clean install -Dspring.profiles.active={browser} where browser is chrome or firefox

