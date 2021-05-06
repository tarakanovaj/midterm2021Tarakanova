package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use MySql Database to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        //String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
        String textFile = "src/data/self-driving-car";
        String tempContainer;
        String finalContainer = "";

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(textFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((tempContainer = bufferedReader.readLine()) != null) {
                String space = " ";
                finalContainer = finalContainer + space + tempContainer;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println(finalContainer);
    }

    String username = "root";
    String password = "root1234";
    String url = "jdbc:mysql://localhost:3306/";


    Connection connection;

    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root1234");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    Statement statement;

    {
        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}