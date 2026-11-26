package app;

import modelos.ActaCalificaciones;
import modelos.CertificadoMatricula;
import servicios.ServicioAcademico;

public class Main {
    public static void main(String[] args) {
        ServicioAcademico servicio = new ServicioAcademico();
        ActaCalificaciones acta = new ActaCalificaciones("POO", "Estudiante 1", 9.5);
        CertificadoMatricula certificado = new CertificadoMatricula("MAT-2026-01", "Estudiante 1", "2026-2027");

        System.out.println("=== Emision y Archivo de Acta de Calificaciones ===");
        servicio.emitirDocumento(acta);
        servicio.archivarDocumento(acta);

        System.out.println("\n=== Emision y Archivo de Certificado de Matricula ===");
        servicio.emitirDocumento(certificado);
        servicio.archivarDocumento(certificado);

        System.out.println("\n=== Prueba de Validacion de Persistencia (Nota Invalida) ===");
        ActaCalificaciones actaInvalida = new ActaCalificaciones("POO", "Estudiante 2", -1.0);
        servicio.emitirDocumento(actaInvalida);
        servicio.archivarDocumento(actaInvalida);
    }
}
