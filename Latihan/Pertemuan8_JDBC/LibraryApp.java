/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan8_JDBC;

/**
 *
 * @author Asus
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Pertemuan8_JDBC.ConnectionUtil;

/**
 *
 * @author Asus
 */
public class LibraryApp {
   static BufferedReader input = new BufferedReader(new 
        InputStreamReader(System.in));
    
    static Connection connection;
    static Statement statement;
    static ResultSet rs;
    static PreparedStatement preparedStatement;
    
    
    public static void main(String[] args) {
        try {
            connection = ConnectionUtil.getConnection();
            statement = connection.createStatement();

            while(!connection.isClosed()) {
                showMenu();
            }

            statement.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void showMenu() {
        System.out.println("\n========= MAIN MENU =========");
        System.out.println("[1] Show Data");
        System.out.println("[2] Insert Data");
        System.out.println("[3] Edit Data");
        System.out.println("[4] Delete Data");
        System.out.println("[0] Exit");
        System.out.println("");
        System.out.print("Choose Menu> ");
        
        try {
            int choice = Integer.parseInt(input.readLine());

            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> showData();
                case 2 -> insertData();
                case 3 -> updateData();
                case 4 -> deleteData();
                default -> System.out.println("[!!] Wrong choice!");
            }
        } catch (IOException e) {
            System.out.println("[!!] Input only a number 0/1/2/3/4!");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    static void showData() throws SQLException {
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.println("|                                  LIST OF BOOKS                                    |");
        System.out.println("+-----------------------------------------------------------------------------------+");
        
        int i = 0;
        String sql = "SELECT * FROM books";
        rs = statement.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            String author = rs.getString("author");
            String penerbit = rs.getString("penerbit");

            System.out.println(String.format("%d. [%d] %s by %s published by %s", (i+=1), id, title, author, penerbit));

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        }
    }
    
    static void insertData() {
        try {
            // Get user input
            System.out.println("");
            System.out.print("Title\t: ");
            String title = input.readLine().trim();

            System.out.print("Author\t: ");
            String author = input.readLine().trim();
            
            System.out.print("Penerbit\t: ");
            String penerbit = input.readLine().trim();
            

            // Save to database
            String sql = "INSERT INTO books (title, author, penerbit) VALUES (?, ?, ?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, penerbit);

            int affectedRows = preparedStatement.executeUpdate();
            
            System.out.println("");
            System.out.println("Data inserted successfully.");
            System.out.println(affectedRows + " data affected.");
    
        } catch (IOException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void updateData() {
        String sql = null;
        int id = 0;
        
        try {
            // Get user input
            
            System.out.println("");
            System.out.println("Apa yang ingin di Update ?");
            System.out.println("[1] Title");
            System.out.println("[2] Author");
            System.out.println("[3] Penerbit");
            System.out.println("");
            System.out.print("Choose> ");
            
            try {
                
                int choice = Integer.parseInt(input.readLine());
  
                switch (choice) {
                    case 1:
                        System.out.println("");
                        System.out.print("ID yang ingin di update title nya : ");
                        id = Integer.parseInt(input.readLine());
                        System.out.println("");
                        System.out.print("Title : ");
                        String title = input.readLine().trim();
                        
                        sql = "UPDATE books SET title=? WHERE id=?";
                        
                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, title);
                        preparedStatement.setInt(2, id);
                    break;
                    case 2:
                        System.out.println("");
                        System.out.print("ID yang ingin di update author nya : ");
                        id = Integer.parseInt(input.readLine());
                        System.out.println("");
                        System.out.print("Author : ");
                        String author = input.readLine().trim();
                        
                        sql = "UPDATE books SET author=? WHERE id=?";
                        
                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, author);
                        preparedStatement.setInt(2, id);
                    break;
                    case 3:
                        System.out.println("");
                        System.out.print("ID yang ingin di penerbit  nya : ");
                        id = Integer.parseInt(input.readLine());
                        System.out.println("");
                        System.out.print("Penerbit : ");
                        String penerbit = input.readLine().trim();
                        
                        
                        sql = "UPDATE books SET penerbit=? WHERE id=?";
                        
                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, penerbit);
                        preparedStatement.setInt(2, id);
                    break;
                    default:
                        System.out.println("[!!] Wrong choice!");
                }
            
            int affectedRows = preparedStatement.executeUpdate();
            
            System.out.println("");
            System.out.println("Data updated successfully.");
            System.out.println(affectedRows + " data affected.");
                
            } catch (IOException e) {
                System.out.println("[!!] Input only a number 1/2/3!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void deleteData() {
        try {
            System.out.println("");
            System.out.print("ID yang ingin data nya di delete : ");
            int id = Integer.parseInt(input.readLine());
            
            String sql = "DELETE FROM books WHERE id=?";
            
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            
            int affectedRows = preparedStatement.executeUpdate();
            
            System.out.println("");
            System.out.println("Data deleted successfully.");
            System.out.println(affectedRows + " data affected.");
            
        } catch (IOException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}