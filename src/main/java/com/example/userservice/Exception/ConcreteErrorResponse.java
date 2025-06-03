package com.example.userservice.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponse;

public class ConcreteErrorResponse implements ErrorResponse {
    private final String message;
    private final LocalDateTime timestamp;
    private final int status;

    public ConcreteErrorResponse(String message, LocalDateTime timestamp, int status) {
        this.message = message;
        this.timestamp = timestamp;
        this.status = status;
    }

    // Getters (if `ErrorResponse` defines methods, implement them)
    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public HttpStatusCode getStatusCode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ProblemDetail getBody() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}