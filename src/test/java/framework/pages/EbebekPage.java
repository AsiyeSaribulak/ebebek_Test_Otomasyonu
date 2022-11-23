package framework.pages;

import framework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbebekPage {
    public EbebekPage(){
        PageFactory.initElements(Driver.getDriver(),this);//Sayfa Nesnelerinde tanımlanan web öğelerini başlatmak için kullanılır
    }
    @FindBy(id = "txtSearchBox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='cx-sorting-wrapper row no-gutters']")
    public WebElement sonucYazisiElementi;

}
