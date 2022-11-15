import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

public class PosterManagerTest {

    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);

    PosterMovies movie1 = new PosterMovies(12,"Бладшот");
    PosterMovies movie2 = new PosterMovies(23,"Вперёд");
    PosterMovies movie3 = new PosterMovies(34,"Отель Белград");
    PosterMovies movie4 = new PosterMovies(48,"Джентельмены");
    PosterMovies movie5 = new PosterMovies(56,"Человек-неведимка");
    PosterMovies movie6 = new PosterMovies(63,"Тролли. Мировой тур");
    PosterMovies movie7 = new PosterMovies(71,"Номер один");


    @Test
    public void shouldTestFindAll() {
        PosterMovies[] movies = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        doReturn(movies).when(repo).findAll();

        PosterMovies[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        PosterMovies[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
}
