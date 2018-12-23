import java.sql.SQLException;

public class Main {

    // this class is only for database functionality testing
    public static void main(String[] args){
        DB connection = new DB();
        //First Movie
        Movie rocky = new Movie(connection);
        rocky.setMovieName("ROCKY");
        rocky.setDescription("Drama/Sport");
        rocky.setReleaseDate("10.06.1982");
        rocky.setDirector("John Avildsen");
        rocky.setDurationTime(122.00);
        rocky.insertToDatabase();


        //Second Movie
        Movie Interstellar = new Movie(connection);
        Interstellar.setMovieName("Interstellar");
        Interstellar.setDescription("Science Fiction");
        Interstellar.setReleaseDate("07.11.2014");
        Interstellar.setDirector("Criptopher Nolan");
        Interstellar.setDurationTime(170.00);
        Interstellar.insertToDatabase();

        //Third Movie
        Movie Immortals = new Movie(connection);
        Immortals.setMovieName("Immortals");
        Immortals.setDescription("Fantastic");
        Immortals.setReleaseDate("11.11.2011");
        Immortals.setDirector("Tarsem Signh");
        Immortals.setDurationTime(110.00);
        Immortals.insertToDatabase();

        //Fourth Movie
        Movie Inception = new Movie(connection);
        Inception.setMovieName("Inception");
        Inception.setDescription("Science Fiction");
        Inception.setReleaseDate("30.07.2010");
        Inception.setDirector("Christopher Nolan");
        Inception.setDurationTime(150.00);
        Inception.insertToDatabase();

        //Fifth Movie
        Movie LordOfTheRings = new Movie(connection);
        LordOfTheRings.setMovieName("LordOfTheRings");
        LordOfTheRings.setDescription("Fantastic");
        LordOfTheRings.setReleaseDate("21.12.2001");
        LordOfTheRings.setDirector("Peter Jackson");
        LordOfTheRings.setDurationTime(230.00);
        LordOfTheRings.insertToDatabase();

        SuperUser super1 = new SuperUser(connection);
        super1.setSuperUserName("super1");
        super1.inserttoDatabase();

        Administrator ad1 = new Administrator(connection);
        ad1.setSuperUserID(1);
        ad1.setUserName("ad1");
        ad1.setEnterDate("12.12.2019");
        ad1.setUserAge(34);
        ad1.setUserSalary(10000);
        ad1.insertToDatabase();

        ad1.removeMovie("ROCKY");
    }
}
