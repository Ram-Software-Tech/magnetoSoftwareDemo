package stepDefinations;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.utils.ConfigRead;
import com.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigRead configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigRead();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	
	}

