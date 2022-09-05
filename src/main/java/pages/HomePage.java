package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("formAuthenticationLink");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText((linkText))).click();
    }
}
