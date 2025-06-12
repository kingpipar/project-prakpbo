/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import model.Mahasiswa;
import view.*;
/**
 *
 * @author ACER
 */
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.JadwalKuliah;
import model.JadwalKuliahDAO;
import model.Krs;
import model.KrsDAO;

public class InputKRSController {
    private InputKRSView InputKRSView;
    private Mahasiswa mahasiswa;
    private JadwalKuliahDAO dao;
    private KrsDAO krs;

    public InputKRSController(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.InputKRSView = new InputKRSView();
        this.dao = new JadwalKuliahDAO();
        this.krs = new KrsDAO();
        InputKRSView.setMahasiswa(mahasiswa); // tampilkan nama/nim, jika perlu
        initController();
        loadDataMatkulBySemester();
        InputKRSView.setVisible(true);
    }

    private void initController() {
        // Tombol sidebar
        InputKRSView.getBtnDashboard().addActionListener(e -> {
            new DashboardController(mahasiswa);
            InputKRSView.dispose();
        });

        InputKRSView.getBtnInputKRS().addActionListener(e -> {
            JOptionPane.showMessageDialog(InputKRSView, "Kamu sudah di Input KRS.");
        });

        InputKRSView.getBtnJadwal().addActionListener(e -> {
            new JadwalController(mahasiswa);
            InputKRSView.dispose();
        });

        InputKRSView.getBtnMataKuliah().addActionListener(e -> {
            new MatkulController(mahasiswa);
            InputKRSView.dispose();
        });

        InputKRSView.getBtnLogout().addActionListener(e -> {
            int konfirmasi = JOptionPane.showConfirmDialog(InputKRSView, "Yakin ingin logout?", "Logout", JOptionPane.YES_NO_OPTION);
            if (konfirmasi == JOptionPane.YES_OPTION) {
                LoginView view = new LoginView();
                new LoginController(view); 
                view.setVisible(true);
                InputKRSView.dispose();
            }
        });
        
        InputKRSView.getBtnSimpan().addActionListener(e -> {
        if (cekJadwalBentrok()) {
            simpanKRS(); // panggil method simpan
        }
});
        
    }
    
    private void loadDataMatkulBySemester() {
        int semester = mahasiswa.getSemester();
        List<JadwalKuliah> daftarMatkul = dao.getAllJadwalBySemester(semester);
        InputKRSView.setTableData(daftarMatkul);
    }
    
    private boolean cekJadwalBentrok() {
        Set<String> jadwalTerpilih = new HashSet<>();

        JTable table = InputKRSView.getTableMatkul(); // akses tabel dari view
        for (int i = 0; i < table.getRowCount(); i++) {
            Boolean dipilih = (Boolean) table.getValueAt(i, 0); // kolom checkbox
            if (dipilih != null && dipilih) {
                String jadwal = table.getValueAt(i, 5).toString(); // kolom jadwal
                if (jadwalTerpilih.contains(jadwal)) {
                    JOptionPane.showMessageDialog(InputKRSView,
                        "Terdapat jadwal yang bentrok: " + jadwal,
                        "Jadwal Bentrok", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                jadwalTerpilih.add(jadwal);
            }
        }

        return true; 
    }
    
    private void simpanKRS() {
        JTable table = InputKRSView.getTableMatkul();
        List<Integer> idJadwalTerpilih = new java.util.ArrayList<>();

        for (int i = 0; i < table.getRowCount(); i++) {
            Boolean dipilih = (Boolean) table.getValueAt(i, 0);
            if (dipilih != null && dipilih) {
                int idJadwal = Integer.parseInt(table.getValueAt(i, 1).toString()); 
                idJadwalTerpilih.add(idJadwal);
            }
        }

        if (idJadwalTerpilih.isEmpty()) {
            JOptionPane.showMessageDialog(InputKRSView, "Pilih minimal satu mata kuliah terlebih dahulu.");
            return;
        }

        for (Integer idJadwal : idJadwalTerpilih) {
        Krs krsData = new Krs(mahasiswa.getNim(),idJadwal); 
        krs.tambahKrs(krsData); 
    }

        JOptionPane.showMessageDialog(InputKRSView, "KRS berhasil disimpan!");
    }


}
