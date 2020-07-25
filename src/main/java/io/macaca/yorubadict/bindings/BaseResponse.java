package io.macaca.yorubadict.bindings;

import io.macaca.yorubadict.enums.ResponseCodes;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BaseResponse<T> {

    private ResponseCodes code;
    private String message;
    private T data;

    public BaseResponse(ResponseCodes code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse(ResponseCodes code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
