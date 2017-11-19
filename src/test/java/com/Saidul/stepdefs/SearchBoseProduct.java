package com.Saidul.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchBoseProduct {
	
	WebDriver driver;
	
	@Given("^user visiting the Bose Home page$")
	public void user_visiting_the_Bose_Home_page()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haque\\Desktop\\selenium files\\Driver\\chromDriver\\chromedriver.exe");
		driver=(WebDriver) new ChromeDriver();
		driver.get("https://www.bose.com/en_us/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("^User enter the product name in search box$")
	public void user_enter_the_product_name_in_search_box() {
		driver.findElement(By.name("queryForDisplay")).sendKeys("qc35");
		driver.findElement(By.name("queryForDisplay")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("//*[@id=\'search-input-63772086-43b8-4279-a6f8-5d718a05fa10']" )).click();
		//driver.findElement(By.xpath("//button[@src='//html//body//header//div[3]//div//div//div//div[1]//div//div//div//form//button]")).click();
	    //driver.close();
	}

	@When("^Click on search button$")
	public void click_on_search_button()  {

	}

	@Then("^User receive the list of searched product$")
	public void user_receive_the_list_of_searched_product() {
	    
	}

	@When("^User enter a Non existing product name in search box$")
	public void user_enter_a_Non_existing_product_name_in_search_box()  {
	    
	}

	@Then("^User receive No results were found$")
	public void user_receive_No_results_were_found()  {
	    
	}

	@When("^User enter a nothing in search box$")
	public void user_enter_a_nothing_in_search_box()  {
	    
	}

	@Then("^User receive Enter a search term in the field above\\. \\.$")
	public void user_receive_Enter_a_search_term_in_the_field_above() {
	    
	}


}
