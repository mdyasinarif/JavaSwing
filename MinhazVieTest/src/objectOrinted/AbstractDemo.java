/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrinted;

/**
 *
 * @author Md Yasin Arif
 */
abstract class Animal {
    abstract void display();
}
class Dog extends Animal {

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    
    private String color;
    private int height;
    private int weight;

    public Dog(String color, int height, int weight) {
        this.color = color;
        this.height = height;
        this.weight = weight;
    }
    
    
    
    @Override
    void display() {
        System.out.println("This is Dog");
        System.out.println("color:"+getColor());
        System.out.println("hight:"+getHeight());
        System.out.println("weight:"+getWeight());
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Blue",1,20);
        Dog dog2 = new Dog("White",2,30);
        
        dog.display();
        dog2.display();
    }

}