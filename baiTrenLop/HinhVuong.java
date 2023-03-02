/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiTrenLop;

/**
 *
 * @author ADMIN
 */
public class HinhVuong extends HinhCN {

    public HinhVuong() {
    }
    public void nhapCanh(){
        System.out.println("Nhap canh cua hinh vuong: ");
        float tam=scanner.nextFloat();
        this.setDai(tam);
        this.setRong(tam);
    }
    
}
