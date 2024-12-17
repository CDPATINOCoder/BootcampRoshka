package com.postulantes.api.responses;

public class ErrorResponse {
    private int status;
    private String message;

    public ErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {  // Getter para status
        return status;
    }

    public String getMessage() {  // Getter para message
        return message;
    }
}
