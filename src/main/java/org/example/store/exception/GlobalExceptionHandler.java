package org.example.store.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(
            GlobalExceptionHandler.class);
    @ExceptionHandler(NoSuchElementException.class)
    public String handleNoSuchElementException(Exception ex) {
        LOGGER.error(ex.getMessage(), ex);
        return "not found";
    }

    @ExceptionHandler(JpaSystemException.class)
    public String handleJpaSystemException(Exception ex) {
        LOGGER.error(ex.getMessage(), ex);
        return "can't create";
    }
}
