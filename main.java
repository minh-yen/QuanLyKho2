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
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so luong khu vuc: ");
        int n = sc.nextInt();
       KhuVuc kv = new KhuVuc();
//       HangHoa hh= new HangHoa();
//            hh.nhapHH();
//            hh.xuatHH();
          kv.nhapKV(n);
          kv.xuatKV(n);
////        System.out.println("ban muon de hang hoa vao kho nao: ");
////        int k = sc.nextInt();
//        System.out.println("ba muon de vao khu vuc nao cua kho: ");
//        int khu = sc.nextInt();
//        
    }
}
