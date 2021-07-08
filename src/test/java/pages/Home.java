package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageObjects {
    // Atributos (caixa de pesquisa da home)
    @FindBy(id = "search")
    private WebElement busca;

    // Construtor
    public Home(WebDriver driver) {
        super(driver);
    }

    // Método e Funções
    public void buscaProdutoComEnter(String produto){
        busca.clear();// Limpa a pesquisa
        busca.sendKeys(produto + Keys.ENTER);
    }
}
