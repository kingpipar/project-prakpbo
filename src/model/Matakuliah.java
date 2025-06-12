/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Matakuliah {
    private String kode_mk;
    private String nama_mk;
    private int sks;
    private int semester;
    
    public Matakuliah(String kode_mk, String nama_mk, int sks,int semester){
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
        this.sks = sks;
        this.semester = semester;

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
}