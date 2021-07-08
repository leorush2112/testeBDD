package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Produto extends PageObjects {

    @FindBy(xpath = "//body/div[9]/main[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/label[1]/div[1]")
    WebElement tamanhoProduto;

    @FindBy(xpath = "//div[contains(text(),'R$ 43,99')]")
    WebElement precoProduto;

    //Construtor
    public Produto(WebDriver driver) {
        super(driver);
    }

    public String lerTamanhoProduto(){
        return  tamanhoProduto.getText();
    }

    public String lerPrecoProduto(){
        return precoProduto.getText();
    }
}
