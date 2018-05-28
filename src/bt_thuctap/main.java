/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_thuctap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class main {
    static ArrayList<Programmer> list1 = new ArrayList<>();
    static ArrayList<Tester> list2 = new ArrayList<>();
    static Scanner sc= new Scanner(System.in);
    public static void nhapProgrammer() {
        int n;
        System.out.println("Nhap so luong nhan vien");
        n= sc.nextInt() ;
        Programmer pro = new Programmer();
        pro.nhapPro();
        list1.add(pro);
    }
    public void xuatProgrammer() {
        for(int i=0;i<list1.size(); i++) {
            list1.get(i).xuatPro();
        }
    }
    public static void soLoiNho() {
        System.out.println("Nhan vien co so loi duoi 5 la:");
        int dem=0;
        for(int i=0; i<list1.size(); i++) {
            if(list1.get(i).getSoLoi()<5)
                dem++;
        }
        System.out.println(dem);
    }
    public static void nhapTest(){
        System.out.println("So luong nhan vien Test:");
        int n= sc.nextInt();
        Tester test = new Tester();
        test.nhapT();
        list2.add(test);
    }
    public static void xuatTest(){
        for(int i=0; i<list2.size(); i++) {
            list2.get(i).xuatT();
        }
    }
    public static void soGioCaoNhat() {
        System.out.println("han vien co so gio cao nhat");
        int max= list2.get(0).getSoGio();
        int temp=0;
        for(int i=0; i<list2.size(); i++) {
            if(list2.get(i).getSoGio()>max) {
                max = list2.get(i).getSoGio();
                temp=i ;
            }
        }
        list2.get(temp).xuatT();
    }
}
