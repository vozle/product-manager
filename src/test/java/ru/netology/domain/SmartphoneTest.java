package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone first = new Smartphone(1, "C-65", 10000, "Siemens");
    private Smartphone second = new Smartphone(2, "M-65", 13000, "Siemens");

    @Test
    void matches() {
        assertTrue(first.matches("Siemens"));
        assertFalse(second.matches("Samsung"));
    }
}