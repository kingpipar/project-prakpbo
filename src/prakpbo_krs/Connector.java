/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpbo_krs;

import java.sql.*;
/**
 *
 * @author ACER
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/prakpbo_krs";
    String DBusername= "root";
    String DBpassword= "";
    
    public Connection koneksi;
    public Statement statement;
    
    public Connector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl, DBusername, DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception e){
            System.out.println("Koneksi Gagal");
        }
    }
}
