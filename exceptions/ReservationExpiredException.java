package exceptions;

public class ReservationExpiredException extends Exception {
    public ReservationExpiredException(String message) {
        super(message);
    }
}