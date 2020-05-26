public class BrowserFactory {
	
static WebDriver driver;
	
	
	//Opens the browser of choice and returns driver of type WebDriver
	public static  WebDriver startBrowser(String browserName, String url)
	{
		
		if(browserName.equals("FireFox")){
			driver = new FirefoxDriver();
			}
		else if (browserName.equals("ChromeBrowser")){
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("InternetExplorer")){
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		
		return driver;
		
		
	}

}
