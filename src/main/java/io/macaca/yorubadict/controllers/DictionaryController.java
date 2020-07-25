package io.macaca.yorubadict.controllers;

import io.macaca.yorubadict.entities.Entry;
import io.macaca.yorubadict.services.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;


@RestController
@RequestMapping(value = "/api/v1/dict")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("{query}")
    @ResponseStatus(value = HttpStatus.OK)
    public Set<Entry> query(@PathVariable String query) {
        return dictionaryService.query(query);
    }
}
