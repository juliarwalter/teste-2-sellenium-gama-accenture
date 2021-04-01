package io.cucumber.danilo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ValidadorCpfSteps{

    public ValidadorCpfSteps(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    browser = new ChromeDriver();

    }

    public WebDriver browser;

    @Quando("eu acesso o site tornese um programador")
    public void eu_acesso_o_site_tornese_um_programador() {
        browser.get("https://www.torneseumprogramador.com.br/aulas/front-end");
    }
    
    @Quando("digito no campo de busca a palavra {string}")
    public void digito_no_campo_de_busca_a_palavra(String string) {
        WebElement input = browser.findElement( By.cssSelector("input[name = 'q']"));
        input.sendKeys(string);
    }

    @Quando("clico no botao enviar")
    public void clico_no_botao_enviar() {
        WebElement input = browser.findElement( By.cssSelector(".btn-pesquisa") );
	    input.click();

    }
    
    @Entao("eu devo ver o resultado na busca")
    public void eu_devo_ver_entao_devo_ver_o_resultado_na_busca() {
        assertNotNull(browser.findElements( By.cssSelector(".div-card-aulas")) );
        browser.quit();
    }
   
}