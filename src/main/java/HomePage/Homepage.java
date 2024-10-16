package HomePage;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

@Getter
WebDriver driver;

By logo = By.xpath("//Window[@ClassName='Notepad++']//Pane[@ClassName='Scintilla']");


public Homepage(WebDriver driver){
    this.driver = driver ;
}

public WebElement getSearchIcon(){return driver.findElement(logo);}


}
