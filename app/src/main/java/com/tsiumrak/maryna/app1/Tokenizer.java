package com.tsiumrak.maryna.app1;

import android.widget.EditText;

import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * Created by Marina on 3/12/2018.
 */

public class Tokenizer {

    private String sentence = "String";

    public Tokenizer(){

    }

    public Tokenizer(String asentence) {
        this.sentence = asentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public int countWords(String sentence){
        StringTokenizer st = new StringTokenizer(sentence, "\t\n\r,. ");
        return st.countTokens();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tokenizer)) return false;

        Tokenizer tokenizer = (Tokenizer) o;

        return getSentence() != null ? getSentence().equals(tokenizer.getSentence()) : tokenizer.getSentence() == null;
    }

    @Override
    public int hashCode() {
        return getSentence() != null ? getSentence().hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tokenizer{");
        sb.append("sentence='").append(sentence).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
