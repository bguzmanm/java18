package cl.awakelab.model.cnn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
  private static Connection connection = null;

  private DataBase() {
    try{

      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "kupita");

    } catch (ClassNotFoundException | SQLException e){
      e.printStackTrace();
    }
  }

  public static Connection getConnection() {
    if (connection == null){
      new DataBase();
    }
    return connection;
  }
}
