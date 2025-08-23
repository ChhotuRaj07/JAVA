package Inheritance;

// An abstract class can have both abstract and regular methods:

abstract class Animal {
    public abstract void animalsound();
    public void sleep() {
         System.out.println("Zzz");
    }
}

class pig extends Animal {
    public void animalsound() {
        System.out.println("The Pig says : wee wee");
    }
}

class Abstraction {
public static void main(String[] args) {
    pig mypig = new pig();
    mypig.animalsound();
    mypig.sleep();
}
    
}
