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

public class JadwalController {
    private JadwalView jadwal;
    private Mahasiswa mahasiswa;

    public JadwalController(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.jadwal = new JadwalView();
        jadwal.setMahasiswa(mahasiswa); // tampilkan nama/nim, jika perlu
        initController();
        jadwal.setVisible(true);
    }

    private void initController() {
        // Tombol sidebar
        jadwal.getBtnDashboard().addActionListener(e -> {
            new DashboardController(mahasiswa);
            jadwal.dispose();
        });

        jadwal.getBtnInputKRS().addActionListener(e -> {
            new InputKRSController(mahasiswa);
            jadwal.dispose();
        });

        jadwal.getBtnJadwal().addActionListener(e -> {
           JOptionPane.showMessageDialog(jadwal, "Kamu sudah di Jadwal Kuliah.");
           
        });

        jadwal.getBtnMataKuliah().addActionListener(e -> {
            new MatkulController(mahasiswa);
            jadwal.dispose();
        });

        jadwal.getBtnLogout().addActionListener(e -> {
            int konfirmasi = JOptionPane.showConfirmDialog(jadwal, "Yakin ingin logout?", "Logout", JOptionPane.YES_NO_OPTION);
            if (konfirmasi == JOptionPane.YES_OPTION) {
                new LoginView().setVisible(true);
                jadwal.dispose();
            }
        });
    }
}
