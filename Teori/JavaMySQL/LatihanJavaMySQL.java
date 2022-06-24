/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMySQL;

import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Asus
 */
public class LatihanJavaMySQL {
    // Menyiapkan paramter JDBC untuk koneksi ke basis data
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/mahasiswa";
    static final String USER = "root";
    static final String PASS = "katakunci";
    // Menyiapkan objek yang diperlukan untuk mengelola basis data
    static Connection con;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        // Melakukan koneksi ke basis data
        // harus dibungkus dalam blok try/catch
        try {
            // register driver yangakan dipakai
            Class.forName(JDBC_DRIVER);
            // buat koneksi ke basis data
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // buat objek statement
            stmt = conn.createStatement();
            // buat query ke basis data
            String sql = "SELECT * FROM biodata";
            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);
            // tampilkan hasil query
            while (rs.next()) {
                System.out.println("NIM: " + rs.getInt("nim_mhs"));
                System.out.println("Nama: " + rs.getString("nama_mhs"));
                System.out.println("Alamat: " + rs.getString("alm_mhs"));
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
