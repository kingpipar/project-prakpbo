package controller;

import model.Mahasiswa;
import model.MahasiswaDAO;

public class LoginController {

    public MahasiswaDAO mahasiswaDAO;

    public LoginController() {
        mahasiswaDAO = new MahasiswaDAO();
    }

    // Method untuk login, mengembalikan objek Mahasiswa jika berhasil, null jika gagal
    public Mahasiswa login(String nim, String password) {
        Mahasiswa mhs = mahasiswaDAO.loginMahasiswa(nim, password);
        if (mhs != null) {
            System.out.println("Login berhasil! Selamat datang, " + mhs.getNamaMhs());
            return mhs;
        } else {
            System.out.println("Login gagal! NIM atau password salah.");
            return null;
        }
    }
}
