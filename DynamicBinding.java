class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        super.eat();
        System.out.println("dog is eating...");
    }

}

public class DynamicBinding {
    public static void main(String args[]){  
         Animal a=new Dog();  
         a.eat();  
        }
}
