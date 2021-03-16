package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);
    private Book firstBook = new Book(1, "The Road Ahead - Bill Gates", 90, "The Road Ahead","Bill Gates");
    private Book secondBook = new Book(2, "Илон Маск", 1450, "Илон Маск: Tesla, SpaceX и дорога в будущее", "Эшли Вэнс");
    private Smartphone firstSmartphone = new Smartphone(3, "Samsung", 16_950, "Samsung A21S ","China");
    private Smartphone secondSmartphone = new Smartphone(4, "Sony", 25_650, "Sony Experia","Thailand");


    @BeforeEach
    void setUp() {
        manager.add(firstBook);
        manager.add(secondBook);
        manager.add(firstSmartphone);
        manager.add(secondSmartphone);
    }

    @Test
    public void shouldGetAll() {
        Product[] expected = new Product[]{firstBook, secondBook, firstSmartphone, secondSmartphone};
        Product[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindBookAuthor() {
        Product[] expected = new Product[]{firstBook};
        Product[] actual = manager.searchBy("The Road Ahead");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindByBookTitle() {
        Product[] expected = new Product[]{firstBook};
        Product[] actual = manager.searchBy("The Road Ahead");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindBySmartphoneManufacturer() {
        Product[] expected = new Product[]{secondSmartphone};
        Product[] actual = manager.searchBy("Thailand");
        assertArrayEquals(expected, actual);
    }

}