package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();

    private Product first = new Product(1, "Garlic", 1000);
    private Book second = new Book(2, "War & Peace", 500, "L.Tolstoy");
    private Smartphone third = new Smartphone(3, "C-65", 10000, "Siemens");

    @Test
    void shouldSaveNewProductIfNotExists() {
        repository.save(first);

        Product[] actual = repository.findAll();
        Product[] expected = {first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSaveNewProductIfExists() {
        repository.save(first);
        repository.save(second);
        repository.save(third);

        Product[] actual = repository.findAll();
        Product[] expected = {first, second, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        repository.save(first);
        repository.save(third);

        Product[] actual = repository.findAll();
        Product[] expected = {first, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAllNone() {
        Product[] actual = repository.findAll();
        Product[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        repository.save(first);
        repository.save(second);
        repository.save(third);

        repository.removeById(2);

        Product[] actual = repository.findAll();
        Product[] expected = {first, third};

        assertArrayEquals(expected, actual);
    }
}