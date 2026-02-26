# Demo Maven Webapp — Java Servlets

Proyecto de demostración que muestra el uso básico de **Jakarta Servlets** con Maven, cubriendo solicitudes HTTP `GET` y `POST` desde un formulario JSP.

---

## 📋 Descripción

Esta aplicación web ilustra cómo:
- Crear un Servlet con `HttpServlet` usando la anotación `@WebServlet`
- Manejar peticiones **GET** (parámetros por URL)
- Manejar peticiones **POST** (parámetros por cuerpo del formulario)
- Generar respuestas HTML dinámicas desde Java
- Usar una página JSP como vista principal con formularios

---

## 🛠️ Tecnologías utilizadas

| Tecnología         | Versión |
|--------------------|---------|
| Java               | 21      |
| Jakarta Servlet    | 6.0.0   |
| Maven              | 3.x     |
| JSP                | 2.x     |
| JUnit (pruebas)    | 4.11    |

---

## 📁 Estructura del proyecto

```
Demo/
├── src/
│   └── main/
│       ├── java/
│       │   ├── HelloServlet.java          # Servlet principal (GET y POST)
│       │   └── webapp/
│       │       ├── index.jsp              # Vista principal con formularios
│       │       └── WEB-INF/
│       │           └── web.xml            # Descriptor de despliegue
│       └── resources/
├── pom.xml                                # Configuración Maven
└── README.md
```

---

## 🚀 Cómo ejecutar el proyecto

### Prerrequisitos

- Java JDK 21 instalado
- Apache Maven 3.x instalado
- Un servidor de aplicaciones compatible con Jakarta EE 10 (ej. **Apache Tomcat 10+**)

### Pasos

1. **Clonar o descargar** el repositorio.

2. **Compilar y empaquetar** el proyecto con Maven:
   ```bash
   mvn clean package
   ```

3. **Desplegar** el archivo `target/Demo.war` en Tomcat (carpeta `webapps/`).

4. **Acceder** a la aplicación en el navegador:
   ```
   http://localhost:8080/Demo/
   ```

---

## ⚙️ Funcionalidad

### Página principal (`index.jsp`)
Contiene dos formularios:
- **Formulario GET**: envía un nombre como parámetro en la URL.
- **Formulario POST**: envía un mensaje en el cuerpo de la solicitud.

### Servlet (`HelloServlet.java`)

- **`doGet`**: lee el parámetro `nombre` y muestra un saludo personalizado. Si no se envía, muestra "visitante".
- **`doPost`**: lee el parámetro `msg` y muestra el mensaje recibido.

---

## 📌 Endpoints

| Método | URL            | Descripción                        |
|--------|----------------|------------------------------------|
| GET    | `/?nombre=Ana` | Muestra saludo con el nombre dado  |
| POST   | `/`            | Muestra el mensaje enviado         |

---

## 📝 Notas

- El proyecto usa la API `jakarta.servlet` (Jakarta EE 10), **no** `javax.servlet`. Asegúrate de usar **Tomcat 10** o superior.
- La codificación de caracteres está configurada en `UTF-8` para soporte de tildes y caracteres especiales en español.

---

## 👩‍💻 Autor

Proyecto de demostración para el curso de desarrollo Java Backend.