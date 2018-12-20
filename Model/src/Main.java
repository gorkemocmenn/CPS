public class Main {

    // this class is only for database functionality testing
    public static void main(String[] args){
        DB connection = new DB();
        Movie rocky = new Movie(connection);
        rocky.setMovieName("ROCKY");
        rocky.setDescription("EFSANE FİLM OLUM");
        rocky.setReleaseDate("10.06.1985");
        rocky.setDirector("Kenan Komutan");
        rocky.setDurationTime(100.00);
        rocky.insertToDatabase();
    }
}
