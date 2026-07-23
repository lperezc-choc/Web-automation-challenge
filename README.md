
#🚀 Web Automation Challenge

### 📋 Descripción

Proyecto de automatización web desarrollado como solución al reto técnico utilizando **Serenity BDD, Screenplay Pattern y Cucumber**.

La automatización se realizó sobre SauceDemo, implementando escenarios de autenticación y compra de productos siguiendo buenas prácticas de automatización y Clean Code.

### 🛠 Tecnologías

Java 11
Serenity BDD
Screenplay Pattern
Selenium WebDriver
Cucumber
Gradle
WebDriverManager
Lombok

### 📁 Estructura del Proyecto

```text
Web-automation-challenge
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── co
│   │               └── choucair
│   │                   ├── interactions
│   │                   ├── models
│   │                   ├── questions
│   │                   ├── tasks
│   │                   └── userinterfaces
│   └── test
│       ├── java
│       │   └── com
│       │       └── co
│       │           └── choucair
│       │               ├── runners
│       │               └── stepdefinitions
│       └── resources
│           ├── features
│           └── serenity.conf
├── build.gradle
├── gradlew
├── settings.gradle
└── README.md
```

### Funcionalidades Automatizadas

1. Login
- Login exitoso
- Validación de acceso al inventario
  
2. Compra de producto
- Selección de producto
- Agregar al carrito
- Checkout
- Confirmación de compra

### Historial de desarrollo

El proyecto fue construido mediante commits incrementales para reflejar el proceso de desarrollo:

- Configuración inicial del proyecto
- Mejora de configuración
- Creación de Page Objects
- Implementación de Interactions
- Implementación del flujo de compra
- Creación de Questions
- Automatización del escenario completo

### Visualización de Reportes
```bash
# Generar y abrir reporte
gradle aggregate
target/site/serenity/index.html
```

## 🔄 Integración CI/CD

### Jenkins Pipeline Example
```groovy
pipeline {
    agent any
    stages {
        stage('Test') {
            parallel {
                stage('Chrome Tests') {
                    steps {
                        sh 'gradle test -Dwebdriver.driver=chrome'
                    }
                }
                stage('Firefox Tests') {
                    steps {
                        sh 'gradle test -Dwebdriver.driver=firefox'
                    }
                }
            }
        }
        stage('Report') {
            steps {
                sh 'gradle aggregate'
                publishHTML(target: [
                    reportDir: 'target/site/serenity',
                    reportFiles: 'index.html',
                    reportName: 'Serenity Report'
                ])
            }
        }
    }
}
```

## 📝 Mejores Prácticas

1. **Page Object Pattern**
   - Centralizar los localizadores en clases Page Object para facilitar el mantenimiento.

2. **Data-Driven Testing**
   - Aprovechar los `Examples` de Cucumber para ejecutar escenarios con múltiples conjuntos de datos.

3. **Estrategia de Tags**
   - Organizar las pruebas mediante etiquetas (`@smoke`, `@regression`, `@login`, etc.) para facilitar su ejecución.

4. **Esperas Explícitas**
   - Utilizar `WaitUntil` o `ExpectedConditions` en lugar de `Thread.sleep()`.

5. **Clean Code**
   - Aplicar principios de código limpio, nombres descriptivos y responsabilidad única por clase.

6. **Control de Versiones**
   - Realizar commits pequeños y frecuentes con mensajes claros y descriptivos.

7. **Independencia de las Pruebas**
   - Cada escenario debe poder ejecutarse de manera independiente.

8. **Evidencias de Ejecución**
   - Capturar screenshots y generar reportes para facilitar el análisis de fallos.

9. **Integración Continua (CI/CD)**
   - Integrar la automatización con herramientas como Azure DevOps o Jenkins para ejecutar pruebas automáticamente.

10. **Calidad de Código**
    - Analizar el proyecto con SonarQube para detectar vulnerabilidades, bugs y problemas de mantenibilidad.

11. **Continuous Testing**
    - Ejecutar las pruebas de forma continua durante el ciclo de desarrollo para obtener retroalimentación temprana.

12. **Métricas del Proyecto**
    - Definir indicadores de éxito (KPI) como cobertura, tasa de éxito, tiempo de ejecución y defectos detectados antes de iniciar la automatización.

##Autor

Luisa Pérez
Analista Móvil

GitHub: https://github.com/lperezc-choc

---

⚡ **Happy Testing!** ⚡
