package Metodos;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Metodos {

	String url = "http://automationpractice.com/.";
	static WebDriver driver;


	public void abrirNavegador(String url) throws InterruptedException {
		System.out.println("****** TESTE INICIADO ******");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	public void selecionar(By elemento){
		WebElement element = driver.findElement(elemento);
		Select combo = new Select(element);
		combo.selectByValue(String.valueOf(elemento));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		/*Thread.sleep(10000);*/
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

	}

	public void esperar() throws InterruptedException {
		Thread.sleep(10000);
	}

	public void screnShot(String nome) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/"+nome+".png");
		FileUtils.copyFile(srcFile, destFile);
	}

	public void moverMouse(By elemento){
		WebElement mouse = driver.findElement(elemento);
		Actions actionsProvider = new Actions(driver);
		actionsProvider.moveToElement(mouse).build().perform();
	}

	public void fecharNavegador(){
		System.out.println("****** TESTE INICIADO ******");
		driver.quit();

	}
}
