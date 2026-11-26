# Taller POO • Grupo 1 (3 Integrantes): Sistema de Gestión Académica

**Dominio:** Actas de calificaciones y certificados de matrícula desacoplados mediante interfaces (`Exportable` y `Persistible`).

## Flujo Obligatorio en GitHub (60 min)
1. Subir esta plantilla a `main` y crear **3 Issues** (uno por integrante).
2. Cada alumno crea su rama desde `main`: `git checkout -b feat/<nombre-apellido>`.
3. Completar únicamente los `TODO` de su Issue, hacer `push` y abrir un **Pull Request** con `Closes #<num>`.
4. Revisar cruzadamente y fusionar todo en `main` antes de los 10 minutos de sustentación.

## Reparto de Issues
- **Issue #1 (Integrante 1):** Completar `ActaCalificaciones.java` implementando `Exportable` y `Persistible`.
- **Issue #2 (Integrante 2):** Completar `CertificadoMatricula.java` implementando `Exportable` y `Persistible`.
- **Issue #3 (Integrante 3):** Completar `ServicioAcademico.java` (desacoplado por interfaces) y las pruebas integradas en `Main.java`.

## Compilación y Ejecución

```bash
javac -d out src/interfaces/*.java src/modelos/*.java src/servicios/*.java src/app/Main.java
java -cp out app.Main
```
