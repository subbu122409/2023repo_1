package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\Subbu\\Desktop\\Subbu\\Softwares\\chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver = new ChromeDriver();
		driver.close();

	}

}
