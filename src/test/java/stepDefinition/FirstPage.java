package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;


public class FirstPage {
    WebDriver driver;
    @Given("Launch Browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","D://RAFIL//FU//Automation//Verint//chromedriver.exe");
        driver=new ChromeDriver();
    }
    @When("Open website")
    public void i_open_homepage() throws InterruptedException {
        driver.get("https://www.verint.com/");
        driver.manage().window().maximize();
    }
    @Then("Search")
    public void i_verify_icon() {
        driver.findElement(By.xpath("//div[@class='rxbodyfield']//div")).click();
        driver.findElement(By.id("downshift-0-input")).sendKeys("customer solution");
        driver.findElement(By.xpath("//button[@title='Search']")).click();
    }
    @Then("Verify text")
    public void close_browser() {
        Actions action = new Actions(driver);
        if(driver.getPageSource().contains("customer solution") == true){
            System.out.println("Scenario 1 PASSED");
        }
        else{
            System.out.println("Scenario 1 FAIL");
            driver.close();

        }
    }
}
