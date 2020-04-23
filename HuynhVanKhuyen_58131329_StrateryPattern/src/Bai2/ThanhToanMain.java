/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Khuyen
 */
public class ThanhToanMain {
    public static void main(String[] args) {
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
        
        gh1.setHinhThucTT(new ThanhToanOnline());
        gh2.setHinhThucTT(new ThanhToanCOD());
        
        HangHoa hh1 = new HangHoa("thit heo", 85000, "ngon bo re");
        HangHoa hh2 = new HangHoa("may quat", 400000, "tiet kiem dien ");
        HangHoa hh3 = new HangHoa("Tivi", 1000000, "Sam sum sieu mong ");
        HangHoa hh4 = new HangHoa("Chai nuoc suoi", 12000, "Aquatina qua tang tu thien nhien");
        
        System.out.println("Gio hang 1");
        gh1.them(hh4);
        gh1.inDS();
        System.out.println("\nTong tien hang: " + gh1.tinhTienHang() + "\nTien khach hang tra: " + gh1.tinhTienTra());
        
        System.out.println("Gio hang 2");
        gh2.them(hh2);
        gh2.them(hh1);
        gh2.them(hh3);
        gh2.inDS();
        System.out.println("\nTong tien hang: " + gh2.tinhTienHang() + "\nTien khach hang tra: " + gh2.tinhTienTra());
    }
}
