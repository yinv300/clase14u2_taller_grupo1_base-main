package modelos;

import interfaces.Exportable;
import interfaces.Persistible;

public class CertificadoMatricula implements Exportable, Persistible {
    private String codigoMatricula;
    private String estudiante;
    private String periodo;

    public CertificadoMatricula(String codigoMatricula, String estudiante, String periodo) {
        this.codigoMatricula = codigoMatricula;
        this.estudiante = estudiante;
        this.periodo = periodo;
    }

    @Override
    public String exportar() {
        return "Certificado de Matricula [Codigo: " + codigoMatricula + ", Estudiante: " + estudiante + ", Periodo: " + periodo + "]";
    }

    @Override
    public boolean guardar() {
        System.out.println("Respaldo del certificado de matricula " + codigoMatricula + " realizado con exito.");
        return true;
    }

    @Override
    public String obtenerResumenPersistencia() {
        return "Certificado respaldado con codigo de matricula: " + codigoMatricula;
    }
}
