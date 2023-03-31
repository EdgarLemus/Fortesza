package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import userinterface.RegistroUsuarioUi;
import utils.Utilidades;

public class RegistroSinCorreoElectronico implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(Utilidades.generatePassword()).into(RegistroUsuarioUi.TXT_CONTRASENA),				
				JavaScriptClick.on(RegistroUsuarioUi.BTN_TERMINO_CONDICIONES),
				JavaScriptClick.on(RegistroUsuarioUi.BTN_REGISTRAR));
	}

	public static RegistroSinCorreoElectronico enLaPagina() {
		return Instrumented.instanceOf(RegistroSinCorreoElectronico.class).withProperties();
	}
}
