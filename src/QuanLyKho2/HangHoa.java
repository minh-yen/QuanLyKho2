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
public class HangHoa {
    private String maHH, tenHH;
    private int gia ;

    public HangHoa() {
    }

    public HangHoa(String maHH, String tenHH, int gia) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.gia = gia;
    }
    Scanner sc = new Scanner(System.in);
    public void nhapHH(){
        System.out.print("ma hang hoa: "); maHH= sc.nextLine(); 
        System.out.print("ten hang hoa:"); tenHH= sc.nextLine();
        System.out.print("gia cua hang hoa: "); gia= sc.nextInt();
    }
    public void xuatHH() {
        System.out.println("ma hang hoa: "+maHH); 
        System.out.println("ten hang hoa:"+tenHH);
        System.out.println("gia cua hang hoa: "+gia);
    }
}
