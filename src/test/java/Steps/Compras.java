package Steps;

import Elementos_Web.Elementos_Cadastro;
import Elementos_Web.Elementos_Compra_Produto;
import Metodos.Metodos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.io.IOException;

public class Compras {

    String url = "http://automationpractice.com/.";
    Metodos metodos = new Metodos();
    Elementos_Cadastro el = new Elementos_Cadastro();
    Elementos_Compra_Produto ell = new Elementos_Compra_Produto();

    @Given("que eu testes no url")
    public void queEuTestesNoUrl() throws InterruptedException {
        metodos.abrirNavegador(url);
        metodos.esperar();
        metodos.clicar(el.getLogin());
        metodos.clicar(el.getEmailAcesso());
        metodos.escrever(el.getEmailAcesso(), "souza.samk0205@hotmail.com");
        metodos.clicar(el.getSenhaLogin());
        metodos.escrever(el.getSenhaLogin(), "0502@licE");
        metodos.esperar();
        metodos.clicar(el.getBotaoSignin());
    }

    @When("clicar no campo pesquisa")
    public void clicarNoCampoPesquisa() throws InterruptedException {
        metodos.esperar();
        metodos.clicar(ell.getLogo());
        metodos.esperar();
    }

    @And("informo o produto Printed Chiffon Dress e faco a busca")
    public void informoOProdutoPrintedChiffonDressEFacoABusca() throws InterruptedException {
        metodos.escrever((ell.getPesquisar()), "Printed Chiffon Dress");
        metodos.clicar(ell.getBotaoPesquisar());
        metodos.esperar();
        metodos.clicar(ell.getPrinted());
        metodos.esperar();
    }

    @And("clico no produto Printed Chiffon Dress e escolho a cor")
    public void clicoNoProdutoPrintedChiffonDressEEscolhoACor() throws InterruptedException {
        metodos.clicar(ell.getVerde());
        metodos.esperar();
    }

    @And("informo o tamanho m")
    public void informoOTamanhoM() throws InterruptedException, IOException {
        metodos.clicar(ell.getTamanho());
        metodos.clicar(ell.getM());
        metodos.esperar();
        metodos.clicar(ell.getCarrinho());
        metodos.esperar();
        metodos.screnShot("Carrinho-PrintedChiffonDress");
        metodos.esperar();
        metodos.clicar(ell.getCheckout());
        metodos.esperar();

    }

    @And("informo o produto Faded Short Sleeve T-shirts e faco a busca")
    public void informoOProdutoFadedShortSleeveTShirtsEFacoABusca() throws InterruptedException {
        metodos.escrever((ell.getPesquisar()), "Faded Short Sleeve T-shirts");
        metodos.clicar(ell.getBotaoPesquisar());
        metodos.esperar();
        metodos.clicar(ell.getShort());
        metodos.esperar();
    }

    @And("clico no produto Faded Short Sleeve T-shirts e escolho a cor")
    public void clicoNoProdutoFadedShortSleeveTShirtsEEscolhoACor() throws InterruptedException, IOException {
        metodos.clicar(ell.getAzul());
        metodos.esperar();
        metodos.clicar(ell.getCarrinho());
        metodos.esperar();
        metodos.screnShot("Carrinho-FadedShortSleeveTShirtsE");
        metodos.esperar();
        metodos.clicar(ell.getCheckout());
        metodos.esperar();

    }

    @And("informo o produto Blouse e faco a busca")
    public void informoOProdutoBlouseEFacoABusca() throws InterruptedException {
        metodos.escrever((ell.getPesquisar()), "Blouse");
        metodos.clicar(ell.getBotaoPesquisar());
        metodos.esperar();
        metodos.clicar(ell.getBlouse());
        metodos.esperar();
    }

    @And("informo a quantidade dois")
    public void informoAQuantidadeDois() throws InterruptedException, IOException {
        metodos.clicar(ell.getBotaoMais());
        metodos.esperar();
        metodos.clicar(ell.getCarrinho());
        metodos.esperar();
        metodos.screnShot("Carrinho-Blouse");
        metodos.esperar();
        metodos.clicar(ell.getCheckout());
        metodos.esperar();

    }

    @And("informo o produto Printed Dress e faco a busca")
    public void informoOProdutoPrintedDressEFacoABusca() throws InterruptedException {
        metodos.escrever((ell.getPesquisar()), "Printed Dress");
        metodos.clicar(ell.getBotaoPesquisar());
        metodos.esperar();
    }

    @And("clico no produto Printed Dress")
    public void clicoNoProdutoPrintedDress() throws InterruptedException {
        metodos.clicar(ell.getDress());
        metodos.esperar();
    }

    @And("envio ao carrinho e finalizo a compra")
    public void envioAoCarrinhoEFinalizoACompra() throws InterruptedException, IOException {
        metodos.clicar(ell.getCarrinho());
        metodos.esperar();
        metodos.screnShot("Carrinho-Printed Dress");
        metodos.esperar();
        metodos.clicar(ell.getCheckout());
        metodos.esperar();

    }

    @Then("valido as informcoes e fecho o site")
    public void validoAsInformcoesEFechoOSite() throws InterruptedException, IOException {
        metodos.esperar();
        metodos.clicar(ell.getChecout2());
        metodos.esperar();
        metodos.clicar(ell.getChecout2());
        metodos.esperar();
        metodos.clicar(ell.getTerms());
        metodos.esperar();
        metodos.clicar(ell.getChecout2());
        metodos.clicar(ell.getTotal());
        metodos.screnShot("Carrinho-Final");
        metodos.esperar();
        metodos.clicar(ell.getPayBank());
        metodos.clicar(ell.getConfirmarOrder());
        metodos.esperar();
        metodos.fecharNavegador();
    }
}
