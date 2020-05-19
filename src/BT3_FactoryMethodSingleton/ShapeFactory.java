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
public class ShapeFactory {
    private static ShapeFactory instance; 
    protected ShapeFactory()
    { 
    }
    public static ShapeFactory createInstance()
                                                
    {
        if(instance==null)
        {
            instance=new ShapeFactory();
        }
        return instance;
    }
    
    public Shape createShape(ShapeType shapeType)
    { 
        switch(shapeType)
        {
            case rectangle:  return new Rectangle(); 
            case triangle: return new Triangle();
            case circle: return new Circle();
            default: return null;
        } 
         
    }
}
