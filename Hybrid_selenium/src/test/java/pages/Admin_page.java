package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Admin_page {

	WebDriver driver;
	By admin=By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
	By job=By.xpath("//*[@id=\"menu_admin_Job\"]");
	
	public Admin_page(WebDriver driver) {
		this.driver=driver;

		}
	public void button() {
		driver.findElement(admin).click();
		
		driver.findElement(job).click();
		}
}



















