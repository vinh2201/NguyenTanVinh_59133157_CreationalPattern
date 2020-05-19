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
public class BT3_FactoryMethodSingleton_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory factory= ShapeFactory.createInstance();
        
        Shape rectangle= factory.createShape(ShapeType.rectangle);
        rectangle.setBrush("Tủ góc");
        rectangle.setFrame("Cao 2,15m, rộng 2,08m, sâu 0,60m ");
        rectangle.setPaper("A2");
        
        Shape triangle= factory.createShape(ShapeType.triangle);
        triangle.setBrush("Tủ bày đồ");
        triangle.setFrame("Rộng ngang: 1,18 m, sâu: 0,34 m, cao: 1,79m");
        triangle.setPaper("A3");
        
        Shape circle= factory.createShape(ShapeType.circle);
        circle.setBrush("Tủ chạm gỗ trắc");
        circle.setFrame("Rộng 0,91m, sâu 0,25m, cao 1,09m");
        circle.setPaper("A3");
        
        System.out.println("Loại tủ:\n"+rectangle.draw()+"\n");
        System.out.println("Loại tủ:\n"+triangle.draw()+"\n");
        System.out.println("Loại tủ:\n"+circle.draw()+"\n");
    }
    
}
