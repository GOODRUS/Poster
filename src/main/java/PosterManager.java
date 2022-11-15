public class PosterManager {
    private PosterRepository repo;
    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }
    public PosterMovies[] findAll() {
        PosterMovies[] all = repo.findAll();
        return all;
    }
}
