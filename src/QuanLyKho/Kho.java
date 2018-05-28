/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKho;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public abstract class Kho {
    private String ten, ma ;
    private int dai, rong;
    private int soLuongKV;
    private float s; 
    
   public abstract float tinhS();
   public Kho() {
    }

    public Kho(String ten, int dai, int rong, String ma, int soLuongKV) {
        this.ten = ten;
        this.dai = dai;
        this.rong = rong;
        this.ma = ma;
        this.soLuongKV = soLuongKV;
    }

    public float getS() {
        return s;
    }

    public void setS(float s) {
        this.s = s;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getSoLuongKV() {
        return soLuongKV;
    }

    public void setSoLuongKV(int soLuongKV) {
        this.soLuongKV = soLuongKV;
    }
    
    Scanner sc = new Scanner(System.in);
    int n;
    
    public void nhapKho() {
         
            System.out.println("ma kho:");
            ma =sc.nextLine();
            System.out.println("ten kho: ");
            ten=sc.nextLine();
            System.out.println("Chieu dai cua kho la: ");
            dai = sc.nextInt();
            System.out.println("Chieu rong kho");
            rong = sc.nextInt();
            System.out.println("So luong khu vuc");
            soLuongKV = sc.nextInt();
        
    }
    public void xuatKho() {
        
        System.out.println("ma kho: "+ma +" ten kho:  "+ten+" So luong khu vuc: "+soLuongKV+" dien tich moi khu: "+dienTich());
         
    }
    public float dienTich() {
        s = (dai*rong)/soLuongKV ;
        return s;
    }
   
}
