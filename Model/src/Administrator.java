public class Administrator {
    DB dbconnection;



    private String userName;
    private String enterDate;
    //private int userID;
    private double userSalary;
    private int userAge;


    public Administrator(DB dbconnection){
        this.dbconnection = dbconnection;
    }

    public void recordUserName(String userName){
        this.userName = userName;
    }
    public void recordEnterDate(String enterDate){
        this.enterDate = enterDate;
    }
    public void recordUserSalary(double userSalary){
        this.userSalary = userSalary;
    }
    public void recordUserAge(int userAge){
        this.userAge = userAge;
    }

    public void insertToDatabase(){

    }
}
