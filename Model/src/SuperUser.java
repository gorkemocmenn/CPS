import java.sql.*;
import java.util.ArrayList;


public class SuperUser {

    private static int superUserID=0;
    private String superUserName;
    private ArrayList<Administrator> administrators = new ArrayList<>();

    private String password="superUser1";


    String query = "INSERT INTO superusers ("+
            "superusername,"+
            "superuserid)"+
            "VALUES (?,?)";

    DB dbconnection;
    Connection connection;

    public SuperUser(DB db){
        dbconnection = db;
        connection = dbconnection.getConnection();
        superUserID++;
    }
    public void setSuperUserName(String superUserName){
        this.superUserName = superUserName;
    }
    public String getPassword(){
        return password;
    }
    public void addAdministrator(String userName,String enterDate,double salary,int age){
        DB db = new DB();
        Administrator admin = new Administrator(db);

    }
    public void inserttoDatabase(){
        try {
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, superUserName);
            statement.setInt(2,superUserID);
            int status =  statement.executeUpdate();
            System.out.println(status);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
