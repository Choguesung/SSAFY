package Movie;

import java.util.ArrayList;

public class MovieManagerImpl implements IMovieManager{
    public static MovieManagerImpl instance = new MovieManagerImpl();

    private MovieManagerImpl() {}

    public static MovieManagerImpl getInstance() {
        return instance;
    }

    int MAX_SIZE = 100;
    int size = 0;

//    Movie[] movieList = new Movie[MAX_SIZE];

    ArrayList<Movie> movieList = new ArrayList<>();

    // 영화 정보 등록하기
    @Override
    public void addMovie(Movie movie) {
        if(size < MAX_SIZE) {
//            movieList[size] = movie;
            movieList.add(movie);
//            size++;
        } else {
            System.out.println("영화 가득 찼음 ㅋㅋ");
        }
    }

    // 영화 리스트 반환하기
    public Movie[] getList() {
        return movieList.toArray(new Movie[0]);
    }

    // 일반 영화 반환
    public Movie[] getMovies() {
//        int generalMovieCount = 0;
//        Movie[] generalMovieList = new Movie[MAX_SIZE];
//
//        for(int i = 0; i < MAX_SIZE; i++){
//            if (!(movieList[i] instanceof SeriesMovie)){
//                generalMovieList[generalMovieCount] = movieList[i];
//                generalMovieCount++;
//            }
//        }

        ArrayList<Movie> generalMovieList = new ArrayList<>();

        for(Movie movie : movieList) {
            if(!(movie instanceof SeriesMovie)) {
                generalMovieList.add(movie);
            }
        }

        return generalMovieList.toArray(new Movie[0]);
    }

    // 시리즈 영화 반환
    public Movie[] getSeriesMovies() {
//        int seriesMovieCount = 0;
//        SeriesMovie[] seriesMovieList = new SeriesMovie[MAX_SIZE];
//
//        for(int i = 0; i < MAX_SIZE; i++){
//            if (movieList[i] instanceof SeriesMovie){
//                seriesMovieList[seriesMovieCount] = seriesMovieList[i];
//                seriesMovieCount++;
//            }
//        }

        ArrayList<Movie> seriesMovieList = new ArrayList<>();

        for(Movie movie : movieList){
            if(movie instanceof SeriesMovie) {
                seriesMovieList.add(movie);
            }
        }

        return seriesMovieList.toArray(new Movie[0]);
    }

    // 영화 이름으로 검색하기
    public Movie[] searchByTitle(String title){
//        int count = 0;
//        Movie[] searchMovieList = new Movie[MAX_SIZE];
//
//        for(int i = 0; i < MAX_SIZE; i++){
//            if(movieList[i] == null) continue;
//            if(movieList[i].getTitle().contains(title)){
//                searchMovieList[count] = movieList[i];
//                count++;
//            }
//        }
        ArrayList<Movie> searchMovieList = new ArrayList<>();

        for(Movie movie : movieList){
            if(movie.getTitle().contains(title)){
                searchMovieList.add(movie);
            }
        }

        return searchMovieList.toArray(new Movie[0]);
    }


    // 평균 상영시간 리스트 반환
    public double getRunningTimeAvg() {
        return movieList.stream()
                .filter(movie -> !(movie instanceof SeriesMovie))
                .mapToDouble(Movie::getRunningTime)
                .average()
                .orElse(0.0);
    }
}
