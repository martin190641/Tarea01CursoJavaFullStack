package jmriosp.com.tarea01.exception;

public class ModeloNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ModeloNotFoundException(String mensaje) {
        super(mensaje);
    }
}
