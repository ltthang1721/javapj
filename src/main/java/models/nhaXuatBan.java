package models;

public class nhaXuatBan {
    String MaNXB;
    String TenNXB;
    String Email;
    public nhaXuatBan(String maNXB, String tenNXB, String email){
        this.MaNXB = maNXB;
        this.TenNXB = tenNXB;
        this.Email = email;
    }
    public String getMaNXB(){
        return this.MaNXB;
    }
    public void setMaNXB(String maNXB){
        this.MaNXB = maNXB;
    }

    public String getTenNXB(){
        return this.TenNXB;
    }
    public void setTenNXB(String tenNXB) {
        this.TenNXB = tenNXB;
    }

    public String getEmail(){
        return this.Email;
    }
    public void setEmail(String email){
        this.Email = email;
    }
}
