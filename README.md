Selenium Grid

Is a way to run tests in parallel on multiple machines for faster execution it allocates test to all available nodes/machines
Download drivers for respective web browsers eg Firefox, chrome put them in one folder called grid
Navigate to the selenium web page go to downloads scroll down to the selenium grind section
Download the jar file then open that file and copy the jar file with a name like eg selenium-server-4.27.jar

Past that jar file in the same folder as where you placed the drivers that you had initially downloaded

Go to the terminal and start the hub with the below command obviously you need to cd to the Grid folder first

java -jar selenium-server-4.27.0.jar hub


You can check the status of you hub by entering http://localhost:4444/ui/ on your browser

Now you need to register nodes to the hub your machine can also be registered as a hub (node is a computer)

java -jar selenium-server-4.27.0.jar node --detect-drivers true 


If you refresh your browser you should see that the nodes are registered

IF you want to add nodes on another machine you can connect to the other machine using team viewer
Have the same grid folder on that pc as well with the jar and drivers in and the browsers need to be installed 

jave -jar selenium-server-4.27.0.jar node --detect-drivers true --publish-events tcp://0.0.0.0:4442 --subscribe-events tcp://0.0.0.0:4443


You will get the respective IP addresses from the terminal where you added the first nodes


Then got to your project right click and go to properties =>Java build path=> add external jars =>navigater to the selenium server jar that you downloaded and add it


	@Test
	public void runTestInGridrr() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		//below you prived the ip address to where the hub was started
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.88.253:4444"),caps);
		
		driver.get("https://www.google.com/");
	
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Michael djamba");
		driver.close();

		
	}
