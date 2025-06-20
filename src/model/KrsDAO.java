package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import prakpbo_krs.Connector;


public class KrsDAO {
    private Connection conn;

    public KrsDAO() {
        Connector connector = new Connector();
        this.conn = connector.koneksi;
    }

    // Menambahkan data KRS baru
    public void tambahKrs(Krs krs) {
        String query = "INSERT INTO krs (nim, id_jadwal) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, krs.getNim());
            stmt.setInt(2, krs.getIdJadwal());
            stmt.executeUpdate();
            System.out.println("KRS berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println("Gagal menambahkan KRS: " + e.getMessage());
        }
    }

    // Menampilkan seluruh KRS berdasarkan NIM
    public List<Krs> getDataKrs(String nim) {
        List<Krs> daftarKrs = new ArrayList<>();
        String query = "SELECT * FROM krs WHERE nim = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nim);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idKrs = rs.getInt("id_krs");
                int idJadwal = rs.getInt("id_jadwal");
                Krs krs = new Krs(idKrs, nim, idJadwal);
                daftarKrs.add(krs);
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data KRS: " + e.getMessage());
        }
        return daftarKrs;
    }

    // Menghapus KRS berdasarkan id_krs
    public void hapusKrs(int idKrs) {
        String query = "DELETE FROM krs WHERE id_krs = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idKrs);
            stmt.executeUpdate();
            System.out.println("KRS berhasil dihapus.");
        } catch (SQLException e) {
            System.out.println("Gagal menghapus KRS: " + e.getMessage());
        }
    }

    //  Mengupdate id_jadwal untuk KRS tertentu
    public void updateKrs(int idKrs, int idJadwalBaru) {
        String query = "UPDATE krs SET id_jadwal = ? WHERE id_krs = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idJadwalBaru);
            stmt.setInt(2, idKrs);
            stmt.executeUpdate();
            System.out.println("KRS berhasil diperbarui.");
        } catch (SQLException e) {
            System.out.println("Gagal memperbarui KRS: " + e.getMessage());
        }
    }
}
