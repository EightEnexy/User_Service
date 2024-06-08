    package com.example.userapp.exception;
    import lombok.Builder;
    import java.time.LocalDateTime;
    import java.util.Map;
    @Builder
    public record ErrorResponse (
        int status,
        String message,
        LocalDateTime timestamp,
        Map<String, String> details
    ) {
    }