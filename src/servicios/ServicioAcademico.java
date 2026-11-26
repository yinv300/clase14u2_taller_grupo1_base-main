package servicios;

import interfaces.Exportable;
import interfaces.Persistible;

public class ServicioAcademico {

    public void emitirDocumento(Exportable documento) {
        if (documento == null) {
            System.out.println("No se puede emitir un documento nulo.");
            return;
        }
        System.out.println(documento.exportar());
    }

    public void archivarDocumento(Persistible registro) {
        if (registro == null) {
            System.out.println("No se puede archivar un registro nulo.");
            return;
        }
        if (registro.guardar()) {
            System.out.println(registro.obtenerResumenPersistencia());
        } else {
            System.out.println("No se pudo guardar el registro.");
        }
    }
}
