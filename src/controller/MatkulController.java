/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Mahasiswa;
import view.*;
/**
 *
 * @author ACER
 */
import javax.swing.JOptionPane;

public class MatkulController {
    private MatkulView matkul;
    private Mahasiswa mahasiswa;

    public MatkulController(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.matkul = new MatkulView();
        matkul.setMahasiswa(mahasiswa); // tampilkan nama/nim, jika perlu
        initController();
        matkul.setVisible(true);
    }

    private void initController() {
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
                new LoginView().setVisible(true);
                matkul.dispose();
            }
        });
    }
}
