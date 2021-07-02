import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public static WebDriver driver;

    public static Akcje Akcje;
    public static Faktura Faktura;

    @BeforeClass
    public static void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://test-oneclick-pl.easypack24.net/SzybkieNadania/");
        driver.manage().window().maximize();

        Akcje = new Akcje();
        Faktura = new Faktura();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
