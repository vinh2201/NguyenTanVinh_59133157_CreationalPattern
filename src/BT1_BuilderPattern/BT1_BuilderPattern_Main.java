/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1_BuilderPattern;

/**
 *
 * @author potte
 */
public class BT1_BuilderPattern_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hd = new HoaDon.HoaDonBuilder().addMaHD("TKS025")
                .addNgayBan("12/09/2019")
                .addTenKH("Nguyễn Tấn VĨnh")
                .build();
        CTHD cthd1 = new CTHD.CTHDBuilder().addTenSP("Laptop -  Dell Inspiron")
                .addSoLuong(2)
                .addDonGia(20000000)
                .addChietKhau("10%")
                .build();
        CTHD cthd2 = new CTHD.CTHDBuilder().addTenSP("Điện thoại Samsung")
                .addSoLuong(8)
                .addDonGia(15000000)
                .addChietKhau("10%")
                .build();
        hd.addCTHD(cthd2);
        hd.addCTHD(cthd1);
        hd.xuatHoaDon();
    }
    
}
