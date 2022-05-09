package mk.finki.ukim.fitpoint.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidUserIdException extends RuntimeException{
    public InvalidUserIdException() {
        super(String.format("User with that ID was not found"));
    }
}