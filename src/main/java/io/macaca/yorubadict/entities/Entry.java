package io.macaca.yorubadict.entities;

import io.macaca.yorubadict.converters.StringListConverter;
import io.macaca.yorubadict.enums.Language;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "entries")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String word;

//    @Convert(converter = StringListConverter.class)
    private String variants;

    @Convert(converter = StringListConverter.class)
    private List<String> exampleSentences;

    private String definition;

    @Enumerated(EnumType.STRING)
    private Language language;

}
