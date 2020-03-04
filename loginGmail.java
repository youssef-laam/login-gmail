package demoScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class loginGmail {
	
	public LoginGmail() {
		
	}
		
	public static void sendMail() throws Exception {
		Screen screen = new Screen();
		Pattern image1 = new Pattern("C:\\Users\\Administrator\\images\\gmail-logo.PNG");
		Pattern image2 = new Pattern("C:\\Users\\Administrator\\images\\connexion.PNG");
		Pattern image3 = new Pattern("C:\\Users\\Administrator\\images\\uname.PNG");
		Pattern image4 = new Pattern("C:\\Users\\Administrator\\images\\next.PNG");
		Pattern image5 = new Pattern("C:\\Users\\Administrator\\images\\pass.PNG");
		Pattern image6 = new Pattern("C:\\Users\\Administrator\\images\\sign.PNG");
		Pattern image7 = new Pattern("C:\\Users\\Administrator\\images\\new-mess.PNG");
		Pattern image8 = new Pattern("C:\\Users\\Administrator\\images\\des.PNG");
		Pattern image9 = new Pattern("C:\\Users\\Administrator\\images\\objet.PNG");
		Pattern image10 = new Pattern("C:\\Users\\Administrator\\images\\envoyer.PNG");
		Pattern image11 = new Pattern("C:\\Users\\Administrator\\images\\file-select.PNG");
     	int i = 0 ;
     	String message = "voila le rapport ";
		while (i<1) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\setup\\Exe file\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.com");
			screen.click(image1);
			Thread.sleep(2000, 0);
			screen.click(image2);
			Thread.sleep(2000, 0);
			screen.type(image3, "laamimyous@eisti.eu");
			screen.click(image4);
			Thread.sleep(2000, 0);
			screen.type(image5, "ohci9Xochooy");
			screen.click(image6);
			Thread.sleep(2000, 0);
			screen.click(image7);
			Thread.sleep(2000, 0);
			screen.type(image8, "rimysarl@gmail.com	");
			screen.type(image9, "rapport 	"+ message);
			screen.click(image11);
			//driver.findElement(By.id(":pc")).click();
			Thread.sleep(2000, 0);
			Runtime.getRuntime().exec("H:\\Documents\\FileUploadScript.exe");
			Thread.sleep(3000, 0);
			screen.click(image10);
			Thread.sleep(3000, 0);
			//driver.quit();
			if(i==0) {
				message += "complet ";
			}else {
				message += "d'hier";
			}
			
			Thread.sleep(2000, 0);
			i++;
		}
		
		
		
		
	}
	
	
	
}
