package com.domain.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "test")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String kode;

    @Column(name="product_nama", length = 100)
    private String nama;

    @Column(name="product_gudang", length=500)
    private String gudang;

    private String bnsnonmlm;

    public Product() {

    }

    public Product(Long id, String kode, String nama, String gudang, String bnsnonmlm) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
        this.gudang = gudang;
        this.bnsnonmlm = bnsnonmlm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGudang() {
        return gudang;
    }

    public void setGudang(String gudang) {
        this.gudang = gudang;
    }

    public String getBnsnonmlm() {
        return bnsnonmlm;
    }

    public void setBnsnonmlm(String bnsnonmlm) {
        this.bnsnonmlm = bnsnonmlm;
    }

        
}
