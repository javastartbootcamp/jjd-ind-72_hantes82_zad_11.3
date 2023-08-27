package pl.javastart.task.exceptions;

public class StringsIncorrectException extends RuntimeException {

    public StringsIncorrectException(String reason) {
        super("Pole " + reason + " za krótkie lub podano wartość null");
    }
}
