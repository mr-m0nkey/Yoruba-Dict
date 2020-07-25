package io.macaca.yorubadict.services;

import io.macaca.yorubadict.entities.Entry;

import java.util.List;
import java.util.Set;

public interface DictionaryService {

    Set<Entry> query(String query); //TODO order by ascending length


}
