package com.techmafia.pixx.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ApiResponseDto {
    private String message;

    private int status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    public ApiResponseDto(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public ApiResponseDto(String message, int status, Object data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }
}
