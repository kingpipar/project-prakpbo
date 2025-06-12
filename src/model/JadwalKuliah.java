package model;

public class JadwalKuliah {
    private int id_jadwal;
    private String kode_mk;
    private String kelas;
    private String hari;
    private String jam_mulai;
    private String jam_selesai;
    private String dosen_pengajar;
    private String ruang;

    public JadwalKuliah(int id_jadwal, String kode_mk, String kelas, String hari,
                        String jam_mulai, String jam_selesai, String dosen_pengajar, String ruang) {
        this.id_jadwal = id_jadwal;
        this.kode_mk = kode_mk;
        this.kelas = kelas;
        this.hari = hari;
        this.jam_mulai = jam_mulai;
        this.jam_selesai = jam_selesai;
        this.dosen_pengajar = dosen_pengajar;
        this.ruang = ruang;
    }

    public int getIdJadwal() { 
        return id_jadwal; 
    }
    
    public String getKodeMk() { 
        return kode_mk; 
    }
    
    public String getKelas() { 
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
    
    public String getRuang() { 
        return ruang; 
    }
}
