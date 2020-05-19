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
public class MyStringBuilder {
    String str;

    public MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }
    
    public void xuatChuoi() {
        
        System.out.println(this.toString());
    }

    public MyStringBuilder() {
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + '}';
    }
    
    public static class Builder {
    
        private String str;

        public Builder(String str) {
            this.str = str;
        }
        
        public Builder addString(String s) {
            str = str + s;
            return this;
        }
        
        public Builder addFloat(float f) {
            str = str + Float.toString(f);
            return this;
        }
        
        public Builder addBool(boolean b) {
            str = str + Boolean.toString(b);
            return this;
        }
       
        public MyStringBuilder build() {
            
            return new MyStringBuilder(this);
        }
    }
}
