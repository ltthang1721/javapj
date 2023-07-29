package models;

public class sach {
    String MaSach;
    String TenSach;
    String MaTL;
    String MaNXB;
    String MaTG;
    String SL;
    String GiaTien;
    String Hinh;
    String UuTien;
    String MaDM;
    public sach(String maSach, String tenSach, String maTL, String maNXB, String maTG, String SL, String giaTien, String hinh, String uuTien, String maDM){
        this.MaSach = maSach;
        this.TenSach = tenSach;
        this.MaTL = maTL;
        this.MaNXB = maNXB;
        this.MaTG = maTG;
        this.SL = SL;
        this.GiaTien = giaTien;
        this.Hinh = hinh;
        this.UuTien = uuTien;
        this.MaDM = maDM;
    }
    public String getMaSach(){
        return this.MaSach;
    }
    public void setMaSach(String maSach){
        this.MaSach = maSach;
    }
    public String getTenSach(){
        return this.TenSach;
    }
    public void setTenSach(String tenSach){
        this.TenSach = tenSach;
    }

    public String getMaTL(){
        return this.MaTL;
    }
    public void setMaTL(String maTL){
        this.MaTL = maTL;
    }

    public String getMaNXB(){
        return this.MaNXB;
    }
    public void setMaNXB(String maNXB){
        this.MaNXB = maNXB;
    }

    public String getMaTG(){
        return this.MaTG;
    }
    public void setMaTG(String maTG){
        this.MaTG = maTG;
    }
    public String getSL(){
        return this.SL;
    }
    public void setSL(String sl){
        this.SL = sl;
    }
    public String getGiaTien(){
        return this.GiaTien;
    }
    public void setGiaTien(String giaTien){
        this.GiaTien = giaTien;
    }
    public String getHinh(){
        return this.Hinh;
    }
    public void setHinh(String hinh){
        this.Hinh = hinh;
    }
    public String getUuTien(){
        return this.UuTien;
    }
    public void setUuTien(String uuTien){
        this.UuTien = uuTien;
    }
    public String getMaDM(){
        return this.MaDM;
    }
    public void setMaDM(String maDM){
        this.MaDM = maDM;
    }
}
