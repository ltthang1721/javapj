import dao.*;
import models.*;

public class hello {
    public static void main( String[] args ) {
        nhanVienDAO nhanVienDAO = new nhanVienDAO();
//            nhanVienDAO.insertNV(new nhanVien("007", "Hang", "098765432", "hang@gmail.com", "NULL"));
//            nhanVienDAO.updateNV(new nhanVien("007", "ltthang", "0988999999", "ltthang@gmail.com", "NULL"));
//            nhanVienDAO.deleteNV((new nhanVien("nv1","ltthang","0988999999", "ltthang@gmail.com","NULL")));

        khachHangDAO khachHangDAO = new khachHangDAO();
//            khachHangDAO.insertKH(new khachHang("005", "Hang","0999", "hang@gmail.com","HCM"));
//            khachHangDAO.updateKH(new khachHang("005","Thuy Hang", "0987654321","thuyhang@gmail.com","CT"));
//            khachHangDAO.deleteKH(new khachHang("005", "abc","09","email","khong co"));

        nhaXuatBanDAO nhaXuatBanDAO = new nhaXuatBanDAO();
//        nhaXuatBanDAO.insertNXB(new nhaXuatBan("nxb2","NXB2","nxb2@gmail.com"));
//        nhaXuatBanDAO.updateNXB(new nhaXuatBan("nxb2", "Nha Xuat Ban 2", "null"));
//        nhaXuatBanDAO.deleteNXB(new nhaXuatBan("nxb2","Nha Xuat Ban 2", "null"));

        sachDAO sachDAO = new sachDAO();
//            sachDAO.insertSach(new sach("s2","Sach 2", "tl1","NXB001","tg1", "10","123000","","1","001"));
//            sachDAO.updateSach(new sach("s2","Harry Potter", "tl1","NXB001","tg1", "10","123000","","0","0"));
//            sachDAO.deleteSach(new sach("s1","Harry Potter","tl1","nxb1","tg1","1","12345","","1","1"));

        tacGiaDAO tacGiaDAO = new tacGiaDAO();
//            tacGiaDAO.insertTG(new tacGia("TG006","Tac Gia 006","tg006@gmail.com","098765432"));
//            tacGiaDAO.updateTG(new tacGia("TG006","TG006","tg006@gmail.com","098765432"));
//            tacGiaDAO.deleteTG(new tacGia("TG006","","",""));

        theLoaiDAO theLoaiDAO = new theLoaiDAO();
//            theLoaiDAO.insertTL(new theLoai("TL006","TL6", "Theloai6"));
//            theLoaiDAO.updateTL(new theLoai("TL006","Thể Loại 6", "Thể loại 006"));
//            theLoaiDAO.deleteTL(new theLoai("TL006","",""));
    }

}
