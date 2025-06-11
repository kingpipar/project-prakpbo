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
    private String kode_mk;
    
    public Krs(int id_krs, String nim, String kode_mk){
        this.id_krs = id_krs;
        this.nim = nim;
        this.kode_mk = kode_mk;
    }
    //overloading
    public Krs(String nim, String kode_mk){
        this.nim = nim;
        this.kode_mk = kode_mk;
    }
    
    //getter dan setter
    
    //getter
    public int getIdKrs(){
        return id_krs;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getKodeMk(){
        return kode_mk;
    }
    
    //setter
    public void setIdKrs(int id_krs) {
    this.id_krs = id_krs;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setKodeMk(String kode_mk){
        this.kode_mk = kode_mk;
    }
}
