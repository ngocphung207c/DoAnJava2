package quanlykhachsan.entity;
// Generated Jun 1, 2019 12:10:57 AM by Hibernate Tools 4.3.1



/**
 * Loaiphong generated by hbm2java
 */
public class Loaiphong  implements java.io.Serializable {


     private Integer maLoai;
     private String tenLoai;
     private Float donGia;

    public Loaiphong() {
    }

    public Loaiphong(String tenLoai, Float donGia) {
       this.tenLoai = tenLoai;
       this.donGia = donGia;
    }
   
    public Integer getMaLoai() {
        return this.maLoai;
    }
    
    public void setMaLoai(Integer maLoai) {
        this.maLoai = maLoai;
    }
    public String getTenLoai() {
        return this.tenLoai;
    }
    
    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
    public Float getDonGia() {
        return this.donGia;
    }
    
    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }
 @Override
    public String toString()
    {
        return this.tenLoai;
    }



}


