package main.java.concepts.lambdas.classes;

import main.java.concepts.lambdas.interfaces.Printable;

/**
 *
 * @author Yossijaki
 */
public class Cat implements Printable {
    
    public String name;
    public int age;
    
    public Cat (){}

    public void print() {
        System.out.println("Meow");
    }
}
