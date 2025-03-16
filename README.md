# 🚀 Gestor de Empleados - Aplicación Completa (Angular 19 + Spring Boot + MySQL)
Este es un proyecto completo desarrollado para practicar el desarrollo de aplicaciones full stack con **Angular 19**, **Spring Boot** y **MySQL**. Incluye una API REST para la gestión de empleados y una aplicación frontend para la interacción con los datos.

🔗 **Repositorio de la App (Frontend - Angular 19):** [GitHub - GestorEmpleado_App](https://github.com/pablopl94/GestorEmpleado_App)

🔗 **Repositorio de la API (Backend - Spring Boot + MySQL):** [GitHub - GestorEmpleados_API](https://github.com/pablopl94/GestorEmpleados_API)

---

## 🌟 Características

✅ **Aplicación Full Stack:** Angular 19 (Frontend) + Spring Boot (Backend) + MySQL (Base de datos).  
✅ **CRUD de empleados**: Crear, Leer, Actualizar y Eliminar empleados.  
✅ **Persistencia con MySQL** usando **JPA**.  
✅ **Manejo de excepciones** con `@ControllerAdvice`.  
✅ **Uso de `ResponseEntity`** para respuestas bien estructuradas.  
✅ **Validaciones de datos básicas** en los métodos del servicio.  
✅ **CORS habilitado** para acceso desde el frontend.  

---

## 🛠️ Tecnologías Usadas

- **Angular 19** (Frontend)
- **Java 17**
- **Spring Boot 3** (Spring Web, Spring Data JPA)
- **MySQL** como base de datos
- **Hibernate** para la persistencia
- **Maven** para la gestión de dependencias
- **Postman** para pruebas

---

## 📂 Estructura del Proyecto

```
GestorEmpleado_App/  (Frontend - Angular 19)
GestorEmpleados_API/ (Backend - Spring Boot + MySQL)
```

**Estructura de la API:**
```
GestorEmpleados_API/
│── src/
│   ├── main/
│   │   ├── java/com/gestion/empleados/
│   │   │   ├── controller/    # Controladores de la API
│   │   │   ├── service/       # Lógica de negocio
│   │   │   ├── repository/    # Capa de acceso a datos
│   │   │   ├── entity/        # Entidades JPA
│   │   │   ├── exception/     # Manejo de excepciones
│   │   ├── resources/
│   │   │   ├── application.properties  # Configuración de la base de datos
│── pom.xml  # Archivo de configuración de Maven
│── README.md  # Documentación del proyecto
```

---

## 📆 Instalación y Configuración

### **1️⃣ Clonar los Repositorios**
```bash
git clone https://github.com/pablopl94/GestorEmpleado_App.git
cd GestorEmpleado_App
```
```bash
git clone https://github.com/pablopl94/GestorEmpleados_API.git
cd GestorEmpleados_API
```

### **2️⃣ Configurar Base de Datos (MySQL)**

Ejecuta el siguiente script en tu base de datos MySQL:

```sql
CREATE DATABASE IF NOT EXISTS controlempleados_db;
USE controlempleados_db;

CREATE TABLE empleados (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(150) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

INSERT INTO empleados (nombre, apellidos, email) VALUES
('Carlos', 'Gómez Pérez', 'carlos.gomez@example.com'),
('Laura', 'Fernández Ruiz', 'laura.fernandez@example.com'),
('Miguel', 'Martínez López', 'miguel.martinez@example.com'),
('Ana', 'Sánchez García', 'ana.sanchez@example.com'),
('Javier', 'Díaz Hernández', 'javier.diaz@example.com'),
('María', 'López Torres', 'maria.lopez@example.com'),
('David', 'Gutiérrez Ramos', 'david.gutierrez@example.com'),
('Sandra', 'Ramírez Castro', 'sandra.ramirez@example.com'),
('Pablo', 'Jiménez Morales', 'pablo.jimenez@example.com'),
('Elena', 'Hernández Vega', 'elena.hernandez@example.com');
```

### **3️⃣ Ejecutar la API**
```bash
mvn spring-boot:run
```
La API estará disponible en:  
📍 `http://localhost:8080/api/empleados`

### **4️⃣ Ejecutar el Frontend**
```bash
ng serve
```
La aplicación estará disponible en:  
📍 `http://localhost:4200/`

---

## 🔥 Endpoints de la API

| Método | Endpoint               | Descripción |
|--------|------------------------|-------------|
| `GET`  | `/api/empleados`       | Obtener todos los empleados |
| `GET`  | `/api/empleados/{id}`  | Obtener empleado por ID |
| `POST` | `/api/empleados`       | Crear un nuevo empleado |
| `PUT`  | `/api/empleados/{id}`  | Actualizar un empleado |
| `DELETE` | `/api/empleados/{id}` | Eliminar un empleado |

Ejemplo de **JSON para crear un empleado**:
```json
{
  "nombre": "Juan",
  "apellidos": "Pérez",
  "email": "juan.perez@example.com"
}
```

---

## ⚠️ Manejo de Excepciones

En esta API he practicado el manejo de excepciones con `@ControllerAdvice` para capturar errores comunes y devolver respuestas más claras.

Ejemplo de errores controlados:

| Código | Descripción |
|--------|------------|
| `404 Not Found` | Se lanza cuando un empleado no existe. |
| `400 Bad Request` | Se devuelve cuando hay un error en los datos enviados. |
| `500 Internal Server Error` | Para errores inesperados en el servidor. |

---

## 👨‍💻 Autor
**Pablo Prieto López**  
📧 Contacto: [pablopl94@gmail.com](mailto:pabloprietolopez94@outlook.es)  
🔗 GitHub: [github.com/pablopl94](https://github.com/pablopl94)

---

## 🚀 Conclusión
Este proyecto representa mis primeras pruebas en el desarrollo de aplicaciones completas con **Angular 19 + Spring Boot + MySQL**. Me ha permitido practicar el desarrollo full stack, el manejo de excepciones y la interacción entre frontend y backend. En futuros proyectos, me gustaría mejorar la validación de datos y agregar autenticación y autorización.

