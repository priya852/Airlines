package org.parttable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Deva files\\Workspaces\\Selenium\\WebTable\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRows.size(); i++) {
		WebElement row = tRows.get(i);
		List<WebElement> tData = row.findElements(By.tagName("td"));
		for (int j = 0; j < tData.size(); j++) {
		WebElement data = tData.get(j);
			String ch = data.getText();
			if (ch.equals("Taiwan")) {
			System.out.println(ch);				
			System.out.println("Row number:"+i);
			System.out.println("cell number:"+j);
			}
			
		}}}}

