/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_thuctap;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public abstract class NhanVien {
    public String ma ;
    public String hoTen ;
    public float luong;
    public abstract float tinhLuong();
    Scanner sc = new Scanner(System.in);
    public NhanVien() {
        super();
    }

    public NhanVien(String ma, String hoTen, float luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    
    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    
    public void NhapTT() {
        System.out.println("ma cua nhan vien:");
        ma= sc.nextLine();
        System.out.println("Ho ten la: ");
        ma= sc.nextLine();
        System.out.println("nhap luong");
        luong = sc.nextFloat();
    }
   public void xuatTT() {
       System.out.println("Ma: "+this.ma+ "Ho Ten: "+this.hoTen);
    }


    
}
