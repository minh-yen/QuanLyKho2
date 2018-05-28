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
public class main {
//    static ArrayList<Kho> list1 = new ArrayList<>();
    static ArrayList<KhuVuc> list2 = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void nhapKhuVuc() {
        
           // KhuVuc kv = new KhuVuc();
//           System.out.println("so luong khu vuc");
//            int n= sc.nextInt();
            for(int i=0; i<getsoLuongKV(); i++) {
                KhuVuc kv1 = new KhuVuc();
                kv1.nhapKV();
                list2.add(kv1);
            }
    
    }
    public static void xuatKhuVuc() {
        for(int i=0 ;i<list2.size(); i++) {
            list2.get(i).xuatKV();
        }
    }
    public static void main(String[] args) {
        nhapKhuVuc();
        xuatKhuVuc();
    }

    private static int getsoLuongKV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
