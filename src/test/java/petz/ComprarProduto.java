package petz;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Home;
import java.util.concurrent.TimeUnit;

public class ComprarProduto {

    String url;//endereço do Site
    WebDriver driver;
    Home home; // Objeto home herdando a classe Home

    @Before // antes do teste
    public void iniciar(){
        url = "https://www.petz.com.br";
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        home = new Home(driver);
    }
    @After
    public void finalizar(){
        driver.quit();
    }

    @Given("acesso o site Petz")
    public void dadoQueAcessoOSitePetz() {
        driver.get(url);
        System.out.println("Passo 1");
    }

    @When("busco por {string} e pressiono Enter")
    public void quandoBuscoPorEPressionoEnter(String produto) {
        home.buscaProdutoComEnter(produto);
        System.out.println("Passo 2");
    }

    @Then("exibe uma lista de produtos relacionados com {string}")
    public void entaoExibeUmaListaDeProdutosRelacionadosCom(String arg0) {
        System.out.println("Passo 3");
    }

    @When("Escolho {string}")
    public void escolho(String arg0) {
        System.out.println("Passo 4");
    }

    @Then("exibe para o {string} o preço de {string}")
    public void exibeParaOOPrecoDe(String arg0, String arg1) {
        System.out.println("Passo 5");
    }
}
