package com.hrdini.sqllitedatabase;

public class Barang {

    private String idbarang,barang,stok,harga;

    public Barang(String idbarang, String barang, String stok, String harga) {
        this.idbarang = idbarang;
        this.barang = barang;
        this.stok = stok;
        this.harga = harga;
    }

    public String getIdbarang() {
        return idbarang;
    }

    public String getBarang() {
        return barang;
    }

    public String getStok() {
        return stok;
    }

    public String getHarga() {
        return harga;
    }
}
