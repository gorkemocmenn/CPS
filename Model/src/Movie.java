import java.sql.*;

public class Movie {
    DB dbconnection;
    Connection connection;

    String query = "INSERT INTO movies ("+
            "moviename,"+
            "director,"+
            "description,"+
            "releasedate,"+
            "durationtime)"+
            "VALUES (?,?,?,?,?)";

    private String movieName;
    private String director;
    private String description;
    private String releaseDate;
    private double durationTime;

    public Movie(DB db){
        dbconnection = db;
        connection = dbconnection.getConnection();
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }
    public void setDurationTime(double durationTime){
        this.durationTime = durationTime;
    }

    public void insertToDatabase(){
        try {
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1,movieName);
            statement.setString(2,director);
            statement.setString(3,description);
            statement.setString(4,releaseDate);
            statement.setDouble(5,durationTime);
           int status =  statement.executeUpdate();
           System.out.println(status);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





}
