package prakpbo_krs.model;

import prakpbo_krs.Connector;
import java.util.ArrayList;
import java.sql.*;

public class ModelMatakuliah {

    public ArrayList<Matakuliah> getDataMatkul() {
        ArrayList<Matakuliah> listMatkul = new ArrayList<>();
        Connector connect = new Connector(); 

        try {
            Connection conn = connect.koneksi; 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Matakuliah");

            while (rs.next()) {
                Matakuliah mk = new Matakuliah(
                        rs.getString("kodeMatkul"),
                        rs.getString("namaMatkul"),
                        rs.getInt("sks"),
                        rs.getString("hari"),
                        rs.getString("jamMulai"),
                        rs.getString("jamSelesai"),
                        rs.getString("dosenPengajar")
                );
                listMatkul.add(mk);
            }

        } catch (SQLException e) {
            e.printStackTrace(); 
        }

        return listMatkul; 
    }
    
    
}
