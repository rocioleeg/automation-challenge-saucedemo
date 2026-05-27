# Automation Challenge - SauceDemo

## Descripción

Framework de automatización desarrollado para validar funcionalidades de:

- Login
- Agregado de productos al carrito
- Validación API Mercado Libre

Tecnologías utilizadas:
- Java 17
- Selenium WebDriver
- TestNG
- Maven
- RestAssured
- Extent Reports

---

# Estructura del proyecto

```bash
src
 ├── main
 │    ├── java
 │    │     ├── api
 │    │     ├── core
 │    │     ├── pages
 │    │     └── utils
 │
 └── test
      ├── java
      │     ├── core
      │     ├── testsUi
      │     └── testsApi
```

---

# Casos automatizados

## UI
- Login válido
- Login inválido
- Agregado de producto al carrito
- Remoción de producto del carrito

## API
- Validación endpoint Mercado Libre departments

---

# Ejecución de pruebas

## Ejecutar todos los tests

```bash
mvn clean test
```

## Ejecutar test específico

```bash
mvn test -Dtest=LoginTest
```

```bash
mvn test -Dtest=MercadoLibreApiTest
```

## Nota

El test `shouldAddProductToCart` fue configurado para fallar intencionalmente con el objetivo de validar:

- generación de reportes
- captura automática de screenshots
- visualización de errores
---

# Reportes

Luego de la ejecución se genera:

```bash
reports/AutomationReport.html
```

---

# Screenshots

Las capturas de pantalla se generan automáticamente en caso de falla:

```bash
screenshots/
```

---

# Navegadores

Actualmente configurado para:
- Google Chrome

---

# Autor

Rocio