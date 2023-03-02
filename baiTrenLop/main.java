/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiTrenLop;

/**
 *
 * @author ADMIN
 */
public class main {
     public static void main(String[] args) {
        HinhVuong hv=new HinhVuong();
        hv.nhapCanh();
        hv.tinhChuVi();
        System.out.println(hv.getChuVi());
        hv.tinhDienTich();
        System.out.println(hv.getDienTich());
        HinhTru ht =new HinhTru();
        ht.nhapChieuCao();
        ht.nhapBK();
        ht.tinhChuVi();
        ht.tinhTheTich();
        System.out.println(ht.getTheTich());
    }
}
