/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKho2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class KhuVuc extends Kho{
    private String maKV , tenKV ;

    public KhuVuc() {
    }

    public KhuVuc(String maKV, String tenKV) {
        this.maKV = maKV;
        this.tenKV = tenKV;
    }

    public String getMaKV() {
        return maKV;
    }

    public void setMaKV(String maKV) {
        this.maKV = maKV;
    }
    Kho kho = new Kho();
    Scanner sc= new Scanner(System.in);
    int a;
   // HangHoa hh = new HangHoa();
   public void nhapKV(int n) {
      // HangHoa hh = new HangHoa();
       System.out.println("nhap so luong kho");
       a= sc.nextInt();
       super.nhapKho(a);
       sc.nextLine();
       for(int i=0; i<a; i++) {
           System.out.println("Thong tin kho thu:"+(i+1));
           for(int j=0; j<n; j++) {
        
                System.out.print("Ma khu vuc: ");
                maKV= sc.nextLine();
                System.out.print("Ten khu vuc:");
                tenKV= sc.nextLine();   
               // hh.nhapHH();
            }
       }
       
   }
   public void xuatKV(int n) {
       System.out.println("THONG TIN KHO");
       super.xuatKho(a);
       float dt = this.dienTich(a)/n ;
       System.out.println("THong tin chi tiet cua tung khu vuc");
       System.out.println();
       for(int i=0; i<a; i++) {
           System.out.println("thong tin cua khuc vuc: "+(i+1));
           for(int j=0; j<n; j++){
           
                System.out.println("ma khu vuc: "+maKV);
                System.out.println("ten khu vuc: "+tenKV);
                System.out.println("dien tich cua khu vuc: "+dt);
                //hh.xuatHH();
                //System.out.println();
           }
       }
   }
}
