package Movie;

public class MovieTest {

    public static void main(String[] args) {
        MovieManagerImpl movieManager = MovieManagerImpl.getInstance();

        Movie movie1 = new Movie();
        Movie movie2 = new Movie();

        SeriesMovie seriesMovie1 = new SeriesMovie();
        SeriesMovie seriesMovie2 = new SeriesMovie();

        Movie[] movieList;
        Movie[] seriesMovies;
        Movie[] generalMovies;
        Movie[] findMovies;

        double avgRunningTime;

        movie1.setId(1);
        movie1.setTitle("스파이더맨 웨이 백 홈");
        movie1.setDirector("봉준호");
        movie1.setGenre("스릴러");
        movie1.setRunningTime(120);

        movie2.setId(2);
        movie2.setTitle("어메이징 스파이더맨");
        movie2.setDirector("피터 파커");
        movie2.setGenre("스릴러");
        movie2.setRunningTime(120);

        seriesMovie1.setId(3);
        seriesMovie1.setTitle("코리안 히어로1");
        seriesMovie1.setDirector("손흥민");
        seriesMovie1.setGenre("축구");
        seriesMovie1.setRunningTime(240);
        seriesMovie1.setSeriesNum(1);
        seriesMovie1.setEpisode("축구한 얘기임");

        seriesMovie2.setId(4);
        seriesMovie2.setTitle("코리안 히어로2");
        seriesMovie2.setDirector("류현진");
        seriesMovie2.setGenre("야구");
        seriesMovie2.setRunningTime(360);
        seriesMovie2.setSeriesNum(2);
        seriesMovie2.setEpisode("야구한 얘기임");

        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(seriesMovie1);
        movieManager.addMovie(seriesMovie2);

        movieList = movieManager.getList();

        System.out.println("\n************************ 전체 영화 출력 *************************");

        for (Movie movie : movieList) {
            if (movie != null) {
                System.out.println(movie);
            }
        }

        findMovies = movieManager.searchByTitle("스파이더맨");

        System.out.println("\n************************ 검색 영화 출력 *************************");

        for(Movie findMovie : findMovies) {
            if(findMovie == null){
                continue;
            }
            System.out.println(findMovie.toString());
        }

        seriesMovies = movieManager.getSeriesMovies();

        System.out.println("\n************************ 시리즈 영화 출력 *************************");

        // 시리즈 무비 출력임 !!
        for(Movie seriesMovie : seriesMovies){
            if(seriesMovie == null) {
                continue;
            }
            System.out.println(seriesMovie.toString());
        }

        generalMovies = movieManager.getMovies();

        System.out.println("\n************************ 일반 영화 출력 *************************");

        for(Movie generalMovie : generalMovies){
            if(generalMovie == null){
                continue;
            }
            System.out.println(generalMovie.toString());
        }

        System.out.println("\n************************ 평균 상영시간 출력 *************************");
        avgRunningTime = movieManager.getRunningTimeAvg();
        System.out.println("평균 상영 시간 : "+ (int) avgRunningTime );

    }

}
