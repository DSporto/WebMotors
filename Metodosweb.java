package metodos;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodosweb {

	WebDriver driver;
	
	public void openBrowser(String appUrl) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		
	}
    
	public void click(By elementos) {
		driver.findElement(elementos).click();
	}

    public void digitar(String texto, By elementos) {
    	
    	driver.findElement(elementos).sendKeys(texto);
    }
	
    public void takePrint(String nomeEvidencia) {
    	try {
    	TakesScreenshot scrShot = (TakesScreenshot) driver;
    	File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
    	File destFile = new File("./evidencias/" +nomeEvidencia+ ".png");
    	
    	
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
    	System.err.println("********ERRO AO TIRAR EVIDÊNCIA********");
    }

    public void closeBrowser() {
    	driver.quit();
    	
    	
    }

    public void submti(By elemento) {
		driver.findElement(elemento).submit();
		
    }
    
    public void espera(By elementos) {

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}

    public void espera02(By elementos) {

		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);
	}


}

