package com.maland1.synapse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * The UserNotFoundException wraps the standard checked Java exception and returns a HTTP error status to the server.
 * @author maland1
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception
{
    public UserNotFoundException(String message) {
        super(message);
    }
}
