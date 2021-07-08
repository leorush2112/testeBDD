package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lista extends PageObjects {
    //Exemplo estático
    //@FindBy(xpath = "//h3[contains(text(),'Guia Petz Flamingo para Cães')]")
    //private WebElement produtoDesejado;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[2]/div[1]/h1[1]")
    WebElement cabecalhoResultado;

    //Construtor
    public Lista(WebDriver driver) {
        super(driver);
    }

    // Método para encontrar produto passando por parametro que está no BDD (Dinamico)
    public void clicarProdutoDesejado(String produto) {
        WebElement produtoDesejado = driver.findElement(By.xpath("//h3[contains(text(),'"+produto+"')]"));
        produtoDesejado.click();
    }

    public String lerCabecalhoResultado(){
       // WebElement cabecalhoResultado = driver.findElement(By.cssSelector("h2Categoria.nomeCategoria"));
        return cabecalhoResultado.getText();
    }
}
