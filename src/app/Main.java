package app;

import modelos.ActaCalificaciones;
import modelos.CertificadoMatricula;
import servicios.ServicioAcademico;

public class Main {
    public static void main(String[] args) {
        ServicioAcademico servicio = new ServicioAcademico();
        ActaCalificaciones acta = new ActaCalificaciones("POO", "Estudiante 1", 9.5);
        CertificadoMatricula certificado = new CertificadoMatricula("MAT-2026-01", "Estudiante 1", "2026-2027");

        // TODO [Issue #3 - Integrante 3]: Emitir y archivar tanto el acta como el certificado usando ServicioAcademico.
        servicio.emitirDocumento(acta);
        servicio.archivarDocumento(certificado);
    }
}
