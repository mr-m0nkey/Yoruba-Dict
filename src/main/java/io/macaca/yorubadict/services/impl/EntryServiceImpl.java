package io.macaca.yorubadict.services.impl;

import io.macaca.yorubadict.entities.Entry;
import io.macaca.yorubadict.repositories.EntryRepository;
import io.macaca.yorubadict.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntryServiceImpl implements EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Override
    public Entry find(String query) {
        return null;
    }
}
