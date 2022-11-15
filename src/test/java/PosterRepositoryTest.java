import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterRepositoryTest {

    PosterMovies movie1 = new PosterMovies(12,"Garry1");
    PosterMovies movie2 = new PosterMovies(23,"Garry2");
    PosterMovies movie3 = new PosterMovies(34,"Garry3");
    PosterMovies movie4 = new PosterMovies(48,"Garry4");

    @Test
    public void shouldTestRepoSave() {

        PosterRepository repo = new PosterRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);

        PosterMovies[] expected = {movie1, movie2, movie3};
        PosterMovies[] actual = repo.getMovies();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldTestRepoRemote() {

        PosterRepository repo = new PosterRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.remoteById(movie1.getId());
        repo.remoteById(movie4.getId());

        PosterMovies[] expected = {movie2, movie3};
        PosterMovies[] actual = repo.getMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestRepoFindAll() {

        PosterRepository repo = new PosterRepository();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);

        PosterMovies[] expected = {movie1, movie2, movie3, movie4};
        PosterMovies[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestRepoFindByIdNull() {

        PosterRepository repo = new PosterRepository();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.findById(movie4.getId());

        PosterMovies[] expected = {null};
        PosterMovies[] actual = repo.getMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestRepoFindById() {

        PosterRepository repo = new PosterRepository();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.findById(movie2.getId());

        PosterMovies[] expected = {movie2};
        PosterMovies[] actual = repo.getMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestRepoRemove() {

        PosterRepository repo = new PosterRepository();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);

        PosterMovies[] expected = {};
        PosterMovies[] actual = repo.removeAll();

        assertArrayEquals(expected, actual);
    }
}
