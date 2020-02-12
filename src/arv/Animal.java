package arv;

public class Animal {

    String type;
    String food;
    int age;
    double price;

    Animal(String type, String food, int age, double price) {
        super();
        this.type = type;
        this.food = food;
        this.age = age;
        this.price = price;

    }

    public void makeNoise() {
    }

    
//    {
////        System.out.println("Super class Animal makes noise");
//    }

    @Override
    public String toString() {
        return "type=" + type + ", food=" + food + ", age=" + age + ", price=" + price;
    }

}
