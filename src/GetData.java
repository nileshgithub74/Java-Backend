import java.sql.*;

public class GetData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");


        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String password = "Itsnileshsreyansh@12";
        Connection connection = DriverManager.getConnection(url, user, password);


        // statement

        Statement statement = connection.createStatement();


        // query
        String sqlquery = "select * from empolyee";
        ResultSet resultSet = statement.executeQuery(sqlquery);


        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String address= resultSet.getString("address");
            String email = resultSet.getString("email");

            System.out.println("id "+ id+ " "+ "name:"+name +  "->"+ "address"+ address +  "-"+  " email: "+ email);
        }

        // delete the record;

        String sqldel = "delete from empolyee where id= 122";
        int rowchanged = statement.executeUpdate(sqldel);
        if(rowchanged ==1){
            System.out.println("Record deleted");
        }else{
            System.out.println("Deletion failed");
        }









        //closed resource;

        resultSet.close();
        statement.close();
        connection.close();


    }
}
