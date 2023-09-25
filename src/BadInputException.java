public class BadInputException extends Exception {
    public BadInputException(String message) {
        super(message);
    }

    // constructor with default message
    public BadInputException() {
        super("Input is not valid.");
    }
}
