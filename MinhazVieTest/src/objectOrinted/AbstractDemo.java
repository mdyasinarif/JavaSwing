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
    private String color;
    private int hight;
    private int weight;
    abstract void display(String color, int hight, int weight);
}
class Dog extends Animal {
  
    @Override
    void display(String color, int hight, int weight) {
        System.out.println("This is Dog");
        System.out.println("Color :" + color);
        System.out.println("Hight :" + hight);
        System.out.println("Weight :" + weight);
    }

}
class Cat extends Animal {
    
    @Override
    void display(String color, int hight, int weight) {
        System.out.println("This is Cat");
        System.out.println("Color :" + color);
        System.out.println("Hight :" + hight);
        System.out.println("Weight :" + weight);
    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.display("White", 20, 4);
        cat.display("Black", 20, 40);
    }

}