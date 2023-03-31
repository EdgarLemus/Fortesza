package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import userinterface.RegistroUsuarioUi;
import utils.Utilidades;

public class RegistroUsuarioExistente implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue("erasmotorres09@gmail.com").into(RegistroUsuarioUi.TXT_CORREO_ELECTRONICO),
				Enter.theValue(Utilidades.generatePassword()).into(RegistroUsuarioUi.TXT_CONTRASENA),				
				JavaScriptClick.on(RegistroUsuarioUi.BTN_TERMINO_CONDICIONES),
				JavaScriptClick.on(RegistroUsuarioUi.BTN_REGISTRAR));
	}
	
	public static RegistroUsuarioExistente enLaPagina() {
		return Instrumented.instanceOf(RegistroUsuarioExistente.class).withProperties();
	}

}
