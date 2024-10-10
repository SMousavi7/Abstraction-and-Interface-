class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println("The Dog is eating meat");
    }
}
class cat extends Animal
{

}


public class Main {
    public static void main(String[] args) {
        Animal d = new Dog(); //upcasting
        Animal c = new cat(); //upcasting
        d.eat();
        c.eat();
    }
}
