package org.base;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Set;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor j;
	public static Select s;
	public static FluentWait<WebDriver> w;

	public static void openChrome() {
		driver = new ChromeDriver();
	}

	public static void toPassUrl(String url) {
		driver.get(url);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void toFillInput(WebElement element, String input) {
		element.sendKeys(input);
	}

	public static void toClick(WebElement element) {
		element.click();
	}

	public static void fetchTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void fetchUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
public static boolean fetchUrl2(String url) {
	@Nullable
	String currentUrl = driver.getCurrentUrl();
	boolean b = currentUrl.contains(url);
    return b;

}
	public static void toClose() {
		driver.close();
	}

	public static void toCloseBrowser() {
		driver.quit();
	}

	public static void toGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public static boolean toGetText2(WebElement element,String txt) {
		String text = element.getText();
		if (text.contains(txt)) {
			return true;
		}
		return false;
	}

	public static void toGetAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}
	public static String toGetAttribute3(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public static void toGetAttribute2(WebElement element,String value) {
	@Nullable
	String attribute = element.getAttribute(value);
	

	}
	public static void hold(int time) throws InterruptedException {
		Thread.sleep(time);
	}

// Action
	public static void toMoveToElement(WebElement target) {
		a = new Actions(driver);
		a.moveToElement(target).perform();
	}

	public static void toDragAndDrop(WebElement source, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void toDoubleClick(WebElement target) {
		a = new Actions(driver);
		a.doubleClick(target).perform();
	}

	public static void toContextClick(WebElement target) {
		a = new Actions(driver);
		a.contextClick(target).perform();
	}

	public static void toClickAndhold(WebElement target) {
		a = new Actions(driver);
		a.clickAndHold(target).perform();
	}

//Robot
	public static void copyUsingKeyboard() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void pasteUsingKeyboard() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void selectAllUsingKeyboard() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void enterUsingKeyboard() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void tabUsingKeyboard() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void atUsingKeyboard() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void dotUsingKeyboard() {
		r.keyPress(KeyEvent.VK_PERIOD);
		r.keyRelease(KeyEvent.VK_PERIOD);
	}

//Alert
	public static void acceptAlert() {
		al = driver.switchTo().alert();
		al.accept();
	}

	public static void cancelAlert() {
		al = driver.switchTo().alert();
		al.dismiss();
	}

//javascript
	public static void jsFillInput(String textvalue, WebElement element) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value',textvalue')", element);
	}

	public static void jsToClick(WebElement element) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", element);
	}

	public static void jsGetAttribute(String attrname, WebElement element) {
		j = (JavascriptExecutor) driver;
		Object text = j.executeScript("return arguments[0].getAttribute('attrname')", element);
		System.out.println(text);
	}

//Screenshot
	public static void screenshot(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\eclipse-workspace\\Selenium_Project\\Screenshot\\" + name + ".png");
		FileUtils.copyFile(source, des);
	}

//frames
	public static void switchFrame(WebElement refname) {
		driver.switchTo().frame(refname);
	}

	public static void frameCount(List<WebElement> allframes) {
		int count = allframes.size();
		System.out.println("No of frames:" + count);
	}

//windows hanling
	public static void switchWindow(String windowid) {
		driver.switchTo().window(windowid);
	}

	public static void getParentWindow() {
		String parentId = driver.getWindowHandle();
		System.out.println("parentId is:" + parentId);
	}

	public static void getAllWindow() {
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
	}

//DropDrown
	public static void toSelectVisibletext(WebElement dropdown, String text) {
		s = new Select(dropdown);
		s.selectByVisibleText(text);
	}

	public static void toSelectValue(WebElement dropdown, String text) {
		s = new Select(dropdown);
		s.selectByValue(text);
	}

	public static void toSelectIndex(WebElement dropdown, int num) {
		s = new Select(dropdown);
		s.selectByIndex(num);
	}

	public static void toDeselectVisibletext(WebElement dropdown, String text) {
		s = new Select(dropdown);
		s.deselectByVisibleText(text);
	}

	public static void toDeselectValue(WebElement dropdown, String text) {
		s = new Select(dropdown);
		s.deselectByValue(text);
	}

	public static void toDeselectIndex(WebElement dropdown, int num) {
		s = new Select(dropdown);
		s.deselectByIndex(num);
	}

	public static void findIsMultiple(WebElement dropdown) {
		s = new Select(dropdown);
		if (s.isMultiple()) {
			System.out.println("Multiple DropDown");
		} else {
			System.out.println("Single DropDown");
		}
	}

	public static void getOptionsFromDropdown(WebElement dropdown) {
		s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		System.out.println(options);
	}

	public static void toGetAllSelectedOptions(WebElement dropdown) {
		s = new Select(dropdown);
		List<WebElement> options = s.getAllSelectedOptions();
		System.out.println(options);
	}

	public static void toGetFirstSelectedOption(WebElement dropdown) {
		s = new Select(dropdown);
		WebElement option = s.getFirstSelectedOption();
		System.out.println(option);
	}

	public static void toDeselectAllFromDrpDown(WebElement dropdown) {
		s = new Select(dropdown);
		s.deselectAll();
	}

//Wait
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void fluentWait() {
		w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(200))
				.ignoring(Throwable.class);
	}

//for getting datas from excel
	public static String excelRead(int row, int cell) throws IOException {
		File f = new File("D:\\eclipse-workspace\\TestNG\\TestData\\Adactin-1.xlsx");

		FileInputStream fil = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fil);

		Sheet sh = w.getSheet("Sheet1");

		Row r = sh.getRow(row);

		Cell c = r.getCell(cell);

		int cellType = c.getCellType();

		String value;

		if (cellType == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/mm/yyyy");
			value = sim.format(d);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		return value;
	}

}