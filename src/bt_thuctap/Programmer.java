/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_thuctap;

import java.util.ArrayList;

public class Programmer extends NhanVien{
    private int soLoi;

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    public Programmer() {
    }
    public void nhapPro() {
        super.NhapTT();
        System.out.println("So loi cua programmer");
       soLoi = sc.nextInt();
    }
    public void xuatPro() {
        super.xuatTT();
        System.out.println("Luong cua nhan vien la: "+tinhLuong());
    }
    @Override
    public float tinhLuong() {
        if(this.soLoi<20) {
            float k = (float) (super.getLuong()+ super.getLuong()*0.1);
               super.setLuong(k);
        }
        return super.getLuong();
    }
}

