class vehicle{
    void Driving()
    {
        System.out.println("vehicle is going...");
    }
}

class car extends vehicle
{
    void Driving()
    {
        System.out.println("car is going...");
    }
}

public class Main {
    public static void main(String[] args) {
        vehicle v = new car();
        v.Driving();
    }
}
