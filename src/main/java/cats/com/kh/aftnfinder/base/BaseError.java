package cats.com.kh.aftnfinder.base;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record BaseError<T>(
        Boolean status,
        Integer code,
        String message,
        LocalDateTime timestamp,
        T errors) {
}