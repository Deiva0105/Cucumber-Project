package org.helping;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver w;
	public static Actions a;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;
	
	public void openFireFox() {
		w = new FirefoxDriver();
	}
	
	public void launchURL(String url) {
		w.get(url);
	}
	
	public void toGetTheTitle() {
		w.getTitle();
	}
	
	public void toGetTheCurrentURL() {
		w.getCurrentUrl();
	}
	
	public void maximizeTheWindow() {
		w.manage().window().maximize();
	}
	
	public void toPassTheValues(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void implictWait(int value) {
		w.manage().timeouts().implicitlyWait(Duration.ofMillis(value));
	}
	
	public void toCloseTheBrowser() {
		w.quit();
	}
	
	public void toClickTheButton(WebElement element) {
		element.click();
	}
	
	public void toMoveToElement(WebElement element) {
		a = new Actions(w);
		a.moveToElement(element).perform();
	}
	
	public void toDragandDrop(WebElement element, WebElement element1) {
		a.dragAndDrop(element, element1).perform();
	}
	
	public void toHandleDoubleClick(WebElement element) {
		a.doubleClick(element).perform();
	}
	
	public void toHandleContextClick(WebElement element) {
		a.contextClick(element).perform();
	}
	
	public void toHandleTheSimpleAlert() {
		al = w.switchTo().alert();
		al.accept();
	}
	
	public void toHandleTheConfirmAlert() {
		al.dismiss();
	}
	
	public void toHandleThePromptAlert(String value) {
		al.sendKeys(value);
	}
	
	public void toGetTheTextFromtheAlert() {
		al.getText();
	}
	
	public void toHandleTheFrame(WebElement element) {
		w.switchTo().frame(element);
	}
	
	public void toSendKeysUsingJavaScriptExecutor(String value, WebElement element) {
		js = (JavascriptExecutor)w;
		js.executeScript("arguments[0].setAttribute('value', 'value')", element);
	}
	
	public void toGetTheAttributeUsingJavaScriptExecutor(WebElement element) {
		js = (JavascriptExecutor)w;
		Object executeScript = js.executeScript("returnarguments[0].getAttribute('value')", element);
		System.out.println("UserName-PlaceHolder: "+executeScript);
	}
	
	public void toClickUsingJavaScriptExecutor(WebElement element) {
		js = (JavascriptExecutor)w;
		js.executeScript("arguments[o].click()", element);
	}
	
	public void toScrollThePage() {
		js.executeScript("arguments[o].scrollIntoView()");
	}
	
	public void toTakeTheScreenShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)w;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		f.createNewFile();
		FileUtils.copyFile(src, f);
	}
	
	public void dropDownSelectByIndex(WebElement element, int value) {
		s.selectByIndex(value);
	}
	
	public void dropDownByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}
	
	public void dropDownByVisibleText(String text) {
		s.selectByVisibleText(text);
	}
	
	public void dropDownIsMultiple() {
		s.isMultiple();
	}
	
	public void dropDownGetOptions() {
		s.getOptions();
	}
	
	public void dropDownGetAllSelectOptions() {
		s.getAllSelectedOptions();
	}
	
	public void dropDownGetFirstSelectOptions() {
		s.getFirstSelectedOption();
	}
	
	public void dropDownDeSelectByIndex(int value) {
		s.deselectByIndex(value);
	}
	
	public void dropDownDeSelectByValue(String value) {
		s.deselectByValue(value);
	}
	
	public void dropDownDeSelectByVisibleText(String value) {
		s.deselectByVisibleText(value);
	}
	
	public void dropDownDeSelectAll() {
		s.deselectAll();
	}
	
	public void navigationToStringURL(String url) {
		w.navigate().to(url);
	}
	
	public void toBackPageByNavigation() {
		w.navigate().back();
	}
	
	public void toForwardPageByNavigation() {
		w.navigate().forward();
	}
	
	public void toRefreshThePage() {
		w.navigate().refresh();
	}
	
	
	
	
	
	
}
