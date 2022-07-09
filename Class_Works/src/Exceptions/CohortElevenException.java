package src.Exceptions;

public class CohortElevenException extends RuntimeException{
    CohortElevenException() {
        super();
    }

    CohortElevenException(String message) {
        super(message);
    }

    CohortElevenException(Throwable err) {
        super(err);
    }

    CohortElevenException(String message, Throwable err) {
        super(message, err);
    }
}
