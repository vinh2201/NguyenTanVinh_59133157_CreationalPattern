/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2_BuilderPattern;

/**
 *
 * @author potte
 */
public class BT2_BuilderPattern_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder s = new MyStringBuilder.Builder("nguyentanvinh").addString("59cntt3").addFloat(1999).addBool(true).build();
        s.xuatChuoi();
    }
    
}
