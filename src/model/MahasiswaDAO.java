/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import prakpbo_krs.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ACER
 */
public class MahasiswaDAO {
    private Connection conn;

    public MahasiswaDAO() {       
        Connector connector = new Connector();
        this.conn = connector.koneksi;
    }

    // Method Login Mahasiswa
    public Mahasiswa loginMahasiswa(String nim, String password) {
        Mahasiswa mahasiswa = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE nim = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nim);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mahasiswa = new Mahasiswa(
                    rs.getString("nim"),
                    rs.getString("nama"),
                    rs.getString("password"),
                    rs.getString("prodi"),
                    rs.getInt("semester")
                );
            }
        } catch (SQLException e) {
            System.out.println("Login gagal: " + e.getMessage());
        }
        return mahasiswa;
    }

    // Method untuk mengambil semua data mahasiswa (jika dibutuhkan)
    public List<Mahasiswa> getDataMahasiswa() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM mahasiswa";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa(
                    rs.getString("nim"),
                    rs.getString("nama"),
                    rs.getString("password"),
                    rs.getString("prodi"),
                    rs.getInt("semester")
                );
                list.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public Mahasiswa getMahasiswabyNim(String nim){
         Mahasiswa mhs = null;
    try {
        String query = "SELECT * FROM mahasiswa WHERE nim = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, nim);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            mhs = new Mahasiswa(
                rs.getString("nim"),
                rs.getString("nama"),
                rs.getString("password"),
                rs.getString("prodi"),
                rs.getInt("semester")
            );
        }
    } catch (SQLException e) {
        System.out.println("Gagal mengambil data mahasiswa by NIM: " + e.getMessage());
    }
    return mhs;
    }
}
