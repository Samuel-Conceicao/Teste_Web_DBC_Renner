package Elementos_Web;

import org.openqa.selenium.By;

public class Elementos_Compra_Produto {

    private By Logo = By.xpath("//img[contains(@class,'logo img-responsive')]");
    private By Pesquisar = By.xpath("//input[@class='search_query form-control ac_input'][contains(@id,'top')]");
    private By BotaoPesquisar = By.xpath("//button[@type='submit'][contains(.,'Search')]");
    private By Printed = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.right-block > h5 > a");
    private By Tamanho = By.xpath("//select[@name='group_1'][contains(@id,'1')]");
    private By M = By.xpath("//option[@value='2'][contains(.,'M')]");
    private By Verde = By.xpath("//a[contains(@name,'Green')]");
    private By Carrinho = By.xpath("//span[contains(.,'Add to cart')]");
    private By Fechar = By.xpath("//span[contains(@class,'cross')]");
    private By Short = By.xpath("(//a[@class='product-name'][contains(.,'Faded Short Sleeve T-shirts')])[2]");
    private By Azul = By.xpath("//a[contains(@name,'Blue')]");
    private By Blouse = By.xpath("(//a[@class='product-name'][contains(.,'Blouse')])[2]");
    private By BotaoMais = By.xpath("//i[contains(@class,'icon-plus')]");
    private By Checkout = By.xpath("//span[contains(.,'Proceed to checkout')]");
    private By Checout2 = By.xpath("(//span[contains(.,'Proceed to checkout')])[2]");
    private By Terms = By.xpath("//input[contains(@type,'checkbox')]");
    private By PayBank = By.xpath("//a[@class='bankwire'][contains(.,'Pay by bank wire (order processing will be longer)')]");
    private By Confirmar = By.xpath("//span[contains(.,'I confirm my order')]");
    private By Confirmacao = By.xpath("//h1[@class='page-heading'][contains(.,'Order confirmation')]");
    private By Continuar = By.xpath("(//span[contains(.,'Continue shopping')])[2]");
    private By Dress = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a");
    private By Qtd = By.xpath("//input[@type='text'][contains(@id,'wanted')]");

    private By Summary = By.xpath("//span[contains(.,'01. Summary')]");

    private By Total = By.xpath("(//span[contains(.,'Total')])[2]");

    private By Banco = By.xpath("//a[@class='bankwire'][contains(.,'Pay by bank wire (order processing will be longer)')]");

    private By ConfirmarOrder = By.xpath("//span[contains(.,'I confirm my order')]");

    public By getTotal() {
        return Total;
    }

    public By getBanco() {
        return Banco;
    }

    public By getConfirmarOrder() {
        return ConfirmarOrder;
    }

    public By getSummary() {
        return Summary;
    }

    public By getQtd() {
        return Qtd;
    }

    public By getDress() {
        return Dress;
    }

    public By getContinuar() {
        return Continuar;
    }

    public By getPrinted() {
        return Printed;
    }

    public By getBotaoPesquisar() {
        return BotaoPesquisar;
    }

    public By getM() {
        return M;
    }

    public By getConfirmacao() {
        return Confirmacao;
    }

    public By getLogo() {
        return Logo;
    }

    public By getPesquisar() {
        return Pesquisar;
    }




    public By getTamanho() {
        return Tamanho;
    }

    public By getVerde() {
        return Verde;
    }

    public By getCarrinho() {
        return Carrinho;
    }

    public By getFechar() {
        return Fechar;
    }

    public By getShort() {
        return Short;
    }

    public By getAzul() {
        return Azul;
    }

    public By getBlouse() {
        return Blouse;
    }

    public By getBotaoMais() {
        return BotaoMais;
    }

    public By getCheckout() {
        return Checkout;
    }

    public By getChecout2() {
        return Checout2;
    }

    public By getTerms() {
        return Terms;
    }

    public By getPayBank() {
        return PayBank;
    }

    public By getConfirmar() {
        return Confirmar;
    }
}
