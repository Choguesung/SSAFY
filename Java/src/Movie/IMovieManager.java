package Movie;

public interface IMovieManager {

    // 영화 정보 등록하기
    void addMovie(Movie movie);

    Movie[] getList();

    Movie[] searchByTitle(String title);

    Movie[] getMovies();

    Movie[] getSeriesMovies();

    double getRunningTimeAvg();

}
