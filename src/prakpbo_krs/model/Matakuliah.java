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
    private String kode_mk;
    private String nama_mk;
    private int sks;
    private int semester;
    private String kelas;
    private String hari;
    private String jam_mulai;
    private String jam_selesai;
    private String dosen_pengajar;
    
    public Matakuliah(String kode_mk, String nama_mk, int sks,int semester, String kelas, String hari, String jam_mulai, String jam_selesai, String dosen_pengajar){
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
        this.sks = sks;
        this.semester = semester;
        this.kelas = kelas;
        this.hari = hari;
        this.jam_mulai = jam_mulai;
        this.jam_selesai = jam_selesai;
        this.dosen_pengajar = dosen_pengajar;
    }
    
    //setter dan getter
    
    //getter
    public String getKodeMatkul() {
        return kode_mk;
    }
    public String getNamaMatkul() {
        return nama_mk;
    }
    public int getSks() {
        return sks;
    }
    public int getSemester(){
        return semester;
    }
    public String getKelas(){
        return kelas;
    }
    public String getHari() {
        return hari;
    }
    public String getJamMulai() {
        return jam_mulai;
    }
    public String getJamSelesai() {
        return jam_selesai;
    }
    public String getDosenPengajar() {
        return dosen_pengajar;
    }
}



