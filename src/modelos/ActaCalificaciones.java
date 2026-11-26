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
        return asignatura + "," + estudiante + "," + notaFinal;
    }

    @Override
    public boolean guardar() {
        if (notaFinal >= 0) {
            System.out.println("Acta de calificaciones guardada en el SGA.");
            return true;
        }
        return false;
    }

    @Override
    public String obtenerResumenPersistencia() {
        return "Registro almacenado: Acta de " + estudiante
                + " - Asignatura: " + asignatura;
    }
}
