/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author ACER
 */
import javax.swing.*;
import java.awt.*;

public class EditKRSView extends JFrame {
    private JLabel lblJadwal;
    private JComboBox<String> comboJadwalBaru;
    private JButton btnSimpan, btnBatal;

    public EditKRSView() {
        setTitle("Edit KRS");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        lblJadwal = new JLabel("Pilih Jadwal Baru:");
        comboJadwalBaru = new JComboBox<>();
        btnSimpan = new JButton("Simpan");
        btnBatal = new JButton("Batal");

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(lblJadwal);
        panel.add(comboJadwalBaru);
        panel.add(btnSimpan);
        panel.add(btnBatal);

        add(panel);
    }

    public JComboBox<String> getComboJadwalBaru() {
        return comboJadwalBaru;
    }

    public JButton getBtnSimpan() {
        return btnSimpan;
    }

    public JButton getBtnBatal() {
        return btnBatal;
    }
}

