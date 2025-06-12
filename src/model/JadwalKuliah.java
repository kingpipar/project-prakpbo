package model;

public class JadwalKuliah {
    // Atribut dari tabel jadwal_kuliah
    private int id_jadwal;
    private String kode_mk;
    private String kelas;
    private String hari;
    private String jam_mulai;
    private String jam_selesai;
    private String dosen_pengajar;
    private String ruang;

    // Atribut tambahan dari join dengan mata_kuliah
    private String namaMk;
    private int semester;
    private int sks;
    private String jadwal; // gabungan hari + jam + ruang

    // Konstruktor untuk data lengkap dari tabel jadwal_kuliah
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

    // Konstruktor gabungan untuk tampilan ringkasan jadwal
    public JadwalKuliah(String kodeMk, String namaMk, int semester, int sks, String jadwal, String dosenPengajar) {
        this.kode_mk = kodeMk;
        this.namaMk = namaMk;
        this.semester = semester;
        this.sks = sks;
        this.jadwal = jadwal;
        this.dosen_pengajar = dosenPengajar;
    }

    // Getter
    public int getIdJadwal() {
        return id_jadwal;
    }

    public String getKodeMatkul() {
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

    public String getNamaMatkul() {
        return namaMk;
    }

    public int getSemester() {
        return semester;
    }

    public int getSks() {
        return sks;
    }

    public String getJadwal() {
        return jadwal;
    }
}
