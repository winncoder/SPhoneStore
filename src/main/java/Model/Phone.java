/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class Phone {
   protected int id, price;
   protected String name;
   protected Object brand, origin;

    Phone() {}

    public Phone(int id, String name, Object brand, int price, Object origin) {
        this.id = id;
        this.name = name;        
        this.brand = brand;
        this.price = price;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Object getBrand() {
        return brand;
    }

    public Object getOrigin() {
        return origin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(Object brand) {
        this.brand = brand;
    }

    public void setOrigin(Object origin) {
        this.origin = origin;
    }
    
    public void Save(FileOutputStream fout){
        try {
            String s = id +", " + name  + ", " + brand + ", " + price + ", " + origin +"\n";
            byte b[] = s.getBytes(); 		// Chuyển s thành 1 byte để ghi dữ liệu
            fout.write(b);
        } catch (Exception e) {
            System.out.println("Save File Errol"+ e);
        }
    } 
    
}
