// package Inheritance;

// class Animal {
//    void sound() {
//         System.out.println("Animal Makes a Sound");
//     } 
// }
    
// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog MAkes a Sound :");
//     }
// }

// class Cat extends Animal {
//     void sound() {
//         System.out.println("Cat also meow...");
//     }
// }

// public class Polymorphism {
//  public static void main(String[] args) {

//     Cat c = new Cat();
//     c.sound();

//  }
// }

package Inheritance;

class Animal {
    void print() {
        System.out.println("Animal makes a sound");
    } 
}

class Dog extends Animal {
    void print() {
        System.out.println("Dog makes a sound");
    }
}

class Cat extends Animal {
    void print() {
        System.out.println("Cat also meows...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.print();   // Output: Dog makes a sound

        a = new Cat();
        a.print();   // Output: Cat also meows...

        // Direct object call
        Cat c = new Cat();
        c.print();   // Output: Cat also meows...
    }
}
