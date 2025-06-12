/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author ACER
 */
import model.Mahasiswa;
import view.DashboardView;

public class DashboardController {
    private DashboardView dashboardView;
    private Mahasiswa mahasiswa;

    public DashboardController(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        dashboardView = new DashboardView();
        dashboardView.setMahasiswa(mahasiswa); // isi label dari model
        dashboardView.setVisible(true);
    }
    
    
}