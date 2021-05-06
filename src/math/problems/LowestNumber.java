package math.problems;

import java.sql.*;

public class LowestNumber {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /*
         * Write java solution to find the lowest number from this array.
         * Use MySql Database to store and to retrieve.
         */
        int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        //find lowest number from the array

        int smallNumber = array[0];
        for (int j : array) {
            if (j <= smallNumber) {
                smallNumber = j;
            }
        }
        System.out.println("Lowest number " + smallNumber);


        String username = "root";
        String password = "root1234";
        String dbName = "midtermmath";


        String url = "jdbc:mysql://localhost:3306/" + dbName + "";

        String allData = "select * from score;";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        ResultSet table = statement.executeQuery(allData);


        System.out.println("Data is reading from the Table (tbl_lowestNumber) and displaying to the console");

        while (table.next()) {
            int idFromDb = table.getInt(2);
            System.out.println(idFromDb);
        }


    }
}