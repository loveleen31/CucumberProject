package StepDefinationProject;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinationproject {
	 static WebDriver driver;
	@Given("User must be on HomePage url {string}")
	public void user_must_be_on_home_page_url(String string) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lovel\\SeleniumProject\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(string);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(3000);
	}

	@When("user click on signup button")
	public void user_click_on_signup_button() {
		driver.findElement(By.id("signin2")).click();
	}

	@Then("Signup window should be open")
	public void signup_window_should_be_open() {
		System.out.println("Signup window is opened");}

	@When("^user entered the (.*) and (.*)$")
	public void user_entered_the_username_and_password(String username,String password) {
		WebDriverWait wait = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username"))).sendKeys(username);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-password"))).sendKeys(password);
	}

	@When("Click on signup button")
	public void click_on_signup_button() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary"))).click();
	}

	@Then("user will get the successful signup alert message")
	public void user_will_get_the_successful_signup_alert_message() {
	System.out.println("user got the alert message");
	}

	@Then("user should click on ok button and alert message will disappear")
	public void user_should_click_on_ok_button_and_alert_message_will_disappear() throws NoAlertPresentException, InterruptedException {
		   Thread.sleep(3000);;
		    Alert al = driver.switchTo().alert();
		    String aa=driver.switchTo().alert().getText();
		    System.out.println(aa);
		    Thread.sleep(3000);
		    al.accept();		}

	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();
	}

	@Then("Login window will be displayed")
	public void login_window_will_be_displayed() {
	  System.out.println("Login Window is opened"); 
	}

	@When("^user should enter the (.*) and (.*)$")
	public void user_should_enter_the_username_and_password(String username,String password) {
		WebDriverWait wait = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys(username);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword"))).sendKeys(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary"))).click();
		
	}

	@Then("user should be navigate to account page")
	public void user_should_be_navigate_to_account_page() {
	    System.out.println("Welcome to this page");}

	@When("user click on any laptops")
	public void user_click_on_any_laptops() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1300)");
	    Thread.sleep(3000);
	    WebDriverWait wait = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("i5"))).click();
	    Thread.sleep(3000);}

	@Then("new window will be displayed of laptop")
	public void new_window_will_be_displayed_of_laptop() {
	    System.out.println("Lapto with image is opened");}

	@When("user click on addtocart button")
	public void user_click_on_addtocart_button() throws InterruptedException {
		driver.findElement(By.cssSelector("#tbodyid > div.row > div > a")).click();
	    Thread.sleep(3000);}

	@Then("user will get the product added alert message")
	public void user_will_get_the_product_added_alert_message() throws NoAlertPresentException,InterruptedException {
		Alert al = driver.switchTo().alert();
		String ss=driver.switchTo().alert().getText();
	    System.out.println(ss);
	    al.accept();
	    Thread.sleep(3000);}
	
@When("user navigate to cart page")
	public void user_navigate_to_cart_page() throws InterruptedException {
		driver.navigate().to("https://www.demoblaze.com/cart.html");
	    Thread.sleep(3000);}

	@Then("verify product is added or not")
	public void verify_product_is_added_or_not() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		boolean dd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#navbarExample > ul > li:nth-child(4) > a"))).isEnabled();
	    System.out.println(dd);	
	    driver.close();
	}
}
