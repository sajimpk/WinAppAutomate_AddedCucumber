package HomePage;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

@Getter
WebDriver driver;

By logo = By.xpath("//Window[@ClassName='Notepad++']//Pane[@ClassName='Scintilla']");
By Save_icon = By.xpath("//Window[@ClassName='Notepad++']//Pane[@ClassName='Scintilla']");
By New_icon = By.xpath("/Button[@Name='New']");


public Homepage(WebDriver driver){
    this.driver = driver ;
}

public WebElement write_texT(){return driver.findElement(logo);}
public WebElement Save_icon(){return driver.findElement(Save_icon);}
public WebElement New_icon(){return driver.findElement(New_icon);}


}
