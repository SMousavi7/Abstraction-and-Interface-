class Animal
{
    void eat()
    {
        System.out.println("the animal is eating.");
    }
    void eat(String food)
    {
        System.out.println("the animal is eating " + food + ".");
    }
    void eat(String food, int time)
    {
        System.out.println("the animal is eating "+ food
                + " for " + time + " minutes.");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.eat("meat");
        a.eat("meat", 25);
    }
}
