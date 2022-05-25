package com.example.mvc.bussines_logic;

import java.util.Objects;

public class Word {
    private final String value;
    private int amount;

    public Word(String value, int amount) {
        this.value = value;
        this.amount = amount;
    }

    public String getValue() {
        return value;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return amount == word.amount && Objects.equals(value, word.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, amount);
    }
}
