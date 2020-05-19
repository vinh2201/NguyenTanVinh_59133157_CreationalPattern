/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3_FactoryMethodSingleton;

/**
 *
 * @author potte
 */
public class Rectangle extends Shape{
    private static Rectangle instance;
    
    public static Rectangle createInstance() {
        
        if(instance == null) {
            instance = new Rectangle();
        }
        return instance;
    }
    
    public Rectangle() {
    }

    @Override
    public String draw() {
        return "Brush: "+getBrush()+"\nPaper: "+getPaper()+"\nFrame: "+getFrame();
    }
}
