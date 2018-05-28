/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKho;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HangHoa extends KhuVuc{
    private String maHH;
    private String tenHH;
    private int gia;

    public HangHoa() {
    }

    public HangHoa(String maHH, String tenHH, int gia) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.gia = gia;
    }
    Scanner sc= new Scanner(System.in);
    ArrayList<KhuVuc> list = new ArrayList<>(); 
    KhuVuc kv = new KhuVuc();
    public void nhapHH() {
            kv.nhapKV();
            list.add(kv);
            System.out.println("Ma cua hang hoa: "); 
            maHH = sc.nextLine();
            System.out.println("Ten hang hoa la:");
            tenHH = sc.nextLine();
            System.out.println("Gia cua sp la: ");
            gia = sc.nextInt();
        
    }
    public void xuatHH() {
            for(int i=0; i<list.size(); i++) {
                super.nhapKV();
                System.out.println("Ma cua hang hoa: "+maHH); 
                System.out.println("Ten hang hoa la:"+tenHH);
                System.out.println("Gia cua sp la: "+gia);
       
            }
    }
}
