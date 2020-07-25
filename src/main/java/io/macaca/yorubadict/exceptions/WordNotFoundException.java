package io.macaca.yorubadict.exceptions;

public class WordNotFoundException extends RuntimeException {

    private String word;

    public WordNotFoundException(String word) {
        super(word.concat(" not found."));
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
