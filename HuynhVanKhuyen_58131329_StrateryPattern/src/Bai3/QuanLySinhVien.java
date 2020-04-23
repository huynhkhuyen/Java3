/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Khuyen
 */
public class QuanLySinhVien {
    ISoSanh SS;
    ArrayList<SinhVien> dS = new ArrayList<>();

    public ISoSanh getSS() {
        return SS;
    }

    public void setSS(ISoSanh SS) {
        this.SS = SS;
    }

    
    public void them(SinhVien sv){
        dS.add(sv);
    }
    public void sapXep(){
        for(int i = 0; i <dS.size(); i++)
            for(int j = i + 1; j <dS.size(); j++)
                if(SS.soSanh(dS.get(i), dS.get(j)) > 0)
                    Collections.swap(dS, i, j);  
    }
    public void inDS(){
        for(int i = 0; i <dS.size(); i++)
        {
            System.out.println("\n Ho Ten " + dS.get(i).getHoTen() + " Ngay sinh " + dS.get(i).getNgaySinh() + " diem " + dS.get(i).getDiemTB());
        }
    }
}