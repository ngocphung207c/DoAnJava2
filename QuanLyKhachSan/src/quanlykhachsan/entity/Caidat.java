package quanlykhachsan.entity;
// Generated Jun 1, 2019 12:10:57 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Caidat generated by hbm2java
 */
public class Caidat  implements java.io.Serializable {


     private Integer id;
     private float tyLePhuThu;
     private int soKhachToiDa;
     private Date ngayBatDau;

    public Caidat() {
    }

    public Caidat(float tyLePhuThu, int soKhachToiDa, Date ngayBatDau) {
       this.tyLePhuThu = tyLePhuThu;
       this.soKhachToiDa = soKhachToiDa;
       this.ngayBatDau = ngayBatDau;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public float getTyLePhuThu() {
        return this.tyLePhuThu;
    }
    
    public void setTyLePhuThu(float tyLePhuThu) {
        this.tyLePhuThu = tyLePhuThu;
    }
    public int getSoKhachToiDa() {
        return this.soKhachToiDa;
    }
    
    public void setSoKhachToiDa(int soKhachToiDa) {
        this.soKhachToiDa = soKhachToiDa;
    }
    public Date getNgayBatDau() {
        return this.ngayBatDau;
    }
    
    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }




}


