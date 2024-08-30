package com.workintech.fswebs18challengemaven.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CardException extends RuntimeException{
    private HttpStatus httpStatus;

    public CardException(String message, HttpStatus status) {
        super(message);
        this.httpStatus = status;
    }
}