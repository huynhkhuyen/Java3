/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Khuyen
 */
public class tinhToanMain {
    public static void main(String[] args) {
        context c = new context();
        c.setTinhToan(new cong());
        System.out.println("5 + 6 = " + c.tinh(5,6));
        c.setTinhToan(new chia());
        System.out.println("6 chia 0 = " + c.tinh(6, 0));
    }
}
