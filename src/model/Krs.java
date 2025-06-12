/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Krs {
    private int id_krs;
    private String nim;
    private int id_jadwal;

    public Krs(int id_krs, String nim, int id_jadwal) {
        this.id_krs = id_krs;
        this.nim = nim;
        this.id_jadwal = id_jadwal;
    }

    public Krs(String nim, int id_jadwal) {
        this.nim = nim;
        this.id_jadwal = id_jadwal;
    }

    public int getIdKrs() {
        return id_krs;
    }

    public String getNim() {
        return nim;
    }

    public int getIdJadwal() {
        return id_jadwal;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIdJadwal(int id_jadwal) {
        this.id_jadwal = id_jadwal;
    }
}

