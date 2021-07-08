package petz;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Home;
import pages.Lista;
import pages.Produto;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class ComprarProduto {

    //atributos
    String url;//endereço do Site
    WebDriver driver; //Selenium
    Home home; // Objeto home herdando classe Home
    Lista lista; // Objeto lista Herdado classe Lista
    Produto produto; //Objeto produto Herdando classe Produto

    @Before // antes do teste >
    public void iniciar(){
        url = "https://www.petz.com.br";
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver(); // Instanciar o Chrome
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Instanciar Páginas
        home = new Home(driver);//Instanciar a Pagina(classe) > Home
        lista = new Lista(driver); // Instanciar a Pagina(classe) > Lista
        produto = new Produto(driver);// Instanciar a Pagina(classe) > Produto
    }
    @After // Após o teste >
    public void finalizar(){
       driver.quit();
    }

    @Given("acesso o site Petz")
    public void dadoQueAcessoOSitePetz() {
        driver.get(url);
        System.out.println("Passo 1: Url OK");
    }

    @When("busco por {string} e pressiono Enter")
    public void buscoPorEPressionoEnter(String produto) { //
        home.buscaProdutoComEnter(produto);
        System.out.println("Passo 2: Efetuar busca de: \""+produto+"\"");
    }

    @Then("exibe uma lista de produtos relacionados com {string}")
    public void exibeUmaListaDeProdutosRelacionadosCom(String produto) {
        assertEquals("RESULTADOS PARA \""+produto.toUpperCase()+"\"",lista.lerCabecalhoResultado());
        System.out.println("Passo 3: Lista exibida filtrando por produto: \""+produto+"\"");
    }

    @When("escolho {string}")
    public void escolho(String produto) {
        lista.clicarProdutoDesejado(produto);
        System.out.println("Passo 4: Nome do produto selecionado: \""+produto+"\"");
    }

    @Then("exibe para o {string} o preco de {string}")
    public void exibeParaOOPrecoDe(String tamanhoProduto, String precoProduto) {
        assertEquals("exibe para o \""+tamanhoProduto+"\" o preco de \""+precoProduto+"\"",
        "exibe para o \""+produto.lerTamanhoProduto()+"\" o preco de \""+produto.lerPrecoProduto()+"\"");
        System.out.println("Passo 5: tamanho = \""+produto.lerTamanhoProduto()+"\" / preco = \""+produto.lerPrecoProduto()+"\"");
    }
}
