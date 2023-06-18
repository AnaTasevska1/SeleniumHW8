package HWclass8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement recr = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recr.click();

        WebElement calendar= driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calendar.click();
        WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        month.click();
        Select sel=new Select(month);
        sel.selectByVisibleText("Jul");

        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        year.click();
        Select sel1=new Select(year);
        sel1.selectByVisibleText("2000");
        Thread.sleep(1000);

        WebElement day=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[4]"));
        day.click();

        Thread.sleep(2000);
        driver.quit();
        }
    }


//hw8:
//goto syntax hrms
//login
//click on recruitment
//select a date on the calendar