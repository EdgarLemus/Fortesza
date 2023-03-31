package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import userinterface.InicioSesionUsuarioUi;
import userinterface.RegistroUsuarioUi;

public class IniciarSesion implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue("erasmotorres09@gmail.com").into(RegistroUsuarioUi.TXT_CORREO_ELECTRONICO),
				Enter.theValue("esFortesza21*").into(RegistroUsuarioUi.TXT_CONTRASENA),
				JavaScriptClick.on(InicioSesionUsuarioUi.BTN_INICIAR_SESION));
	}

	public static IniciarSesion enLaPagina() {
		return Instrumented.instanceOf(IniciarSesion.class).withProperties();
	}
}
