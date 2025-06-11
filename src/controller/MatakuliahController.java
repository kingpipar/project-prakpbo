package controller;

import model.Matakuliah;
import model.MatakuliahDAO;
import java.util.List;

/**
 *
 * @author user
 */
public class MatakuliahController {
    
    private MatakuliahDAO dao;

    public MatakuliahController() {
        dao = new MatakuliahDAO();
    }

    // Ambil semua matkul dari semester tertentu (yang sedang ditempuh mahasiswa)
    public List<Matakuliah> getMatakuliahBySemester(int semester) {
        return dao.getMatakuliahBySemester(semester);
    }
}