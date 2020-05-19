/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1_BuilderPattern;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author potte
 */
public class HoaDon {
    private String maHD;
    private String ngayBan;
    private String tenKH;
    
    List<CTHD> listCTHD = new ArrayList<>();

    public HoaDon(HoaDonBuilder builder) {
        this.maHD = builder.maHD;
        this.ngayBan = builder.ngayBan;
        this.tenKH = builder.tenKH;
    }
    
    public void addCTHD(CTHD cthd) {
        
        listCTHD.add(cthd);
    }

    @Override
    public String toString() {
        return "HOÁ ĐƠN THANH TOÁN:\n\n" + "Mã hóa đơn = " + maHD + "\nNgày bán = " + ngayBan + "\nTên khách hàng=" + tenKH ;
    }
    
    public void xuatHoaDon() {
    
        System.out.println(toString());
        for(CTHD item: listCTHD) {
            
            System.out.println(item.toString());
        }
    }

    
    public static class HoaDonBuilder {
    
        private String maHD;
        private String ngayBan;
        private String tenKH;

        public HoaDonBuilder() {
        }
        
        public HoaDonBuilder addMaHD(String maHD) {
        
            this.maHD = maHD;
            return this;
        }
        
        public HoaDonBuilder addNgayBan(String ngayBan) {
        
            this.ngayBan = ngayBan;
            return this;
        }
        
        public HoaDonBuilder addTenKH(String tenKH) {
        
            this.tenKH = tenKH;
            return this;
        }
        
        public HoaDon build() {
        
            return new HoaDon(this);
        }
    }
}
