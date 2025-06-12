package controller;

import java.util.List;
import model.JadwalKuliah;
import model.JadwalKuliahDAO;

public class JadwalKuliahController {
    private JadwalKuliahDAO jadwalDAO;

    public JadwalKuliahController() {
        jadwalDAO = new JadwalKuliahDAO();
    }

    /**
     * Mengambil semua data jadwal kuliah berdasarkan semester.
     * @param semester semester yang sedang ditempuh mahasiswa
     * @return daftar jadwal kuliah
     */
    public List<JadwalKuliah> getJadwalBySemester(int semester) {
        return jadwalDAO.getAllJadwalBySemester(semester);
    }
}
