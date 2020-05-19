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
public class CTHD {
    private String tenSP;
    private int soLuong;
    private double donGia;
    private String chietKhau;

    public CTHD(CTHDBuilder builder) {
        this.tenSP = builder.tenSP;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
        this.chietKhau = builder.chietKhau;
    }

    @Override
    public String toString() {
        return "HOÁ ĐƠN CHI TIẾT: " + "\nTên sản phẩm = " + tenSP + "\nSố lượng = " + soLuong + "\nĐơn giá = " + donGia + "\nChiết khấu = " + chietKhau;
    }

    public static class CTHDBuilder {
        
        private String tenSP;
        private int soLuong;
        private double donGia;
        private String chietKhau;

        public CTHDBuilder() {
        }

        public CTHDBuilder addTenSP(String tenSP) {
            
            this.tenSP = tenSP;
            return this;
        }
        
        public CTHDBuilder addSoLuong(int soLuong) {
        
            this.soLuong = soLuong;
            return this;
        }
        
        public CTHDBuilder addDonGia(double donGia) {
            
            this.donGia = donGia;
            return this;
        }
        
        public CTHDBuilder addChietKhau(String chietKhau) {
        
            this.chietKhau = chietKhau;
            return this;
        }
        
        public CTHD build() {
        
            return new CTHD(this);
        }
    }
}
