/**
 *
 */
package com.connection;

import java.sql.*;

/**
 * @author Shado
 */
public class MySQLConnection {

    private static final String URL = "jdbc:mysql://den1.mysql4.gear.host:3306/sunstore";
    private static final String USER = "sunstore";
    private static final String PASSWORD = "$s25111211";

    public static Connection getMySQLConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver? | " + e.getMessage());
            return null;
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console. | " + e.getMessage());
            return null;
        }
        return connection;
    }

//    public static void main(String[] args) throws SQLException {
//
//        Connection connection = MySQLConnection.getMySQLConnection();
//
//        if (connection != null) {
//            System.out.println("You made it, take control your database now!");
//        } else {
//            System.out.println("Failed to make connection!");
//        }
//    }

    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void closePreparedStatement(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}
