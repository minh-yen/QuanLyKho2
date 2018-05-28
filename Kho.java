/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKho2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Kho {
   private String ma, ten ;
   private int dai, rong ;
   private float s ;
  // public abstract float dienTich() ;

    public Kho() {
    }

    public Kho(String ma, String ten, int dai, int rong, float s) {
        this.ma = ma;
        this.ten = ten;
        this.dai = dai;
        this.rong = rong;
        this.s = s;
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
    
    Scanner sc = new Scanner(System.in);
    
   public void nhapKho(int n) {
       System.out.print("chieu dai: ");
       dai= sc.nextInt();
       System.out.print("Chieu rong:");
       rong = sc.nextInt();
       sc.nextLine();
       for(int i=0; i<n; i++) {
            System.out.print("ma kho: "); 
            ma= sc.nextLine();
            System.out.print("ten kho: ");
            ten = sc.nextLine();
       }
   }
   public void xuatKho(int n) {
       for(int i=0; i<n; i++) {
            System.out.println("ma kho: "+ma);
            System.out.println("ten kho: "+ten);
            System.out.println("Dien tich: "+dienTich(n));
       }
   }
   public float dienTich(int n) {
       return s= dai*rong/n ;
   }
}
