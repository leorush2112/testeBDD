package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//Classe de controle
//Estrutura para organizar o acesso as páginas do site

public class PageObjects {
    protected WebDriver driver;// Forma protegida

    //Construtor (mesmo nome da classe) Elo de conexão entre as paginas
    public PageObjects(WebDriver driver){  // Receber o Driver que está na outra classe
        this.driver = driver; // Driver protegido > receberá o driver visitante
        PageFactory.initElements(driver,this);
    }
}
