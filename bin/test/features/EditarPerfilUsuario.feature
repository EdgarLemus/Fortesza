#Author: Edgar Lemus
Feature: Editar perfil de usuario
  
  Como usuario
  Quiero editar mis datos de perfil
  Para mantener mi información actualizada

  Background: 
    Given que un usuario se encuentra en la pagina
    When realiza el inicio de sesion

  Scenario: Iniciar sesion y editar informacion del perfil
    When realiza la actualizacion de su informacion de perfil
    Then se actualiza la informacion del perfil del usuario
