/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiTrenLop;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HinhTron extends HinhHoc{
    private float banKinh;

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }    

    public HinhTron() {
    }
    public void nhapBK(){
        System.out.println("Nhap ban kinh: ");
        banKinh=scanner.nextFloat();
    }
    public void tinhChuVi() {
        float cv= (2*PI*banKinh);
        this.setChuVi(cv);      
    }
    public void tinhDienTich(){
        float dt=(float) (PI*banKinh*banKinh);
        this.setDienTich(dt);
    }
}
