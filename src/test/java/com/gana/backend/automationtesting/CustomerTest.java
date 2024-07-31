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
public class CustomerTest {

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
//	void testAddCustomer() {
//		webDriver.get("http://localhost:7775/add");
//		webDriver.findElement(By.name("customername")).sendKeys("ganapathy");
//		webDriver.findElement(By.name("customerage")).sendKeys("two");
//		webDriver.findElement(By.name("customeraddress")).sendKeys("dgl");
//		webDriver.findElement(By.name("customergender")).sendKeys("male");
//		webDriver.findElement(By.name("insuranceid")).sendKeys("27");
//		webDriver.findElement(By.name("submit")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("customer added Successfully", webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//
//	}

	// @Test
	// void testAddCustomer1() {
	// 	webDriver.findElement(By.linkText("View Customer")).click();
	// 	webDriver.findElement(By.linkText("Add Customer +")).click();
	// 	webDriver.findElement(By.name("customername")).sendKeys("");
	// 	webDriver.findElement(By.name("customerage")).sendKeys("two");
	// 	webDriver.findElement(By.name("customeraddress")).sendKeys("dgl");
	// 	webDriver.findElement(By.name("customergender")).sendKeys("male");
	// 	webDriver.findElement(By.name("insuranceid")).sendKeys("27");
	// 	webDriver.findElement(By.name("submit")).submit();
	// 	WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
	// 	wait.until(ExpectedConditions.alertIsPresent());
	// 	assertEquals("Please enter  customername !!!", webDriver.switchTo().alert().getText());
	// 	webDriver.switchTo().alert().accept();

	// }

//	@Test
//	void testAddCustomer2() {
//		webDriver.findElement(By.linkText("View Customer")).click();
//		webDriver.findElement(By.linkText("Add Customer +")).click();
//		webDriver.findElement(By.name("customername")).sendKeys("hari");
//		webDriver.findElement(By.name("customerage")).sendKeys("");
//		webDriver.findElement(By.name("customeraddress")).sendKeys("dgl");
//		webDriver.findElement(By.name("customergender")).sendKeys("male");
//		webDriver.findElement(By.name("insuranceid")).sendKeys("27");
//		webDriver.findElement(By.name("submit")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Please enter customerage !!!", webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//
//	}

	// @Test
	// void testAddCustomer3() {
	// 	webDriver.findElement(By.linkText("View Customer")).click();
	// 	webDriver.findElement(By.linkText("Add Customer +")).click();
	// 	webDriver.findElement(By.name("customername")).sendKeys("hari");
	// 	webDriver.findElement(By.name("customerage")).sendKeys("twelve");
	// 	webDriver.findElement(By.name("customeraddress")).sendKeys("");
	// 	webDriver.findElement(By.name("customergender")).sendKeys("male");
	// 	webDriver.findElement(By.name("insuranceid")).sendKeys("27");
	// 	webDriver.findElement(By.name("submit")).submit();
	// 	WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
	// 	wait.until(ExpectedConditions.alertIsPresent());
	// 	assertEquals("Please enter customeraddress !!!", webDriver.switchTo().alert().getText());
	// 	webDriver.switchTo().alert().accept();

	// }

	// @Test
	// void testAddCustomer4() {
	// 	webDriver.findElement(By.linkText("View Customer")).click();
	// 	webDriver.findElement(By.linkText("Add Customer +")).click();
	// 	webDriver.findElement(By.name("customername")).sendKeys("hari");
	// 	webDriver.findElement(By.name("customerage")).sendKeys("twelve");
	// 	webDriver.findElement(By.name("customeraddress")).sendKeys("coimbatore");
	// 	webDriver.findElement(By.name("customergender")).sendKeys("");
	// 	webDriver.findElement(By.name("insuranceid")).sendKeys("27");
	// 	webDriver.findElement(By.name("submit")).submit();
	// 	WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
	// 	wait.until(ExpectedConditions.alertIsPresent());
	// 	assertEquals("Please Enter the Valid customergender!!!", webDriver.switchTo().alert().getText());
	// 	webDriver.switchTo().alert().accept();

	// }

//	@Test
//	void testUpdateCustomer() {
//		webDriver.findElement(By.linkText("Add Customer")).click();
//		webDriver.findElement(By.name("customername")).sendKeys("prasad");
//		webDriver.findElement(By.name("customerage")).sendKeys(" two");
//		webDriver.findElement(By.name("customeraddress")).sendKeys("al");
//		webDriver.findElement(By.name("customergender")).sendKeys("e");
//		webDriver.findElement(By.name("submit")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("customer Updated Successfully", webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//
//	}
//
//	@Test
//	void testDeleteCustomer() {
//		webDriver.get("http://localhost:7775/viewCustomer");
//		webDriver.findElement(By.id("delete")).click();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Do you want to delete", webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//		WebDriverWait wait1 = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Customer record has been deleted", webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//	}

//	@Test
//	void testViewCustomer() {
//		webDriver.get("http://localhost:7775/frontPage");
//		webDriver.findElement(By.linkText("View Customer")).click();
//	}
}
