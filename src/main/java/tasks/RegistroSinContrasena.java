package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import userinterface.RegistroUsuarioUi;
import utils.Utilidades;

public class RegistroSinContrasena implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(Utilidades.generateRandomEmail()).into(RegistroUsuarioUi.TXT_CORREO_ELECTRONICO),
				JavaScriptClick.on(RegistroUsuarioUi.BTN_TERMINO_CONDICIONES),
				JavaScriptClick.on(RegistroUsuarioUi.BTN_REGISTRAR));
	}

	public static RegistroSinContrasena enLaPagina() {
		return Instrumented.instanceOf(RegistroSinContrasena.class).withProperties();
	}
}
