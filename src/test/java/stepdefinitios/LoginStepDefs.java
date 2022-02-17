package stepdefinitios;

import pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import java.util.List;
import io.cucumber.java.en.Then;
        import org.junit.Assert;
        import pages.LoginPage;
        import java.util.List;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    //steps

    @Then("kullanicinin Login to your account yazisinin gorunur oldugunu test eder")
    public void kullanicinin_login_to_your_account_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }

    @Then("kullanici dogru email ve sifreyi girer")
    public void kullanici_dogru_email_ve_sifreyi_girer(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }


    @Then("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {

    }

    @Then("kullanici oturum actigini test eder\\(Logged in as username)")
    public void kullanici_oturum_actigini_test_eder_logged_in_as_username() {

    }

    @Then("kullanici logout butonuna basar")
    public void kullanici_logout_butonuna_basar() {

    }
}


