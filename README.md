# Fortesza

La estructura del codigo fue realizada con Screenplay de la siguiente forma:
<table>
<tr>
  <th>Tasks</th>
  <td>
    <h6>Contiene todas las tareas que se ejecutaran en la automatizacion</h6>
  </td>
</tr>
  <tr>
  <th>User Interface</th>
  <td>
    <h6>Contiene todos los elementos de la interface usuario mapeados en la pagina</h6>
  </td>
</tr>
  <tr>
  <th>Utils</th>
  <td>
    <h6>Contiene todos los drivers de los navegadores</h6>
  </td>
</tr>
  <tr>
  <th>Runners</th>
  <td>
    <h6>Contiene todos los ejecutores de las pruebas automatizadas</h6>
  </td>
</tr>
  <tr>
  <th>Steps Definitions</th>
  <td>
    <h6>Contiene todos los pasos de la ejecucion de cada prueba automatizada</h6>
  </td>
</tr>
  <tr>
  <th>Features</th>
  <td>
    <h6>Contiene todos los esenarios codificados en lenguaje Gherking</h6>
  </td>
</tr>
</table>

#### Tasks

Una Task se refiere a una acción específica que un actor (usuario o sistema) puede realizar en el sistema que se está probando. Una Task puede ser cualquier tipo de acción, desde hacer clic en un botón hasta ingresar datos en un campo de texto.
Este proyecto contiene las siguiente tasks:

##### -IniciarSesion
##### -RegistrarUsuario
##### -RegistroSinContrasena
##### -RegistroSinCorreoElectronico
##### -RegistroSinTerminosCondiciones
##### -RegistroUsuarioExistente

#### User Interface
El User Interface (UI) se refiere a la capa visible del sistema que se está probando, es decir, la interfaz que los usuarios finales utilizarán para interactuar con el sistema. La UI incluye elementos como botones, campos de texto, menús, ventanas, etc.
Este proyecto contiene las siguientes user interfaces:

##### -InicioSesionUsuarioUi
##### -RegistroUsuarioUi

##### Utils
Las Utils (abreviatura de "Utilities") son funciones o métodos que se utilizan para realizar tareas comunes que no están directamente relacionadas con la interacción con la interfaz de usuario, pero que son necesarias para llevar a cabo las Tasks.
Este proyecto contiene las siguientes utils:

#### -Constantes
#### -Utilidades
#### -WebDriverFactory

##### Runners
Es un componente que ejecuta las pruebas definidas mediante el patrón de diseño Screenplay. Un Runner actúa como un controlador que orquesta la ejecución de las Tasks y las interacciones con la interfaz de usuario.
Este proyecto contiene las siguientes runnners:

#### -EditarPerfilUsuarioRunner
#### -RegistroUsuarioRunner

##### Step Definitions
Las Step Definitions son una parte del framework de pruebas BDD (Behavior-Driven Development) que se utiliza para definir las acciones y el comportamiento de las pruebas. Las Step Definitions se utilizan para traducir las descripciones de las pruebas escritas en lenguaje natural (Gherkin) a código que pueda ser ejecutado por un programa.
Este proyecto contiene las siguientes steps definition:

#### -EditarPerfilUsuarioStepDefinitions
#### -RegistroUsuarioStepDefinitions

##### Features
Es una descripción de un comportamiento específico del sistema que se está desarrollando. La Feature describe la funcionalidad que se está implementando y el comportamiento esperado del sistema en diferentes situaciones.
Este proyecto contiene las siguientes features:

#### -EditarPerfilUsuario.feature
#### -RegistroUsuario.feature


##### Ejecucion
La ejecución de las pruebas de un proyecto de Gradle con Java implica la realización de pruebas automatizadas del código fuente Java utilizando herramientas de prueba como JUnit, TestNG o Spock.

Para ejecutar las pruebas de un proyecto de Gradle con Java, primero se deben definir las pruebas en el archivo de construcción del proyecto (build.gradle). Esto se puede hacer mediante la inclusión de las dependencias de prueba y la definición de las tareas de prueba en el archivo de construcción.

Una vez definidas las pruebas, se puede ejecutar el comando "gradle test" para compilar el código fuente y ejecutar todas las pruebas definidas en el proyecto. Este comando compila el código fuente y ejecuta todas las pruebas definidas, generando un informe de resultados al final de la ejecución.

El informe de resultados indica si las pruebas pasaron o fallaron, así como cualquier información adicional sobre el rendimiento de las pruebas y los errores encontrados.

En resumen, la ejecución de las pruebas de un proyecto de Gradle con Java implica la realización de pruebas automatizadas del código fuente Java utilizando herramientas de prueba como JUnit, TestNG o Spock. Para ejecutar las pruebas, se deben definir las pruebas en el archivo de construcción del proyecto y ejecutar el comando "gradle test". El informe de resultados indica si las pruebas pasaron o fallaron y proporciona información adicional sobre el rendimiento y los errores encontrados.

#### Pasos para ejecución
Al momento de ejecutar este proyecto realizaremos los siguiente paso:

## 1. Clonamos el proyecto con el siguiente comando 'git clone https://github.com/EdgarLemus/Fortesza.git'
## 2. Abrimos un CMD en la raiz del proyecto y ejecutamos el comando 'gradle clean test agregate & cd target/site/serenity & index.html'
