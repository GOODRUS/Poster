import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

    @Test
    public void shouldOutputAllFindMoviesInTheOrderOfEdition() {

        PosterManager manager = new PosterManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-неведимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputMoviesInReverseOrder() {

        PosterManager manager = new PosterManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputAllFindMoviesInTheOrderOfEditionMax() {

        PosterManager manager = new PosterManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-неведимка", "Тролли. Мировой тур", "Номер один", "Человек-неведимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputAllFindMoviesInTheOrderOfEditionMin() {

        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputAllFindMoviesInTheOrderOfEditionMaximum() {

        PosterManager manager = new PosterManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-неведимка", "Тролли. Мировой тур", "Номер один", "Человек-неведимка", "Тролли. Мировой тур", "Номер один", "Бладшот"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputAllFindMoviesInTheOrderOfEditionSizeTen() {

        PosterManager manager = new PosterManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот", "Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперёд"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputMoviesInReverseOrderMaximum() {

        PosterManager manager = new PosterManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот", "Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперёд"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputMoviesInReverseOrderSize() {

        PosterManager manager = new PosterManager(11);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот", "Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputMoviesInReverseOrderSizeMax() {

        PosterManager manager = new PosterManager(7);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот", "Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Номер один", "Тролли. Мировой тур", "Человек-неведимка"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
