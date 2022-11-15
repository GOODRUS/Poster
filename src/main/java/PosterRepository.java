public class PosterRepository {

    private PosterMovies[] movies = new PosterMovies[0];

    public void addMovie(PosterMovies movie) {
        PosterMovies[] tmp = new PosterMovies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public PosterMovies[] findAll() {
        return movies;
    }

    public void save(PosterMovies movie) {
        PosterMovies[] tmp = new PosterMovies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public PosterMovies[] getMovies() {
        return movies;
    }

    public void remoteById(int id) {
        PosterMovies[] tmp = new PosterMovies[movies.length - 1];
        int copyToIndex = 0;
        for (PosterMovies movies : movies) {
            if (movies.getId() != id) {
                tmp[copyToIndex] = movies;
                copyToIndex++;
            }
        }
        movies = tmp;
    }

    public PosterMovies findById(int id) {
        PosterMovies[] tmp = new PosterMovies[movies.length - (movies.length - 1)];
        int copyToIndex = 0;
        for (PosterMovies movies : movies) {
            if (movies.getId() == id) {
                tmp[copyToIndex] = movies;
                copyToIndex++;
            }
        }
        movies = tmp;
        return null;
    }

    public PosterMovies[] removeAll() {
        PosterMovies[] tmp = new PosterMovies[0];
        return tmp;
    }
}
