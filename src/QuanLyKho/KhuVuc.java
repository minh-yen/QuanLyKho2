/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKho;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class KhuVuc extends Kho{
    private String maKv;
    private String tenKv;

    public KhuVuc() {
    }

    public KhuVuc(String maKv, String tenkv) {
        this.maKv = maKv;
        this.tenKv = tenKv;
    }

    public String getMaKv() {
        return maKv;
    }

    public void setMaKv(String maKv) {
        this.maKv = maKv;
    }
    Scanner sc = new Scanner(System.in);
   // ArrayList<Kho> list = new ArrayList<>();
    public void nhapKV() {
//            System.out.println("so luong khu vuc: ");
//            int n = sc.nextInt();
//            for(int i=0; i<n;i++){
//                
//            }
            System.out.println("ma khu vuc la:");
            maKv = sc.nextLine();
            System.out.println("Ten cua moi khu vuc: ");
            tenKv = sc.nextLine();
        
    }
    public void xuatKV() {
            super.xuatKho();
           System.out.println("ma khu vuc:"+maKv);
           System.out.println("ten khu vuc:"+tenKv);
           System.out.println("dien tich: "+tinhS());
    }
    @Override
    public float tinhS(){
        float sKv = this.getS()/this.getSoLuongKV() ;
        return sKv ;
    }
}