package com.maland1.synapse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CardNotFoundException extends Exception
{
    public CardNotFoundException(String message) {
        super(message);
    }
}
