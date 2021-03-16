package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book firstBook = new Book(1, "The Road Ahead - Bill Gates", 90, "The Road Ahead","Bill Gates");
    private Book secondBook = new Book(2, "Илон Маск", 1450, "Илон Маск: Tesla, SpaceX и дорога в будущее", "Эшли Вэнс");
    private Smartphone firstSmartphone = new Smartphone(3, "Samsung", 16_950, "Samsung A21S ","China");
    private Smartphone secondSmartphone = new Smartphone(4, "Sony", 25_650, "Sony Experia","Thailand");

    @Test
    public void shouldSaveAndRemoveByID() {
        repository.save(firstBook);
        repository.save(secondBook);
        repository.save(firstSmartphone);
        repository.save(secondSmartphone);
        Product[] expected = new Product[]{firstBook,secondBook, firstSmartphone};
        repository.removeById(4);
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}
