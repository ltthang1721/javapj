package models;

public class nhanVien {
    String Manv;
    String TenNV;
    String SoDT;
    String Email;
    String ChucVu;

    public nhanVien(String Manv, String TenNV, String SoDT, String Email, String ChucVu){
        this.Manv = Manv;
        this.TenNV = TenNV;
        this.SoDT = SoDT;
        this.Email = Email;
        this.ChucVu = ChucVu;
    }

    public String getManv(){
        return this.Manv;
    }
    public void setManv(String manv){
        this.Manv = manv;
    }

    public String getTenNV(){
        return this.TenNV;
    }
    public void setTenNV(String tenNV){
        this.TenNV = tenNV;
    }

    public String getSoDT(){
        return this.SoDT;
    }
    public void setSoDT(String SoDT){
        this.SoDT = SoDT;
    }

    public String getEmail(){
        return this.Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getChucVu(){
        return this.ChucVu;
    }
    public void setChucVu(String ChucVu){
        this.ChucVu = ChucVu;
    }




}
