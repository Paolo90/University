//STEP 1. Import required packages
import java.sql.*;

public class JDBCExample{
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

   //  Database credentials
   static final String USER = "paolo";
   static final String PASS = "99cecio99";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO Employees " +
                   "VALUES (100, 18, 'Zara', 'Ali')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Employees " +
                   "VALUES (101, 25, 'Mahnaz', 'Fatma')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Employees " +
                   "VALUES (102, 30, 'Zaid', 'Khan')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Employees " +
                   "VALUES(103, 28, 'Sumit', 'Mittal')";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample
