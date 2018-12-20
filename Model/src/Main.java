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
    }
}
