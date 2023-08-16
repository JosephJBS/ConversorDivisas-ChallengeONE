![Version](https://img.shields.io/badge/version-1.0.0-blue.svg)
![License](https://img.shields.io/badge/license-MIT-green.svg)
![Code Size](https://img.shields.io/github/languages/code-size/JosephJBS/ConversorDivisas-ChallengeONE)
![Language](https://img.shields.io/badge/language-Java-orange.svg)
![Maven Version](https://img.shields.io/badge/maven-3.8.3-blue.svg)



# ConversorDivisas-ChallengeONE

Este es un sencillo conversor de divisas implementado en Java que te permite convertir entre diferentes monedas utilizando las tasas de cambio actuales. El programa utiliza una API de tasas de cambio en línea para obtener los datos de conversión en tiempo real.

## Funcionalidades

- Convierte entre diferentes monedas, incluyendo USD, EUR, JPY, GBP, etc.
- Utiliza una API en línea para obtener las tasas de cambio más recientes.
- Interfaz gráfica de usuario (GUI) intuitiva para una fácil interacción.

## Capturas de Pantalla

![Conversor](https://github.com/JosephJBS/ConversorDivisas-ChallengeONE/assets/83741509/e27633e4-ea98-482b-afa5-a872d4b9d21e)

*Captura de Pantalla 1: Interfaz principal del conversor de divisas.*

## Cómo Usar

1. Descarga o clona este repositorio a tu máquina local.
 <div>
  <pre>
    <code id="codigo-a-copiar">
      git clone https://github.com/JosephJBS/ConversorDivisas-ChallengeONE.git
    </code>
  </pre>
  <button class="btn" data-clipboard-target="#codigo-a-copiar"></button>
</div>

2. Abre el proyecto en tu entorno de desarrollo (por ejemplo, IntelliJ IDEA o Eclipse).
3. Ejecuta la aplicación y verás la interfaz del conversor de divisas.
4. Selecciona la moneda de origen y la moneda de destino de los menús desplegables.
   ![MostrarDivisas](https://github.com/JosephJBS/ConversorDivisas-ChallengeONE/assets/83741509/84e83f4b-0c29-4b8e-b3ce-3c8b308bcdd7)
5. Ingresa la cantidad que deseas convertir en el campo de entrada.
   ![MontoIngresado](https://github.com/JosephJBS/ConversorDivisas-ChallengeONE/assets/83741509/f0f5a505-fb5d-4c82-a491-d52956f2a122)
6. Haz clic en el botón "Convertir" y el resultado de la conversión se mostrará en pantalla.
   ![DivisaFinal](https://github.com/JosephJBS/ConversorDivisas-ChallengeONE/assets/83741509/5ef099d7-c350-4c9f-82c6-5b93f63a822a)

## Dependencias

- Java 8 o superior
- Biblioteca externa para realizar solicitudes HTTP (por ejemplo, Apache HttpClient)

## Contribución

¡Tus contribuciones son bienvenidas! Si encuentras errores, mejoras o nuevas funcionalidades que te gustaría agregar, no dudes en hacer un fork de este repositorio y enviar un pull request.


## Observaciones
1. Se realizo otro conversor relacionado a las temperaturas (Celsius (C), Fahrenheit (F), Kelvin (K) y Rankine (R)). Para este solo se usaron las formulas de conversión.
![convTemp](https://github.com/JosephJBS/ConversorDivisas-ChallengeONE/assets/83741509/7121cb76-4d40-464e-8895-a1b8c486bfa0)
2. La página de donde se consume la API es:
![api](https://github.com/JosephJBS/ConversorDivisas-ChallengeONE/assets/83741509/b3962179-a86e-4eb6-97c4-b24991afe5cb)
https://www.exchangerate-api.com
4. El número de consultas tiene un límite para la versión gratuita.
![subscipcion](https://github.com/JosephJBS/ConversorDivisas-ChallengeONE/assets/83741509/96ae8692-42ba-45ec-9ff4-5ade027a0887)
---

Proyecto desarrollado por [Dev JBS](https://github.com/JosephJBS).
