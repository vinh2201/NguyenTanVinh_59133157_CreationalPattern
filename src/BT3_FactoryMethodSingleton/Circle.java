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
public class Circle extends Shape{
    private static Circle instance;
    
    public static Circle createInstance() {
        
        if(instance == null) {
            instance = new Circle();
        }
        return instance;
    }

    public Circle() {
    }
    
    @Override
    public String draw() {
    
        return "Brush: "+getBrush()+"\nPaper: "+getPaper()+"\nFrame: "+getFrame();
    }
}
