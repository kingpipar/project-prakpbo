/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Matakuliah;
import model.MatakuliahDAO;
import java.util.List;

/**
 *
 * @author user
 */
public class MataKuliahController {
    
    private MatakuliahDAO dao;

    public MataKuliahController() {
        dao = new MatakuliahDAO();
    }

    // Ambil semua matkul dari semester tertentu (yang sedang ditempuh mahasiswa)
    public List<Matakuliah> getMatakuliahBySemester(int semester) {
        return dao.getMatakuliahBySemester(semester);
    }

    // (Opsional) Ambil semua matkul dari database
    public List<Matakuliah> getAllMatakuliah() {
        return dao.getAllMatakuliah();
    }
}
