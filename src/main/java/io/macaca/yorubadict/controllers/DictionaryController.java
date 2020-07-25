package io.macaca.yorubadict.controllers;

import io.macaca.yorubadict.bindings.BaseResponse;
import io.macaca.yorubadict.entities.Entry;
import io.macaca.yorubadict.enums.ResponseCodes;
import io.macaca.yorubadict.services.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping(value = "/api/v1/dict")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("{query}")
    @ResponseStatus(value = HttpStatus.OK)
    public BaseResponse<Object> query(@PathVariable String query) {
        Set<Entry> entries = dictionaryService.query(query);
        return BaseResponse
                .builder()
                .code(ResponseCodes.SUCCESS)
                .message("Successful")
                .data(entries)
                .build();
    }
}
