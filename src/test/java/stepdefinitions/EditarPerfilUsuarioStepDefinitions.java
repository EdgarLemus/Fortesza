package stepdefinitions;

import java.io.IOException;

import cucumber.api.java.*;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.IniciarSesion;
import utils.WebDriverFactory;

public class EditarPerfilUsuarioStepDefinitions {

	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^que un usuario se encuentra en la pagina$")
	public void queUnUsuarioSeEncuentraEnLaPagina() {
		OnStage.theActorCalled("").can(BrowseTheWeb.with(WebDriverFactory.goToWeb("https://staging.fortesza.com/login"))); 
	}

	@When("^realiza el inicio de sesion$")
	public void realizaElInicioDeSesion() {
	    OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.enLaPagina());
	}

	@When("^realiza la actualizacion de su informacion de perfil$")
	public void realizaLaActualizaciNDeSuInformacionDePerfil() {
	    
	}

	@Then("^se actualiza la informacion del perfil del usuario$")
	public void seActualizaLaInformaciNDelPerfilDelUsuario() {
	    
	}
}
