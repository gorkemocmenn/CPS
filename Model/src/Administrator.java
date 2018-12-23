import java.sql.*;

public class Administrator {
    DB dbconnection;
    Connection connection;
    // just for GUI login screen
    private String password="administrator";
    //sql query
    String query = "INSERT INTO administrators ("+
            "userid,"+
            "superuserid,"+
            "username,"+
            "enterdate,"+
            "usersalary,"+
            "userage)"+
            "VALUES (?,?,?,?,?,?)";

    private int superUserID;
    private String userName;
    private String enterDate;
    private static int userID=0;
    private double userSalary;
    private int userAge;


    public Administrator(DB dbconnection){
        this.dbconnection = dbconnection;
        connection = dbconnection.getConnection();
        userID++;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setEnterDate(String enterDate){
        this.enterDate = enterDate;
    }
    public void setUserSalary(double userSalary){
        this.userSalary = userSalary;
    }
    public void setUserAge(int userAge){
        this.userAge = userAge;
    }
    public void setSuperUserID(int superUserID){
        this.superUserID = superUserID;
    }
    public String getPassword(){
        return password;
    }

    public void insertToDatabase(){
        try {
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, userID);
            statement.setInt(2,superUserID);
            statement.setString(3,userName);
            statement.setString(4,enterDate);
            statement.setDouble(5,userSalary);
            statement.setInt(6,userAge);

            int status =  statement.executeUpdate();
            System.out.println(status);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ResultSet retrieveMovieData(){
        ResultSet rs = null;
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM movies;";
            rs = statement.executeQuery(sql);


            statement.close();
            connection.close();


        } catch (SQLException e1) {
            e1.printStackTrace();
            System.out.println("Something went wrong ");
        }
        return rs;
    }
}
