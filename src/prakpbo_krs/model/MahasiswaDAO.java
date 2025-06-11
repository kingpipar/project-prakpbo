/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpbo_krs.model;

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

    // (Opsional) Tambah Mahasiswa - untuk admin/registrasi
    public boolean insertMahasiswa(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa (nim, nama, password, prodi, semester) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, mhs.getNim());
            ps.setString(2, mhs.getNamaMhs());
            ps.setString(3, mhs.getPassword());
            ps.setString(4, mhs.getProdi());
            ps.setInt(5, mhs.getSemester());

            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            System.out.println("Gagal menambah mahasiswa: " + e.getMessage());
            return false;
        }
    }
}
