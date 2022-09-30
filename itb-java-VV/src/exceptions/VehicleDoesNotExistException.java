package exceptions;

public class VehicleDoesNotExistException extends Exception {
    public VehicleDoesNotExistException(String message) {
        super(message);
    }
}
