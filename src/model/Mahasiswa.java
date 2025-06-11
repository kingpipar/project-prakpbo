/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpbo_krs.model;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String password;
    private String prodi;
    private int semester;
    
    public Mahasiswa(String nim, String nama, String password, String prodi, int semester){
        this.nim = nim;
        this.nama = nama;
        this.password = password;
        this.prodi = prodi;
        this.semester = semester;
    }
    
    //setter dan getter
    //getter
    public String getNim() {
        return nim;
    }
    public String getNamaMhs() {
        return nama;
    }
    public int getSemester() {
        return semester;
    }
    public String getProdi() {
        return prodi;
    }
    public String getPassword() {
        return password;
    }
    
    //setter
    public void setNim() {
        this.nim = nim;
    }
    
    public void setNamaMhs() {
        this.nama = nama;
    }
    
    public void setSemester() {
        this.semester = semester;
    }
    
    public void setProdi() {
        this.prodi = prodi;
    }
    
    public void setPassword() {
        this.password = password;
    }
    
}
