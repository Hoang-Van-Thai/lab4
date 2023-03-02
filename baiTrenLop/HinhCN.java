/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiTrenLop;

/**
 *
 * @author ADMIN
 */
public class HinhCN  extends HinhHoc{
    private float dai;
    private float rong;

    public HinhCN() {
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }
    
    public void nhapChieuDai(){
        System.out.println("Nhap chieu dai");
        dai=scanner.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.println("Nhap chieu rong");
        rong=scanner.nextFloat();
    }
    public void tinhChuVi(){
        float cv=(dai+rong)*2;
        this.setChuVi(cv);
    }
    public void tinhDienTich(){
        float dt=dai*rong;
        this.setDienTich(dt);
    }
    
}
