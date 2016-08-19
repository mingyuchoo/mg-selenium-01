package com.mingyuchoo.selenium;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class NaverTestcase {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass
    public static void setupClass() {
        // System.setProperty("webdriver.chrome.driver", "/absolute/path/to/binary/chromedriver");
        // System.setProperty("webdriver.opera.driver", "/absolute/path/to/binary/operadriver");
        // System.setProperty("webdriver.ie.driver", "C:/absolute/path/to/binary/IEDriverServer.exe");
        // System.setProperty("webdriver.edge.driver", "C:/absolute/path/to/binary/MicrosoftWebDriver.exe");
        // System.setProperty("phantomjs.binary.path", "/absolute/path/to/binary/phantomjs");
        // System.setProperty("webdriver.gecko.driver", "/absolute/path/to/binary/geckodriver");

        ChromeDriverManager.getInstance().setup();
    }

    @Before
    public void setUp() throws Exception {
        // driver = new FirefoxDriver();
        driver = new ChromeDriver();
        baseUrl = "http://www.naver.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testNaverTestcase() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.xpath("//a[@id='svc.mail']/span")).click();
        driver.findElement(By.linkText("NAVER")).click();
        driver.findElement(By.xpath("//a[@id='svc.cafe']/span")).click();
        driver.findElement(By.linkText("NAVER")).click();
        driver.findElement(By.xpath("//a[@id='svc.blog']/span")).click();
        driver.findElement(By.linkText("NAVER")).click();
        driver.findElement(By.xpath("//a[@id='svc.kin']/span")).click();
        driver.findElement(By.cssSelector("span.sp_common")).click();
        driver.findElement(By.xpath("//a[@id='svc.shopping']/span")).click();
        driver.findElement(By.linkText("NAVER")).click();
        driver.findElement(By.xpath("//a[@id='svc.tvcast']/span")).click();
        driver.findElement(By.linkText("네이버")).click();
        driver.findElement(By.cssSelector("a.mn_dic > span")).click();
        driver.findElement(By.cssSelector("span.Nsp_gnb")).click();
        driver.findElement(By.cssSelector("a.mn_news > span")).click();
        driver.findElement(By.linkText("NAVER")).click();
        driver.findElement(By.cssSelector("a.mn_stock > span")).click();
        driver.findElement(By.cssSelector("img[alt=\"NAVER\"]")).click();
        driver.findElement(By.cssSelector("a.mn_land > span")).click();
        driver.findElement(By.cssSelector("i.icon")).click();
        driver.findElement(By.cssSelector("a.mn_map > span")).click();
        driver.findElement(By.linkText("NAVER")).click();
        driver.findElement(By.cssSelector("a.mn_movie > span")).click();
        driver.findElement(By.cssSelector("img[alt=\"NAVER\"]")).click();
        driver.findElement(By.cssSelector("a.mn_music > span")).click();
        driver.findElement(By.linkText("NAVER")).click();
        driver.findElement(By.cssSelector("a.mn_book > span")).click();
        driver.findElement(By.cssSelector("img[alt=\"NAVER\"]")).click();
        driver.findElement(By.cssSelector("a.mn_comic > span")).click();
        driver.findElement(By.linkText("NAVER")).click();
        driver.findElement(By.cssSelector("a.mn_npay > span")).click();
        driver.findElement(By.cssSelector("span")).click();
        driver.findElement(By.cssSelector("span.over")).click();
        driver.findElement(By.name("ngame")).click();
        driver.findElement(By.linkText("NAVER")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
