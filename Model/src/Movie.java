public class Movie {
    DB dbconnection;

    private String movieName;
    private String director;
    private String description;
    private String releaseDate;
    private double durationTime;

    public Movie(DB dbconnectionb){
        this.dbconnection=dbconnectionb;
    }


    public void recordMovieName(String movieName){
        this.movieName=movieName;
    }
    public void recordDirector(String director){
        this.director = director;
    }
    public void recordDescription(String description){
        this.description = description;
    }
    public void recordReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }
    public void recordDurationTime(double durationTime){
        this.durationTime = durationTime;
    }

    public void insertToDatabase(){

    }

}
