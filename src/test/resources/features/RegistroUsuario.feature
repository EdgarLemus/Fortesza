#Author: Edgar Lemus
Feature: Registro de inversionista

  Background: 
    Given que un usuario desea registrarse en el sitio web de Fortesza

  Scenario: Registro exitoso
    When completa los campos obligatorios para el registro
    Then el usuario podra observar el mensaje de creacion de usuario

  Scenario: Error de validacion de campo contrasena
    When completa solamente el campo correo electronico
    Then se muestra un mensaje de error indicando que falto completar el campo contrasena

  Scenario: Error de validacion de campo correo electronico
    When completa solamente el campo de la contrasena
    Then se muestra un mensaje de error indicando que falto completar el campo correo electronico

  Scenario: Error de validacion de los terminos y condiciones
    When no los terminos y condiciones de la pagina
    Then se muestra un mensaje de error indicando que falto aceptar los terminos y condiciones

  Scenario: Correo electronico existente
    When se registra un correo electronico que se encuentra registrado en la plataforma
    Then se muestra un mensaje de error indicando que la contrasena es debil
