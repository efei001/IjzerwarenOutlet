package connectivity;

import java.sql.*;

/**
 * @author jaron
 */
public class DbManager {

    public static final String JDBC_EXCEPTION = "JDBC Exception: ";
    public static final String SQL_EXCEPTION = "SQL Exception: ";

    public static Connection connection;

    /**
     * The path to the database
     */
    public void openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/ijzerwarenoutlet";
            String user = "root", pass = "";

            /**
             * Open connection
             */
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            System.err.println(JDBC_EXCEPTION + e);
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
    }

    /**
     * Closes the database connection
     */
    public void closeConnection() {
        try {
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * executes a query without result
     *
     * @param query, the SQL query
     */
    public void executeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
    }

    /**
     * executes a query with result
     *
     * @param query, the SQL query
     * @return, returns the result of the query used
     */
    public ResultSet doQuery(String query) {
        ResultSet result = null;
        try {
            Statement statement = connection.createStatement();
            result = statement.executeQuery(query);
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
        return result;
    }

    /**
     * executes a query with result
     *
     * @param query, the SQL query executeUpdate: Updates the database
     * @return, returns the result of the query used
     */
    public ResultSet insertQuery(String query) {
        ResultSet result = null;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            result = statement.getGeneratedKeys();
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
        return result;
    }

}
