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
public class chia implements ITinh{

    public chia() {
    }

    @Override
    public float tinh(float a, float b) {
        if(b ==0)
            return 99999;
       return a/b;
}
