/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Khuyen
 */
public class SinhVienMain {
    public static void main(String[] args) throws ParseException {
        QuanLySinhVien dSSV = new QuanLySinhVien();
        SinhVien SV1 = new SinhVien("Huynh Van Khuyen", new SimpleDateFormat("dd/MM/yyyy").parse("21/11/1995"),  7);
        SinhVien SV2 = new SinhVien("Phan Trong Nghia", new SimpleDateFormat("dd/MM/yyyy").parse("2/1/1998"),  6);
        SinhVien SV3 = new SinhVien("Mai Duong Thao", new SimpleDateFormat("dd/MM/yyyy").parse("2/4/1998"),  8);
        SinhVien SV4 = new SinhVien("Ngo Quang Tien", new SimpleDateFormat("dd/MM/yyyy").parse("2/1/1998"),  5);
        dSSV.them(SV2);
        dSSV.them(SV1);
        dSSV.them(SV4);
        dSSV.them(SV3);
        dSSV.setSS((ISoSanh) new SoSanhTheoTen());
        System.out.println("\n danh sach da sap xep theo ten\n" );
        dSSV.sapXep();
        dSSV.inDS();
        dSSV.setSS((ISoSanh) new SoSanhTheoDiem());
        System.out.println("\n danh sach da sap xep theo diem\n" );
        dSSV.sapXep();
        dSSV.inDS();
        
        
        
    }
}
