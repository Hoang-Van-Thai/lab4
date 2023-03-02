/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiTrenLop;

/**
 *
 * @author ADMIN
 */
public class HinhTru extends HinhTron{
    private float chieuCao;

    public HinhTru() {
    }
    public void nhapChieuCao(){
        System.out.println("Nhap chieu cao: ");
        chieuCao=scanner.nextFloat();
    }
    public void tinhTheTich(){
        float v=chieuCao*this.getBanKinh()*this.getBanKinh()*this.PI;
        this.setTheTich(v);
    }
}
