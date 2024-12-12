package ua.edu.chmnu.ce.c2.jid;

interface Animal {
    void sound();
}


interface Vehicle {
    void drive();
}


interface Action {
    void performAction();
}

public class InterfaceDemo {


    class Dog implements Animal {
        @Override
        public void sound() {
            System.out.println("Woof! Woof!");
        }
    }

    public static void main(String[] args) {

        InterfaceDemo demo = new InterfaceDemo();
        Animal myDog = demo.new Dog();
        myDog.sound();

        // Using anonymous class for Vehicle interface
        Vehicle myCar = new Vehicle() {
            @Override
            public void drive() {
                System.out.println("The car is driving!");
            }
        };
        myCar.drive(); //


        Action jumpAction = new Action() {
            @Override
            public void performAction() {
                System.out.println("Jumping in the air!");
            }
        };
        jumpAction.performAction();


        Animal cat = new Animal() {
            @Override
            public void sound() {
                System.out.println("Meow! Meow!");
            }
        };
        cat.sound();
    }
}
