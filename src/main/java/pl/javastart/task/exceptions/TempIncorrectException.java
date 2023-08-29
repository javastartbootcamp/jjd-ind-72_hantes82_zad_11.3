package pl.javastart.task.exceptions;

public class TempIncorrectException extends RuntimeException {
    public TempIncorrectException() {
        super("Podano niewłaściwą temperaturę - przekroczono bezpieczną granice temperatury");
    }
}
