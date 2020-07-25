package io.macaca.yorubadict.repositories;

import io.macaca.yorubadict.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

    Set<Entry> findByWordContaining(String query);

    @Query("SELECT entry FROM Entry entry WHERE variants LIKE %:query%")
    Set<Entry> findByVariantsContaining(@Param("query") String query);

}
