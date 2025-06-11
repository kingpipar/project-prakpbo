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
public class MatakuliahDAO {
    private Connection conn;

    public MatakuliahDAO() {
        Connector connector = new Connector();
        this.conn = connector.koneksi;
    }
    
    public List<Matakuliah> getMatakuliahBySemester(int semester) {
    List<Matakuliah> list = new ArrayList<>();
    try {
        String query = "SELECT * FROM matakuliah WHERE semester = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, semester);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Matakuliah mk = new Matakuliah(
                rs.getString("kode"),
                rs.getString("nama"),
                rs.getInt("sks"),
                rs.getInt("semester")
            );
            list.add(mk);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}
    

    public List<Matakuliah> getDataMatkul() {
        List<Matakuliah> list = new ArrayList<>();
        String sql = "SELECT * FROM matakuliah";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Matakuliah mk = new Matakuliah(
                    rs.getString("kode_mk"),
                    rs.getString("nama_mk"),
                    rs.getInt("sks"),
                    rs.getInt("semester"),
                    rs.getString("kelas"),
                    rs.getString("hari"),
                    rs.getString("jam_mulai"),
                    rs.getString("jam_selesai"),
                    rs.getString("dosen_pengajar")
                );
                list.add(mk);
            }

        } catch (SQLException e) {
            System.out.println("Gagal mengambil data matakuliah: " + e.getMessage());
        }

        return list;
    }
    
    
}
