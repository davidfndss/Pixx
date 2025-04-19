package com.techmafia.pixx.utils.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConflictException extends RuntimeException {

    public ConflictException(String message) {
        super(message);
    }

    public ConflictException() {
        super("Conflict: Resource already exists!");
    }
}