package Inheritance;

class Animal1{
    void eat() {
        System.out.println(" Animals eats food...");
    }
}

class Dog extends Animal1 {
    void bark() {
        System.out.println(" Dogs eats food...");
    }
}

class fruit {
    void apple(){
        System.out.println("This is a Fruit Where i eat ");
    }
}

public class Animal {
 public static void main(String[] args) {
    Dog d = new Dog();
    d.eat();
    d.bark();
    
    fruit bite = new fruit();
    bite.apple();

 }
}
