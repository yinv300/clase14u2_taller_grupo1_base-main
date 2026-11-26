package servicios;

import interfaces.Exportable;
import interfaces.Persistible;

public class ServicioAcademico {

    public void emitirDocumento(Exportable documento) {
        // TODO [Issue #3 - Integrante 3]: Imprimir el resultado de documento.exportar() sin depender de clases concretas.
    }

    public void archivarDocumento(Persistible registro) {
        // TODO [Issue #3 - Integrante 3]: Invocar registro.guardar() e imprimir registro.obtenerResumenPersistencia().
    }
}
