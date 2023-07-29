package models;

public class tacGia {
    String MaTG;
    String TenTG;
    String Email;
    String SoDT;
    public tacGia(String MaTG, String TenTG, String Email, String SoDT){
        this.MaTG = MaTG;
        this.TenTG = TenTG;
        this.Email = Email;
        this.SoDT = SoDT;
    }
    public String getMaTG(){
        return this.MaTG;
    }
    public void setMaTG(String MaTG){
        this.MaTG = MaTG;
    }

    public String getTenTG(){
        return this.TenTG;
    }
    public void setTenTG(String TenTG){
        this.TenTG = TenTG;
    }

    public String getEmail(){
        return this.Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getSoDT(){
        return this.SoDT;
    }
    public void setSoTG(String SoDT){
        this.SoDT = SoDT;
    }
}
