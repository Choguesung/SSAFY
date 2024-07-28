package Movie;

public class Movie implements java.io.Serializable {
    // 객체 변수임
    private int id;
    private String title;
    private String director;
    private String genre;
    private int runningTime;

    // 기본 생성자임
    public Movie () {}

    // 내가 만든 생성자임
    public Movie(int id, String title, String director, String genre, int runningTime){
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.runningTime = runningTime;
    }

    int getId() {
        return this.id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getTitle() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getDirector() {
        return this.director;
    }

    void setDirector(String director) {
        this.director = director;
    }

    String getGenre() {
        return this.genre;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    int getRunningTime() {
        return this.runningTime;
    }

    void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " TITLE: " + this.title + " DIRECTOR: " + this.director+ " GENRE: " + this.genre + " RUNNING TIME: " + this.runningTime;
    }
}
