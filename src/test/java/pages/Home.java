package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageObjects { //Extends para receber a construão do PageObjects

    // Atributos (caixa de pesquisa da home)
    @FindBy(id = "search")//Caracteristica do PageFactory
    private WebElement busca; // Apelido da caixa de pesquisa

    // Construtor
    public Home(WebDriver driver) { //Preparar para receber o Driver
        super(driver);//
    }

    // Método e Funções
    public void buscaProdutoComEnter(String produto){
        busca.clear();// Limpa a pesquisa antes de inserir dados
        busca.sendKeys(produto + Keys.ENTER);
    }
}
