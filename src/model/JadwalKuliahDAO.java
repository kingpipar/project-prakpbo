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
        String query = "SELECT jk.*,mk.* FROM jadwal_kuliah jk JOIN matakuliah mk ON jk.kode_mk = mk.kode_mk WHERE mk.semester = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, semester);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String kodeMk = rs.getString("kode_mk");
                    String namaMk = rs.getString("nama_mk");
                    int sem = rs.getInt("semester");
                    int sks = rs.getInt("sks");

                    // Gabungan string jadi format jadwal: "Senin, 08:00-10:00 (Ruang 101)"
                    String jadwal = rs.getString("hari") + ", "
                            + rs.getString("jam_mulai") + "-"
                            + rs.getString("jam_selesai") + " (Ruang "
                            + rs.getString("ruang") + ")";

                    String dosen = rs.getString("dosen_pengajar");

                    JadwalKuliah jk = new JadwalKuliah(kodeMk, namaMk, sem, sks, jadwal, dosen);
                    list.add(jk);
                }
            }
        } catch (SQLException e) {
            System.err.println("Gagal mengambil data jadwal kuliah: " + e.getMessage());
        }

        return list;
    }

    public int getTotalSKSTempuh(String nim) {
        int totalSKS = 0;
        String sql = "SELECT SUM(mk.sks) AS total_sks "
                + "FROM krs k "
                + "JOIN matakuliah mk ON k.kode_mk = mk.kode_mk "
                + "WHERE k.nim = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nim);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                totalSKS = rs.getInt("total_sks");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalSKS;
    }

}
