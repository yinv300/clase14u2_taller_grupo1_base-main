package modelos;

import interfaces.Exportable;
import interfaces.Persistible;

public class ActaCalificaciones implements Exportable, Persistible {
    private String asignatura;
    private String estudiante;
    private double notaFinal;

    public ActaCalificaciones(String asignatura, String estudiante, double notaFinal) {
        this.asignatura = asignatura;
        this.estudiante = estudiante;
        this.notaFinal = notaFinal;
    }

    @Override
    public String exportar() {
        // TODO [Issue #1 - Integrante 1]: Retornar un texto en formato CSV o PDF con asignatura, estudiante y notaFinal.
        return "PENDIENTE_ACTA";
    }

    @Override
    public boolean guardar() {
        // TODO [Issue #1 - Integrante 1]: Imprimir un mensaje corto de guardado en el SGA y retornar true si notaFinal >= 0.
        return false;
    }

    @Override
    public String obtenerResumenPersistencia() {
        // TODO [Issue #1 - Integrante 1]: Retornar un resumen breve indicando el registro almacenado.
        return "PENDIENTE_RESUMEN";
    }
}
