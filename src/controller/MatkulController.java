package controller;

import model.MatakuliahDAO;
import model.Mahasiswa;
import model.Matakuliah;
import view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import model.JadwalKuliah;
import model.JadwalKuliahDAO;

public class MatkulController {
    private MatkulView matkul;
    private Mahasiswa mahasiswa;
    private JadwalKuliahDAO dao; // ⬅️ Tambahkan DAO

    public MatkulController(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.dao = new JadwalKuliahDAO(); // ⬅️ Inisialisasi DAO
        this.matkul = new MatkulView();

        matkul.setMahasiswa(mahasiswa); // tampilkan nama/nim, jika perlu
        initController();
        matkul.setVisible(true);

        loadDataMatkul(); // ⬅️ Tampilkan data awal
    }

    private void initController() {
        // ⬇️ Tambahkan listener untuk comboBox semester
        matkul.getComboBoxSemester().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadDataMatkul();
            }
        });

        // Tombol sidebar
        matkul.getBtnDashboard().addActionListener(e -> {
            new DashboardController(mahasiswa);
            matkul.dispose();
        });

        matkul.getBtnInputKRS().addActionListener(e -> {
            new InputKRSController(mahasiswa);
            matkul.dispose();
        });

        matkul.getBtnJadwal().addActionListener(e -> {
            new JadwalController(mahasiswa);
            matkul.dispose();
        });

        matkul.getBtnMataKuliah().addActionListener(e -> {
            JOptionPane.showMessageDialog(matkul, "Kamu sudah di Matakuliah.");
        });

        matkul.getBtnLogout().addActionListener(e -> {
            int konfirmasi = JOptionPane.showConfirmDialog(matkul, "Yakin ingin logout?", "Logout", JOptionPane.YES_NO_OPTION);
            if (konfirmasi == JOptionPane.YES_OPTION) {
                LoginView view = new LoginView();
                new LoginController(view);
                view.setVisible(true);
                matkul.dispose();
            }
        });
    }

    private void loadDataMatkul() {
        try {
        String selected = matkul.getSelectedSemester(); // Ambil dari comboBox (misalnya: "1")
        int semester = Integer.parseInt(selected);      // Konversi ke integer
        List<JadwalKuliah> daftar = dao.getAllJadwalBySemester(semester); // Panggil DAO
        matkul.setTableData(daftar);                    // Tampilkan di tabel
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(matkul, "Semester tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
}
