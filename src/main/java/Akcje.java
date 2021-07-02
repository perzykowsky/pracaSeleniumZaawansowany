import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Akcje {

    @FindBy(className = "input-checkmark")
    private WebElement checkbox;

    @FindBy(xpath = "//span[@classname = 'input-checkmark']")
    private static WebElement checkBoxBox;

    public static void zaznaczCheckbox(){
        checkBoxBox.click();
    }
}
