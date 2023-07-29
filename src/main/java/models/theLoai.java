package models;

public class theLoai {
    String MaTL;
    String TenTL;
    String Mota;

    public theLoai(String MaTL, String TenTL, String Mota){
        this.MaTL = MaTL;
        this.TenTL = TenTL;
        this.Mota = Mota;
    }

    public String getMaTL(){
        return this.MaTL;
    }
    public void setMaTL(String MaTL){
        this.MaTL = MaTL;
    }

    public String getTenTL(){
        return this.TenTL;
    }
    public void setTenTL(String TenML){
        this.TenTL = TenML;
    }

    public String getMota(){
        return this.Mota;
    }
    public void setMota(String mota){
        this.Mota = mota;
    }

}
