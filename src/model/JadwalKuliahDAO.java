package model;

import prakpbo_krs.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JadwalKuliahDAO {
    private Connection conn;

    public JadwalKuliahDAO() {
        Connector connector = new Connector();
        this.conn = connector.koneksi;
    }

    public List<JadwalKuliah> getAllJadwalBySemester(int semester) {
        List<JadwalKuliah> list = new ArrayList<>();
        String query = "SELECT jk.* FROM jadwal_kuliah jk JOIN mata_kuliah mk ON jk.kode_mk = mk.kode_mk WHERE mk.semester = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, semester);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(new JadwalKuliah(
                    rs.getInt("id_jadwal"),
                    rs.getString("kode_mk"),
                    rs.getString("kelas"),
                    rs.getString("hari"),
                    rs.getString("jam_mulai"),
                    rs.getString("jam_selesai"),
                    rs.getString("dosen_pengajar"),
                    rs.getString("ruang")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data jadwal kuliah: " + e.getMessage());
        }
        return list;
    }
}

