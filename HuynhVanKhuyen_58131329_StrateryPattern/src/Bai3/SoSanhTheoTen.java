/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Khuyen
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.getHoTen().compareToIgnoreCase(o2.getHoTen()) > 0)
            return 1;
        else
           if(o1.getHoTen().compareToIgnoreCase(o2.getHoTen()) < 0)
              return -1;
        else
               return 0;
      }
    
}