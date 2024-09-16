package com.productdock.rbc2024.exception;

public class BookTitleAlreadyExistsException extends RuntimeException {

    public BookTitleAlreadyExistsException(String message) {
        super(message);
    }
}
