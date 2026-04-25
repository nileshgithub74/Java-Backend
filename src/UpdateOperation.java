import java.sql.*;

public class UpdateOperation {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        // establish the connection

        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String password = "Itsnileshsreyansh@12";

        Connection connection = DriverManager.getConnection(url, user, password);

        //statement
        Statement statement = connection.createStatement();


        // query execution
        String  sqlUpdated = "update empolyee set address='bihar' where id=123";

       int rowchanged =   statement.executeUpdate(sqlUpdated);

       if(rowchanged == 1){
           System.out.println("Updated data sucessfully");
       }else{
           System.out.println("Failed to update");
       }

        statement.close();
        connection.close();

    }


}
