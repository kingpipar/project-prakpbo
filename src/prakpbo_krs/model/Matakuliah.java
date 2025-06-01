/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpbo_krs.model;

/**
 *
 * @author ACER
 */
public class Matakuliah {
    private String kodeMatkul;
    private String namaMatkul;
    private int sks;
    private String hari;
    private String jamMulai;
    private String jamSelesai;
    private String dosenPengajar;
    
    public Matakuliah(String kodeMatkul, String namaMatkul, int sks, String hari, String jamMulai, String jamSelesai, String dosenPengajar){
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.dosenPengajar = dosenPengajar;
    }
    
    //setter dan getter
    public String getKodeMatkul() {
        return kodeMatkul;
    }
    public String getNamaMatkul() {
        return namaMatkul;
    }
    public int getSks() {
        return sks;
    }
    public String getHari() {
        return hari;
    }
    public String getJamMulai() {
        return jamMulai;
    }
    public String getJamSelesai() {
        return jamSelesai;
    }
    public String getDosenPengajar() {
        return dosenPengajar;
    }
}



