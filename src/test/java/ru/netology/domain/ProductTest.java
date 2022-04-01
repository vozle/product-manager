package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product first = new Product(1, "Garlic", 1000);
    private Product second = new Product(2, "Wild Garlic", 8000);

    @Test
    void matchesTrue() {
        assertTrue(first.matches("Garlic"));
    }

    @Test
    void matchesFalse() {
        assertFalse(second.matches("Onion"));
    }
}