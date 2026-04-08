# Evaluación de Entornos: Proyecto de Pruebas con JUnit 5 en VS Code

Este proyecto de Java es un ejemplo básico para configurar y trabajar con un entorno de desarrollo en **Visual Studio Code** utilizando **Maven** e implementando pruebas unitarias con **JUnit 5**.

## 🚀 Objetivo

El propósito principal del proyecto es mostrar cómo:
- Configurar un entorno de Java en VS Code usando Maven.
- Gestionar dependencias a través del archivo `pom.xml`.
- Implementar una clase sencilla (`CalculadoraRiesgo`) aplicando lógica básica de negocio.
- Diseñar y ejecutar pruebas unitarias sobre dicha clase usando JUnit 5 (Júpiter).

## 📁 Estructura del Proyecto

```text
test-vscode/
├── pom.xml                   # Archivo de configuración y dependencias de Maven
└── src/
    ├── main/
    │   └── java/
    │       └── entornos/
    │           └── CalculadoraRiesgo.java       # Clase con la lógica de negocio
    └── test/
        └── java/
            └── entornos/
                └── CalculadoraRiesgoTest.java   # Casos de prueba (JUnit 5)
```

## 🛠️ Tecnologías y Herramientas

- **Java**: Lenguaje de programación principal (Configurado para la versión 25 en `pom.xml`).
- **Maven**: Herramienta de gestión y construcción del proyecto.
- **JUnit 5 (Jupiter)**: Integrado en versión `5.10.0` para las pruebas unitarias.
- **IDE**: Visual Studio Code equipado con Extension Pack for Java.

## 📝 Detalles de la Implementación

### `CalculadoraRiesgo.java`
Esta clase cuenta con un método `evaluarEdad(int edad)` que clasifica a una persona en una categoría en función de su edad, aplicando las siguientes reglas:
- Edad menor a `0` o mayor a `120`: Devuelve `"Error"`
- Edad menor a `18`: Devuelve `"Joven"`
- Edad entre `18` y `65` (ambos inclusive): Devuelve `"Adulto"`
- Edad mayor a `65`: Devuelve `"Senior"`

### `CalculadoraRiesgoTest.java`
Esta clase incluye diversas pruebas que validan los comportamientos y valores límite del método:
- **`testEdadNegativa()`**: Comprueba que retorne "Error".
- **`testAdulto()`**, **`testSenior()`**: Comprueba el funcionamiento con edades medias.
- **`testLimiteDe18()`** y **`testLimiteJoven()`**: Comprueba los casos extremos o fronterizos, garantizando el comportamiento al pasar de `17` a `18` años.

## ▶️ Cómo ejecutar el proyecto y las pruebas

Existen varias formas de ejecutar las pruebas unitarias en Visual Studio Code:

1. **Usando el Testing Explorer de VS Code**:
   Accede a la pestaña correspondiente en la barra lateral izquierda (icono del matraz). Desde allí puedes ejecutar todas las pruebas, observar qué tests pasan o fallan e iniciar un proceso de Debug.

2. **A través de CodeLens en el Editor**:
   Abre el archivo `CalculadoraRiesgoTest.java`. Aparecerán las opciones `Run Test` y `Debug Test` flotando directamente sobre las anotaciones de `@Test`.

3. **Mediante la Terminal integrada con Maven**:
   Desde la ruta `test-vscode`, ejecuta el comando estándar de Maven con el siguiente código:
   ```bash
   mvn clean test
   ```
   Esta instrucción ejecutará el reporte completo de las pruebas.

   <img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/49abc6b4-c904-4433-802b-b97694f661b5" />

