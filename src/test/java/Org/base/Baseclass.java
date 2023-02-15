package Org.base;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static void setproperity() {
		//	System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
	}

	public static  void launchbrowser() {
	WebDriverManager.chromiumdriver().setup();
	//	WebDriverManager.firefoxdriver().setup();
	driver = new ChromeDriver();	
		//driver = new FirefoxDriver();
	}

	public static void launchUrl(String url){
		driver.get(url);
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();

	}

	public static void pageTitle(){
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void pageUrl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}

	public static void sendKeys(WebElement ele,String txt) {
		ele.sendKeys(txt);
	}

	public static void closeEntirebrowser() {
		driver.quit();
	}

	public static void clickBtn(WebElement ele) {
		ele.click();
	}

	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location +imgName.png");
		FileUtils.copyFile(image, f);

	}

	public static Actions a ;
	public static void Action() {
		a = new Actions(driver);

	}

	public static JavascriptExecutor js;
	public static void scrollThepPage(WebElement tarWebEle) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",tarWebEle);
	}
	public static void scroll(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}

	public static void excelRead(String sheetName, int rowNum,int celNum) throws IOException {
		File f = new File("G:\\Maveninstallation\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Data");

		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(celNum);
		int celltype = c.getCellType();

		String value=" ";
		if (celltype == 1) {
			String value2 = c.getStringCellValue();
			System.out.println(value);
		}
		else if(DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-mm-yy");
			String value1 = s.format(dd);
			
		}
		else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueof = String.valueOf(l);
			
		}

	}
	
	public static void createNewExcel(int rownum,int cellnum,String writedata) throws IOException {
		File f = new File("G:\\Maveninstallation\\Excel\\newfile.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s= w.createSheet("Datas");

		Row newrow = s.createRow(rownum);
		Cell newcell = newrow.createCell(rownum);
		newcell.setCellValue(writedata);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	public static void createcell(int rownum,int cellnum,String newData) throws IOException {
		File f = new File("G:\\Maveninstallation\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s= wb.getSheet("Datas");

		Row r = s.getRow(rownum);
		Cell c = r.createCell(cellnum);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void createrow(int crerow,int crecell,String newData) throws IOException {
		File f = new File("G:\\Maveninstallation\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s= wb.getSheet("Datas");

		Row r = s.createRow(crerow);
		Cell c = r.createCell(crecell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void updataToparticularcell(int gettherow,int getthecell,String existingData,String writeData) throws IOException {
		File f = new File("G:\\Maveninstallation\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s= wb.getSheet("Data");

		Row r = s.getRow(gettherow);
		Cell c = r.getCell(getthecell);
		String str = c.getStringCellValue();
		if (str.equals(existingData)) {
			c.setCellValue(writeData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}









}
