package pl.javastart.task.exceptions;

public class CriticalTempException extends RuntimeException {
    public CriticalTempException(String part) {
        super("Nie można podkręcić części " + part + "bo istnieje zagrożenie spaleniem jednostki");
    }
}
