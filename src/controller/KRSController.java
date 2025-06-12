/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Krs;
import model.KrsDAO;
import java.util.List;

public class KRSController {
    private KrsDAO dao;

    public KRSController() {
        dao = new KrsDAO();
    }

    public void tambahKrs(String nim, int idJadwal) {
        Krs krs = new Krs(nim, idJadwal);
        dao.tambahKrs(krs);
    }

    public List<Krs> getKrsMahasiswa(String nim) {
        return dao.getDataKrs(nim);
    }

    public void hapusKrs(int idKrs) {
        dao.hapusKrs(idKrs);
    }

    public void updateKrs(int idKrs, int idJadwalBaru) {
        dao.updateKrs(idKrs, idJadwalBaru);
    }
}

