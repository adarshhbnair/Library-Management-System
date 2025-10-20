package exceptions;

public class FineNotPaidException extends Exception {
    public FineNotPaidException(String message) {
        super(message);
    }
}