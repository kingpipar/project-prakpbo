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

public class InputKRSController {
    private InputKRSView InputKRSView;
    private Mahasiswa mahasiswa;

    public InputKRSController(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        InputKRSView = new InputKRSView();
        InputKRSView.setMahasiswa(mahasiswa); // tampilkan nama/nim, jika perlu
        initController();
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
            new JadwalView().setVisible(true); // bisa pakai controller nanti
            InputKRSView.dispose();
        });

        InputKRSView.getBtnMataKuliah().addActionListener(e -> {
            new MatkulView().setVisible(true); // bisa pakai controller nanti
            InputKRSView.dispose();
        });

        InputKRSView.getBtnLogout().addActionListener(e -> {
            int konfirmasi = JOptionPane.showConfirmDialog(InputKRSView, "Yakin ingin logout?", "Logout", JOptionPane.YES_NO_OPTION);
            if (konfirmasi == JOptionPane.YES_OPTION) {
                new LoginView().setVisible(true);
                InputKRSView.dispose();
            }
        });
    }
}
