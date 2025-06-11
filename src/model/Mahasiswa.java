/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
    
<<<<<<< HEAD:src/model/Mahasiswa.java
    
=======
>>>>>>> bdc7545c88a2178dda6b7dbf47cdc0596af46eaa:src/prakpbo_krs/model/Mahasiswa.java
}
