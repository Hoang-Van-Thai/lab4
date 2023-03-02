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
public class HinhHoc {
    final float PI= (float)3.14;
    private String ten;
    private float chuVi;
    private float dienTich;
    private float theTich;
    Scanner scanner= new Scanner(System.in);
    public HinhHoc(){
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getChuVi() {
        return chuVi;
    }

    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public float getTheTich() {
        return theTich;
    }

    public void setTheTich(float theTich) {
        this.theTich = theTich;
    }
    
    public void xuatTen(){
        System.out.println(ten);
    }
    public void inChuVi(){
        System.out.println("Chu vi la: "+chuVi);
    }
    public void inDienTich(){
           System.out.println("Dien tich la: "+dienTich);
    }
    public void inTheTich(){
        System.out.println("The tich la: "+theTich);
    }
    
    
}
