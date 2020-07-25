package io.macaca.yorubadict.services.impl;

import io.macaca.yorubadict.entities.Entry;
import io.macaca.yorubadict.repositories.EntryRepository;
import io.macaca.yorubadict.services.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
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
