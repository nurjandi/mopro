package com.example.jandi.tugas1;

public class Model_Pesanan {
    private String nama;
    private String total;

    public Model_Pesanan(String nama, String total) {
        this.total = total;
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
