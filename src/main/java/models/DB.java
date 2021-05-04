package models;



import org.sql2o.*;
//import org.sql2o.Connection;

//import java.sql.SQLException;
//import java.sql.DriverManager;

public class DB {


//    public static void main(String[] args) {
//        String jdbcURL = "jdbc:postgresql://localhost:5432/wildlife_tracker";
//        String username = "postgres";
//        String password = "5880";
//
//        try{
//            Connection connection = DriverManager.getConnection(jdbcURL , username , password);
//            System.out.println("Connected to server");
//
//            connection.close();
//
//        } catch (SQLException e) {
//            System.out.println("Error in connecting to database server");
//            e.printStackTrace();
//        }
//////Tried another method jdbc driver was not working
//public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "postgres",  "9090");
    private static String connectionString = "jdbc:postgresql://ec2-54-196-33-23.compute-1.amazonaws.com:5432/d2tc3di4ni9ch9"; //!
    public static Sql2o sql2o = new Sql2o(connectionString, "tmpgthhaigflhe", "de5d724a312a2cae04a1f99a38c65ac7820708f2cfcb86f1716f8d14c6b2736b"); //!

}

