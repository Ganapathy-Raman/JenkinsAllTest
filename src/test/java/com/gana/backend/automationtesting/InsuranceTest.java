package com.gana.backend.automationtesting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsuranceTest {
	private WebDriver webDriver;

	// @BeforeEach
	// void init() {
	// 	webDriver = new ChromeDriver();
	// 	webDriver.get("http://localhost:7775");
	// 	webDriver.findElement(By.linkText("Login")).click();
	// 	webDriver.findElement(By.name("username")).sendKeys("tomi");
	// 	webDriver.findElement(By.name("password")).sendKeys("Tom@12345");
	// 	webDriver.findElement(By.name("submit")).submit();
	// }

//	@Test
//	void testAddInsurance() {
//		webDriver.get("http://localhost:7775/addinsurance");
//		webDriver.findElement(By.name("insurancenumber")).sendKeys("76");
//		webDriver.findElement(By.name("insurancetakendate")).sendKeys("23");
//		webDriver.findElement(By.name("insurancevaliddate")).sendKeys("534");
//		webDriver.findElement(By.name("insuranceamount")).sendKeys("35");
//		webDriver.findElement(By.name("customervehicleid")).sendKeys("27");
//		webDriver.findElement(By.name("insurancetotal")).click();
//		webDriver.findElement(By.name("submit")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Insurance added Successfully", webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//
//	}

	// @Test
	// void testAddInsurance1() {
	// 	webDriver.findElement(By.linkText("View Insurance")).click();
	// 	webDriver.findElement(By.linkText("Add Insurance +")).click();
	// 	webDriver.findElement(By.name("insurancenumber")).sendKeys("");
	// 	webDriver.findElement(By.name("insurancetakendate")).sendKeys("23");
	// 	webDriver.findElement(By.name("insurancevaliddate")).sendKeys("534");
	// 	webDriver.findElement(By.name("insuranceamount")).sendKeys("35");
	// 	webDriver.findElement(By.name("customervehicleid")).sendKeys("27");
	// 	webDriver.findElement(By.name("insurancetotal")).sendKeys("3556");
	// 	webDriver.findElement(By.name("submit")).submit();
	// 	WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
	// 	wait.until(ExpectedConditions.alertIsPresent());
	// 	assertEquals("Please enter Insurance Number !!! ", webDriver.switchTo().alert().getText());
	// 	webDriver.switchTo().alert().accept();

	// }

//	@Test
//	void testAddInsurance2() {
//		webDriver.findElement(By.linkText("View Insurance")).click();
//		webDriver.findElement(By.name("insurancenumber")).sendKeys("34");
//		webDriver.findElement(By.name("insurancetakendate")).sendKeys("");
//		webDriver.findElement(By.name("insurancevaliddate")).sendKeys("534");
//		webDriver.findElement(By.name("insuranceamount")).sendKeys("35");
//		webDriver.findElement(By.name("customervehicleid")).sendKeys("27");
//		webDriver.findElement(By.name("insurancetotal")).sendKeys("3556");
//		webDriver.findElement(By.name("submit")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Please enter Insurance Taken Date !!! ", webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//
//	}

	// @Test
	// void testAddInsurance3() {
	// 	webDriver.findElement(By.linkText("View Insurance")).click();
	// 	webDriver.findElement(By.linkText("Add Insurance +")).click();
	// 	webDriver.findElement(By.name("insurancenumber")).sendKeys("34");
	// 	webDriver.findElement(By.name("insurancetakendate")).sendKeys("643");
	// 	webDriver.findElement(By.name("insurancevaliddate")).sendKeys("");
	// 	webDriver.findElement(By.name("insuranceamount")).sendKeys("35");
	// 	webDriver.findElement(By.name("customervehicleid")).sendKeys("27");
	// 	webDriver.findElement(By.name("insurancetotal")).sendKeys("3556");
	// 	webDriver.findElement(By.name("submit")).submit();
	// 	WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
	// 	wait.until(ExpectedConditions.alertIsPresent());
	// 	assertEquals("Please enter Insurance Valid Date !!!", webDriver.switchTo().alert().getText());
	// 	webDriver.switchTo().alert().accept();

	// }

	// @Test
	// void testAddInsurance4() {
	// 	webDriver.findElement(By.linkText("View Insurance")).click();
	// 	webDriver.findElement(By.linkText("Add Insurance +")).click();
	// 	webDriver.findElement(By.name("insurancenumber")).sendKeys("34");
	// 	webDriver.findElement(By.name("insurancetakendate")).sendKeys("643");
	// 	webDriver.findElement(By.name("insurancevaliddate")).sendKeys("356");
	// 	webDriver.findElement(By.name("insuranceamount")).sendKeys("");
	// 	webDriver.findElement(By.name("customervehicleid")).sendKeys("27");
	// 	webDriver.findElement(By.name("insurancetotal")).sendKeys("3556");
	// 	webDriver.findElement(By.name("submit")).submit();
	// 	WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
	// 	wait.until(ExpectedConditions.alertIsPresent());
	// 	assertEquals("Please enter Insurance Amount !!!", webDriver.switchTo().alert().getText());
	// 	webDriver.switchTo().alert().accept();

	// }

	// @Test
	// void testAddInsurance5() {
	// 	webDriver.findElement(By.linkText("View Insurance")).click();
	// 	webDriver.findElement(By.linkText("Add Insurance +")).click();
	// 	webDriver.findElement(By.name("insurancenumber")).sendKeys("34");
	// 	webDriver.findElement(By.name("insurancetakendate")).sendKeys("643");
	// 	webDriver.findElement(By.name("insurancevaliddate")).sendKeys("356");
	// 	webDriver.findElement(By.name("insuranceamount")).sendKeys("45");
	// 	webDriver.findElement(By.name("customervehicleid")).sendKeys("");
	// 	webDriver.findElement(By.name("insurancetotal")).sendKeys("3556");
	// 	webDriver.findElement(By.name("submit")).submit();
	// 	WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
	// 	wait.until(ExpectedConditions.alertIsPresent());
	// 	assertEquals("Please Enter the Customer Vehicle Id !!!", webDriver.switchTo().alert().getText());
	// 	webDriver.switchTo().alert().accept();

	// }

	// @Test
	// void testAddInsurance6() {
	// 	webDriver.findElement(By.linkText("View Insurance")).click();
	// 	webDriver.findElement(By.linkText("Add Insurance +")).click();
	// 	webDriver.findElement(By.name("insurancenumber")).sendKeys("34");
	// 	webDriver.findElement(By.name("insurancetakendate")).sendKeys("643");
	// 	webDriver.findElement(By.name("insurancevaliddate")).sendKeys("356");
	// 	webDriver.findElement(By.name("insuranceamount")).sendKeys("45");
	// 	webDriver.findElement(By.name("customervehicleid")).sendKeys("56");
	// 	webDriver.findElement(By.name("insurancetotal")).sendKeys("");
	// 	webDriver.findElement(By.name("submit")).submit();
	// 	WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
	// 	wait.until(ExpectedConditions.alertIsPresent());
	// 	assertEquals("Please Enter the insurance total !!!", webDriver.switchTo().alert().getText());
	// 	webDriver.switchTo().alert().accept();

	// }

//	@Test
//	void testUpdateInsurance() {
//		webDriver.get("http://localhost:7775/updateInsurance/17");
//		webDriver.findElement(By.name("insurancenumber")).sendKeys("34");
//		webDriver.findElement(By.name("insurancetakendate")).sendKeys("643");
//		webDriver.findElement(By.name("insurancevaliddate")).sendKeys("356");
//		webDriver.findElement(By.name("insuranceamount")).sendKeys("45");
//		webDriver.findElement(By.name("customervehicleid")).sendKeys("56");
//		webDriver.findElement(By.name("insurancetotal")).sendKeys("567");
//		webDriver.findElement(By.name("submit")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Insurance Updated Successfully", webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//
//	}
//
//	@Test
//	void testDeleteInsurance() {
//		webDriver.get("http://localhost:7775/viewInsurance");
//		webDriver.findElement(By.name("delete")).click();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Do you want to delete", webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//		WebDriverWait wait1 = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Insurance record has been deleted", webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//	}
//
//	@Test
//	void testViewInsurance() {
//		webDriver.get("http://localhost:7775/frontPage");
//		webDriver.findElement(By.linkText("View Insurance")).click();
//	}
}
