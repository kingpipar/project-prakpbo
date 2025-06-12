/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author ACER
 */
import javax.swing.JOptionPane;
import model.Mahasiswa;
import view.*;

public class DashboardController {
    private DashboardView dashboardView;
    private Mahasiswa mahasiswa;

    public DashboardController(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.dashboardView = new DashboardView();
        dashboardView.setMahasiswa(mahasiswa); // isi label dari model
        initController();
        dashboardView.setVisible(true);
    }
    
    private void initController() {
        dashboardView.getBtnDashboard().addActionListener(e -> {
            JOptionPane.showMessageDialog(dashboardView, "Kamu sudah di Dashboard.");
        });

        dashboardView.getBtnInputKRS().addActionListener(e -> {
            new InputKRSController(mahasiswa);
            dashboardView.dispose();
        });

        dashboardView.getBtnJadwal().addActionListener(e -> {
            new JadwalController(mahasiswa);
            dashboardView.dispose();
        });

        dashboardView.getBtnMataKuliah().addActionListener(e -> {
            new MatkulController(mahasiswa);
            dashboardView.dispose();
        });

        dashboardView.getBtnLogout().addActionListener(e -> {
            int konfirmasi = JOptionPane.showConfirmDialog(dashboardView, "Yakin ingin logout?", "Logout", JOptionPane.YES_NO_OPTION);
            if (konfirmasi == JOptionPane.YES_OPTION) {
                new LoginView().setVisible(true);
                dashboardView.dispose();
            }
        });
    }
    
    
}