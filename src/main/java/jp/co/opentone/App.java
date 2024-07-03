package jp.co.opentone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // JDBC URL, username and password of MySQL server
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String jdbcUrl = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");

        // JDBC variables for opening and managing connection
        Connection connection = null;
        Statement statement = null;

        try {
            // Opening database connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Creating statement object
            statement = connection.createStatement();

            // Executing SQL query and getting the result
            String query = "SELECT NOW()";
            ResultSet resultSet = statement.executeQuery(query);

            // Processing the result
            while (resultSet.next()) {
                String result = resultSet.getString(1);
                System.out.println("Query Result: " + result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Closing connection
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
