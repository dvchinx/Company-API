# 🏢 Company-API  

**API REST para la gestión de empleados en la base de datos "Company"**  

Company-API es un servicio REST desarrollado en Java con **Spring Boot** que permite interactuar con la base de datos **MySQL** mediante operaciones CRUD en la tabla `Employees`. Este proyecto es ideal para aprender y practicar con tecnologías modernas de backend.

---

## 🚀 Características  
- **Framework:** Spring Boot.  
- **ORM:** Spring Data JPA para la gestión de entidades.  
- **Dependencias:** Lombok para reducir el código boilerplate y JDBC para interacciones personalizadas con la base de datos.  
- **Base de datos:** MySQL, tabla `Employees` con los campos:  
  - `Cedula`  
  - `Nombre`  
  - `Apellido`  
  - `Rol`  
  - `Correo`  
- **Entorno local:** Diseñado para funcionar en máquinas locales.  

---

## 🛠️ Tecnologías utilizadas  
- **Java 17**  
- **Spring Boot** (versión 3.1.0 o superior)  
- **Spring Data JPA**  
- **Lombok**  
- **JDBC**  
- **MySQL**  
- **IntelliJ IDEA** como IDE, con ayuda de **TabNine**.  

---

## 🛡️ Endpoints disponibles  

| **Método** | **Endpoint**         | **Descripción**                              |
|------------|----------------------|----------------------------------------------|
| `GET`      | `/getAll`            | Obtiene todos los empleados.                 |
| `GET`      | `/getById/{cedula}`  | Obtiene un empleado por su cédula.           |
| `POST`     | `/save`              | Guarda un nuevo empleado o actualiza uno existente. |
| `DELETE`   | `/delete/{cedula}`       | Elimina un empleado por su ID.           |


---

## 📋 Requisitos previos  
1. **JDK 17** instalado.  
2. **MySQL** configurado y en ejecución.  
3. Base de datos `Company` creada con la tabla `Employees`:  

```sql
CREATE DATABASE Company;

USE Company;

CREATE TABLE Employees (
    Cedula VARCHAR(50) PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellido VARCHAR(100) NOT NULL,
    Rol VARCHAR(50) NOT NULL,
    Correo VARCHAR(100) UNIQUE NOT NULL
);
