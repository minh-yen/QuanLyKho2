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
public class Tester extends NhanVien {
   private int soGio;

    public Tester() {
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }
    public void nhapT() {
        super.NhapTT();
        System.out.println("So gio lam them cua nhan vien");
        soGio = sc.nextInt();
    }
    public void xuatT(){
        super.xuatTT();
        System.out.println("Luong cua nhan vien: "+tinhLuong());
    }
    @Override
    public float tinhLuong() {
        if(this.soGio>0) {
            float k = (float) (super.getLuong()+ super.getLuong()*200);
            super.setLuong(k);
        }
        return super.getLuong();
    }
    
}

   