package framework.stepdefinitions;

import framework.pages.EbebekPage;
import framework.utilities.ConfigReader;
import framework.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EbebekStepDefinitions {
    EbebekPage ebebekPage=new EbebekPage();

    @When("kullanici ebebek sayfasina gider")
    public void kullanici_ebebek_sayfasina_gider(){
        Driver.getDriver().get(ConfigReader.getProperty("ebebekUrl"));
        throw new io.cucumber.java.PendingException();
    }
    @When("biberon icin arama yapar")
    public void biberon_icin_arama_yapar(){
        ebebekPage.aramaKutusu.sendKeys("biberon"+ Keys.ENTER);
        throw new io.cucumber.java.PendingException();
    }
    @Then("sonucun biberon icerdigini test eder")
    public void sonucun_biberon_icerdigini_test_eder(){
        Assert.assertTrue(ebebekPage.sonucYazisiElementi.getText().contains("biberon"));
        throw new io.cucumber.java.PendingException();
    }
    @Given("urun linkine tikla")
    public void urun_linkine_tikla(){
        ebebekPage.productLink.click();
    }
    @And("sepete ekle butonuna tikla")
    public void sepete_ekle_butonuna_tikla(){
        ebebekPage.ekleButton.click();
    }
    @And("sepeti gor butonuna tikla")
    public void sepeti_gor_butonuna_tikla(){
        ebebekPage.sepetiGorButton.click();
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
        throw new io.cucumber.java.PendingException();
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {

        ebebekPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);
    }

    @Then("sonucun {string} icerdigini test eder")
    public void sonucunIcerdiginiTestEder(String arananKelime) {

        Assert.assertTrue(ebebekPage.sonucYazisiElementi.getText().contains(arananKelime));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

}
