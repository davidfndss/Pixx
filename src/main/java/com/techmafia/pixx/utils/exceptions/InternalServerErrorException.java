package com.techmafia.pixx.utils.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException(String message) {
        super(message);
    }

    public InternalServerErrorException()  {
        super("Bad Request");
    }
}