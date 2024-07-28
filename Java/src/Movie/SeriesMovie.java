package Movie;

public class SeriesMovie extends Movie{
    private int seriesNum;
    private String episode;

    // 기본 생성자
    public SeriesMovie() {
        super();
    }

    // 만든 생성자
    public SeriesMovie(int id, String title, String director, String genre, int runningTime, int seriesNum, String episode){
        super(id,title,director,genre,runningTime);
        this.seriesNum = seriesNum;
        this.episode = episode;
    }

    public int getSeriesNum() {
        return seriesNum;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getEpisode() {
        return episode;
    }

    public void setSeriesNum(int seriesNum) {
        this.seriesNum = seriesNum;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "NUMBERSES: " + this.seriesNum + " " + "EPISODE: " + this.episode;
    }
}

