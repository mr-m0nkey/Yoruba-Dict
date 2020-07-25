package io.macaca.yorubadict.services.impl;

import io.macaca.yorubadict.bindings.BaseResponse;
import io.macaca.yorubadict.entities.Entry;
import io.macaca.yorubadict.enums.ResponseCodes;
import io.macaca.yorubadict.exceptions.WordNotFoundException;
import io.macaca.yorubadict.repositories.EntryRepository;
import io.macaca.yorubadict.services.DictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Slf4j
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private EntryRepository entryRepository;

    @Override
    public Set<Entry> query(String query) {
        Set<Entry> results = new HashSet<>();
        Set<Entry> wordMatched = entryRepository.findByWordContaining(query);
        Set<Entry> variantMathed = entryRepository.findByVariantsContaining(query);
        results.addAll(wordMatched);
        results.addAll(variantMathed);
        return results;
    }
}
