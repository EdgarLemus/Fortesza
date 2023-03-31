package stepdefinitions;

import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.RegistrarUsuario;
import tasks.RegistroSinContrasena;
import tasks.RegistroSinCorreoElectronico;
import tasks.RegistroSinTerminosCondiciones;
import tasks.RegistroUsuarioExistente;
import userinterface.RegistroUsuarioUi;
import utils.WebDriverFactory;

public class RegistroUsuarioStepDefinitions {
	
	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("^que un usuario desea registrarse en el sitio web de Fortesza$")
	public void queUnUsuarioDeseaRegistrarseEnElSitioWebDeFortesza() {
		OnStage.theActorCalled("").can(BrowseTheWeb.with(WebDriverFactory.goToWeb("https://staging.fortesza.com/register")));
	}

	@When("^completa los campos obligatorios para el registro$")
	public void completaLosCamposObligatoriosParaElRegistro() {
	   OnStage.theActorInTheSpotlight().attemptsTo(RegistrarUsuario.enLaPagina());
	}

	@Then("^el usuario podra observar el mensaje de creacion de usuario$")
	public void elUsuarioPodraObservarElMensajeDeCreacionDeUsuario() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(RegistroUsuarioUi.TXT_VALIDACION_REGISTRO), WebElementStateMatchers.isVisible()));
	}

	@When("^completa solamente el campo correo electronico$")
	public void completaSolamenteElCampoCorreoElectronico() {
		OnStage.theActorInTheSpotlight().attemptsTo(RegistroSinContrasena.enLaPagina());
	}

	@Then("^se muestra un mensaje de error indicando que falto completar el campo contrasena$")
	public void seMuestraUnMensajeDeErrorIndicandoQueFaltoCompletarElCampoContraseA() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(RegistroUsuarioUi.TXT_VALIDACION_CAMPO), WebElementStateMatchers.isVisible()));
	}

	@When("^completa solamente el campo de la contrasena$")
	public void completaSolamenteElCampoDeLaContraseA() {
		OnStage.theActorInTheSpotlight().attemptsTo(RegistroSinCorreoElectronico.enLaPagina());
	}

	@Then("^se muestra un mensaje de error indicando que falto completar el campo correo electronico$")
	public void seMuestraUnMensajeDeErrorIndicandoQueFaltoCompletarElCampoCorreoElectronico() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(RegistroUsuarioUi.TXT_VALIDACION_CAMPO), WebElementStateMatchers.isVisible()));
	}

	@When("^no los terminos y condiciones de la pagina$")
	public void noLosTerminosYCondicionesDeLaPagina() {
		OnStage.theActorInTheSpotlight().attemptsTo(RegistroSinTerminosCondiciones.enLaPagina());
	}

	@Then("^se muestra un mensaje de error indicando que falto aceptar los terminos y condiciones$")
	public void seMuestraUnMensajeDeErrorIndicandoQueFaltoAceptarLosTerminosYCondiciones() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(RegistroUsuarioUi.TXT_VALIDACION_CONDICIONES_TERMINOS), WebElementStateMatchers.isVisible()));
	}

	@When("^se registra un correo electronico que se encuentra registrado en la plataforma$")
	public void seRegistraUnCorreoElectronicoQueSeEncuentraRegistradoEnLaPlataforma() {
		OnStage.theActorInTheSpotlight().attemptsTo(RegistroUsuarioExistente.enLaPagina());
	}

	@Then("^se muestra un mensaje de error indicando que la contrasena es debil$")
	public void seMuestraUnMensajeDeErrorIndicandoQueLaContraseAEsDebil() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(RegistroUsuarioUi.TXT_VALIDACION_USUARIO_EXISTENTE), WebElementStateMatchers.isVisible()));
	}
	
	@After
	public void after() {
		
	}
}
