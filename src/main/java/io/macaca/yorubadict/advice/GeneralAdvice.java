package io.macaca.yorubadict.advice;

import io.macaca.yorubadict.bindings.BaseResponse;
import io.macaca.yorubadict.entities.Entry;
import io.macaca.yorubadict.enums.ResponseCodes;
import io.macaca.yorubadict.exceptions.WordNotFoundException;
import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GeneralAdvice {

    @ExceptionHandler(WordNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public BaseResponse<Object> handleNotFoundException(WordNotFoundException e) {
        log.error("WordNotFoundException", e);
        return BaseResponse
                .builder()
                .message(e.getMessage())
                .code(ResponseCodes.NOT_FOUND)
                .build();
    }

}
