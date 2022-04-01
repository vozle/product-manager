package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book first = new Book(1, "Anna Karenina", 500, "L. Tolstoy");
    private Book second = new Book(2, "War & Peace", 500, "L. Tolstoy");

    @Test
    void matchesTrue() {
        assertTrue(first.matches("Tolstoy"));
    }

    @Test
    void matchesFalse() {
        assertFalse(second.matches("Chekhov"));
    }
}