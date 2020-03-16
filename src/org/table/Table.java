package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Deva files\\Workspaces\\Selenium\\WebTable\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-table/");
	List<WebElement> tRows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < tRows.size(); i++) {
	WebElement row = tRows.get(i);
		String ch = row.getText();
		System.out.println(ch);
	}
}
}
