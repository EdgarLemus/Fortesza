package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuarioUi {

	public static final Target TXT_CORREO_ELECTRONICO = Target.the("").locatedBy("//input[@type='email']");
	public static final Target TXT_CONTRASENA = Target.the("").locatedBy("//input[@type='password']");
	public static final Target BTN_TERMINO_CONDICIONES = Target.the("").locatedBy("//input[@type='checkbox']");
	public static final Target BTN_REGISTRAR = Target.the("").locatedBy("//button[@id='btn-register-user']");
	public static final Target TXT_VALIDACION_REGISTRO = Target.the("").locatedBy("//span[contains(text(),'Usuario')]");
	public static final Target TXT_VALIDACION_CAMPO = Target.the("").locatedBy("//mat-error[text()='*Este campo es obligatorio']");
	public static final Target TXT_VALIDACION_CONDICIONES_TERMINOS = Target.the("").locatedBy("//div[contains(text(),'términos y condiciones')]");
	public static final Target TXT_VALIDACION_USUARIO_EXISTENTE = Target.the("").locatedBy("//div[contains(text(),'correo ya se encuentra registrado')]");
}
