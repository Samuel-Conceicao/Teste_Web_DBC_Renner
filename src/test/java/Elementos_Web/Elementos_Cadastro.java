package Elementos_Web;

import org.openqa.selenium.By;

public class Elementos_Cadastro {
	
	private By login = By.xpath("//a[@class='login'][contains(.,'Sign in')]");
	private By Email = By.xpath("//input[@type='text'][contains(@id,'create')]");
	private By CreateBot = By.xpath("//span[contains(.,'Create an account')]");
	private By Genero = By.xpath("//input[@type='radio'][contains(@id,'gender1')]");
	private By FirstName = By.xpath("//input[contains(@name,'customer_firstname')]");
	private By LastName = By.xpath("//input[contains(@name,'customer_lastname')]");
	private By Password = By.xpath("//input[contains(@type,'password')]");
	private By Date = By.id("days");
	private By Months = By.id("months");
	private By Years = By.name("years");
	private By Newsletter = By.xpath("//input[contains(@name,'newsletter')]");
	private By Receive = By.xpath("//input[contains(@name,'optin')]");
	private By FirstName2 = By.xpath("//input[@name='firstname']");
	private By LastName2 = By.xpath("//input[@name='lastname']");
	private By Company = By.xpath("//input[contains(@name,'company')]");
	private By Address = By.xpath("//input[contains(@name,'address1')]");
	private By City = By.xpath("//input[contains(@name,'city')]");
	private By State = By.xpath("//select[@name='id_state'][contains(@id,'state')]");
	private By Postal = By.xpath("//input[contains(@class,'form-control uniform-input text')]");
	private By Country = By.xpath("//select[@name='id_country'][contains(@id,'country')]");
	private By Mobile = By.xpath("//input[@type='text'][contains(@id,'mobile')]");
	private By Assing = By.xpath("//input[contains(@name,'alias')]");
	private By Register = By.xpath("//span[contains(.,'Register')]");
	private By EmailAcesso = By.xpath("//input[@id='email']");
	private By SenhaLogin = By.xpath("//input[contains(@type,'password')]");
	private By BotaoSignin = By.xpath("//span[contains(.,'Sign in')]");

	public By getBotaoSignin() {
		return BotaoSignin;
	}

	public By getEmailAcesso() {
		return EmailAcesso;
	}

	public By getSenhaLogin() {
		return SenhaLogin;
	}

	public By getLogin() {
		return login;
	}
	public By getEmail() {
		return Email;
	}
	public By getCreateBot() {
		return CreateBot;
	}
	public By getGenero() {
		return Genero;
	}
	public By getFirstName() {
		return FirstName;
	}
	public By getLastName() {
		return LastName;
	}
	public By getPassword() {
		return Password;
	}
	public By getDate() {
		return Date;
	}
	public By getMonths() {
		return Months;
	}
	public By getYears() {
		return Years;
	}
	public By getNewsletter() {
		return Newsletter;
	}
	public By getReceive() {
		return Receive;
	}
	public By getFirstName2() {
		return FirstName2;
	}
	public By getLastName2() {
		return LastName2;
	}

	public By getCompany() {
		return Company;
	}
	public By getAddress() {
		return Address;
	}
	public By getCity() {
		return City;
	}
	public By getState() {
		return State;
	}
	public By getPostal() {
		return Postal;
	}
	public By getCountry() {
		return Country;
	}
	public By getMobile() {
		return Mobile;
	}
	public By getAssing() {
		return Assing;
	}
	public By getRegister() {
		return Register;
	}

}
