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
        // TODO [Issue #2 - Integrante 2]: Retornar la representacion exportable del certificado (codigo, estudiante y periodo).
        return "PENDIENTE_CERTIFICADO";
    }

    @Override
    public boolean guardar() {
        // TODO [Issue #2 - Integrante 2]: Imprimir confirmacion de respaldo del certificado y retornar true.
        return false;
    }

    @Override
    public String obtenerResumenPersistencia() {
        // TODO [Issue #2 - Integrante 2]: Retornar un resumen corto con el codigo de matricula respaldado.
        return "PENDIENTE_RESUMEN";
    }
}
