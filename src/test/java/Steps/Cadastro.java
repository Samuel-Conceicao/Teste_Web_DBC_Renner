package Steps;

import Elementos_Web.Elementos_Cadastro;
import Metodos.Metodos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Cadastro {

    String url = "http://automationpractice.com/.";
    Metodos metodos = new Metodos();
    Elementos_Cadastro el = new Elementos_Cadastro();

    @Given("que eu testes no site")
    public void queEuTestesNoSite() throws InterruptedException {
        metodos.abrirNavegador(url);
        metodos.esperar();

    }

    @When("clicar em  Sign in")
    public void clicarEmSignIn() throws InterruptedException {
        metodos.clicar(el.getLogin());
        metodos.esperar();
    }

    @And("preencho todos os campos")
    public void preenchoTodosOsCampos() throws InterruptedException {
        metodos.escrever(el.getEmail(), "souza.samk0205@hotmail.com");
        metodos.clicar(el.getCreateBot());
        metodos.esperar();
        metodos.clicar(el.getGenero());
        metodos.esperar();
        metodos.escrever(el.getFirstName(), "SAMUEL");
        metodos.escrever(el.getLastName(), "CONCEICAO");
        metodos.escrever(el.getPassword(), "0502@licE");
        metodos.escrever(el.getDate(), "18");
        metodos.escrever(el.getMonths(), "November");
        metodos.escrever(el.getYears(), "1993");
        metodos.clicar(el.getNewsletter());
        metodos.clicar(el.getReceive());
        metodos.escrever(el.getFirstName2(), "DBC");
        metodos.escrever(el.getLastName2(), "RENNER");
        metodos.escrever(el.getAddress(), "ENG SOFTWARE QA");
        metodos.escrever(el.getCity(), "SAO PAULO");
        metodos.escrever(el.getState(), "Florida");
        metodos.escrever(el.getPostal(), "50001");
        metodos.escrever(el.getCountry(), "United States");
        metodos.escrever(el.getMobile(), "+5511954643383");
        metodos.escrever(el.getAddress(), "");
        metodos.clicar(el.getRegister());

    }


    @Then("valido as informcoes")
    public void validoAsInformcoes() throws IOException {
        metodos.screnShot("cadastro finalizado");
        metodos.fecharNavegador();

    }
}
