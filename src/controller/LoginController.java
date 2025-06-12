package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Mahasiswa;
import model.MahasiswaDAO;
import view.DashboardView;
import view.LoginView;

public class LoginController {
    private LoginView view;
    private MahasiswaDAO dao;

    public LoginController(LoginView view) {
        this.view = view;
        this.dao = new MahasiswaDAO();

        // Tambahkan action listener ke tombol login
        this.view.addLoginListener(new LoginAction());
    }

    class LoginAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nim = view.getNIM();      // kamu bisa rename getEmail() -> getNIM() jika lebih sesuai
            String password = view.getPassword();
            
            //cek login
            Mahasiswa mhs = dao.loginMahasiswa(nim, password);
            if (mhs != null) {               
                 // Tutup login form
                view.dispose();
                // Buka dashboard
                new DashboardController(mhs); // kirim data mahasiswa ke dashboard
                view.dispose(); // tutup halaman login
            } else {
                view.showMessage("Login gagal! NIM atau password salah.");
            }
        }
    }
}
