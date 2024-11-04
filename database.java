import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * database
//  */
// public class database {

//   public static void main(String[] args) {
//     like l = new like();
//   }
// }

// public class database {

//   public static void main(String[] args) {
//     final String url = "jdbc:mysql://localhost:3306/mydb";
//     final String user = "root";
//     final String password = "root";

//     try {
//       Class.forName("com.mysql.cj.jdbc.Driver");
//       Connection conn = DriverManager.getConnection(url, user, password);
//       Statement stmt = conn.createStatement();
//       ResultSet result = stmt.executeQuery("insert into ");
//       //   ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");

//       //   while (rs.next()) {
//       //     System.out.println(rs.getString("id") +"\t"+ rs.getString("name"));
//       //   }

//       //   rs.close();
//       stmt.close();
//       conn.close();
//     } catch (Exception e) {
//       e.printStackTrace();
//     }
//   }
// }

class DatabaseExample {

  public static void main(String[] args) {
    execution();
  }

  public static void execution() {
    String url = "jdbc:mysql://localhost:3306/mydb";
    String user = "root";
    String password = "root";

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection(url, user, password);

      // Ensure the connection is successful
      if (connection != null) {
        System.out.println("Connected to the database!");

        // Query to insert data
        String insertQuery = "INSERT INTO mytable (id, name) VALUES (?)";
        PreparedStatement pstmt = connection.prepareStatement(insertQuery);

        // Example: Insert a new record
        // pstmt.setInt(1,6); // Set the ID (ensure it doesn't conflict)
        pstmt.setString(1, "New Name"); // Set the name
        int rowsAffected = pstmt.executeUpdate();
        System.out.println("Rows inserted: " + rowsAffected);
        // Query to select data
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM mytable");

        // Check if the result set has records
        if (!rs.isBeforeFirst()) {
          System.out.println("No records found.");
        } else {
          // Displaying the results
          while (rs.next()) {
            System.out.println(
              "Id = " + rs.getInt(1) + "\t" + "Name = " + rs.getString(2)
            );
          }
        }

        // Closing resources
        pstmt.close();
        statement.close();
        connection.close();
      } else {
        System.out.println("Failed to connect to the database.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
