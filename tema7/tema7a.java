import org.junit.After;
import org.junit.Before;

public class tema7a {
    protected WebDriver driver;
    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
    }
    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}