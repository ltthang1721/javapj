package models;

public class khachHang {
     String MaKH;
     String TenKh;
     String SoDT;
     String Email;
     String DiaChi;
    public khachHang(String MaKH, String TenKH, String SoDT, String Email, String DiaChi){
        this.MaKH = MaKH;
        this.TenKh = TenKH;
        this.SoDT = SoDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
    }

    public String getMaKH() {
        return MaKH;
    }
    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getTenKh() {
        return TenKh;
    }

    public void setTenKh(String tenKh) {
        TenKh = tenKh;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String soDT) {
        SoDT = soDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
}
